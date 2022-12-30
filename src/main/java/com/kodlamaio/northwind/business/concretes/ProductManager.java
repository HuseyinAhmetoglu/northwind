package com.kodlamaio.northwind.business.concretes;

import com.kodlamaio.northwind.business.abstracts.ProductService;
import com.kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import com.kodlamaio.northwind.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
