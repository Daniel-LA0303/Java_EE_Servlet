package org.example.service;

import org.example.Exceptions.ServiceJDBCException;
import org.example.models.Usuario;
import org.example.repository.UsuarioRepository;
import org.example.repository.UsuarioRepositoryImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(Connection connection){
        this.usuarioRepository = new UsuarioRepositoryImpl(connection);
    }

    @Override
    public Optional<Usuario> login(String username, String password) {
        try{
            return Optional.ofNullable(usuarioRepository.porUsername(username))
                    .filter(usuario -> usuario.getPassword().equals(password));
        }catch (SQLException throwables){
            throw new ServiceJDBCException(throwables.getMessage(), throwables.getCause());
        }
    }
}
