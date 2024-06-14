package com.example.baitapqlkh.service;

import com.example.baitapqlkh.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Bánh ngọt", 10.5, 10));
        products.put(2, new Product(2, "Sữa tươi", 15.8, 20));
        products.put(3, new Product(3, "Nước ngọt", 20.0, 80));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
