package com.cursoudemy.springbootservicesproductos.rest;

import com.cursoudemy.springbootservicesproductos.models.entity.Producto;
import com.cursoudemy.springbootservicesproductos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("api/productos")
@RestController
public class ProductoRestController {

    @Autowired
    private Environment env;

    @Value("${server.port}")
    private Integer port;


    @Autowired
    private IProductoService productoService;

    @GetMapping("/")
    public List<Producto> listar(){

        return productoService.findAll().stream().map(p -> {
            //p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            p.setPort(port);
            return p;
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}/")
    public Producto detalle(@PathVariable Long id){
        Producto p = productoService.findById(id);
        //p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        p.setPort(port);
        return p;
    }



}
