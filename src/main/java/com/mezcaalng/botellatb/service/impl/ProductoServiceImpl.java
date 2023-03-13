package com.mezcaalng.botellatb.service.impl;

import com.mezcaalng.botellatb.model.Producto;
import com.mezcaalng.botellatb.repository.ProductoRepository;
import com.mezcaalng.botellatb.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProducts() {
        List<Producto> products = new ArrayList<>();
        productoRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Producto findProductById(Long id) {
        return null;
    }

    @Override
    public Producto findProductByName(String name) {
        return null;
    }

    @Override
    public void addProduct(Producto product) {

    }

    @Override
    public void updateProduct(Long id, Producto product) {

    }

    @Override
    public void deleteProduct(Long id) {

    }
}
