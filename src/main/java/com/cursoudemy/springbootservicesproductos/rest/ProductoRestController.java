package com.cursoudemy.springbootservicesproductos.rest;

import com.cursoudemy.springbootservicesproductos.models.entity.Producto;
import com.cursoudemy.springbootservicesproductos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("api/productos")
@RestController
public class ProductoRestController {
    
    @Autowired
    private IProductoService productoService;

    @GetMapping("/")
    public List<Producto> listar(){
        return productoService.findAll();
    }

    @GetMapping("/{id}/")
    public Producto detalle(@PathVariable Long id){
        return productoService.findById(id);
    }



}
