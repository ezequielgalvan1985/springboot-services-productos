package com.cursoudemy.springbootservicesproductos.models.repository;

import com.cursoudemy.springbootservicesproductos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
}
