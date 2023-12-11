package org.example.service;

import org.example.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> listar();

    Optional<Producto> porId(Long id);
}

