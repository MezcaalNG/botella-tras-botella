package com.mezcaalng.botellatb.service;

import com.mezcaalng.botellatb.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> getAllProducts();

    Producto findProductById(Long id);

    Producto findProductByName(String name);

    void addProduct(Producto product);

    void updateProduct(Long id, Producto product);

    void deleteProduct(Long id);
}
