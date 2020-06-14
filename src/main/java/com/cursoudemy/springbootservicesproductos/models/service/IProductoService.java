package com.cursoudemy.springbootservicesproductos.models.service;

import com.cursoudemy.springbootservicesproductos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findById(Long id);
}
