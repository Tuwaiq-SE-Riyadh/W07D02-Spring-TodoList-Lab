package com.example.demo.Product;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public List<Product> getProducts(){

        return  products;
    }

    public Product addProduct(Product product){
        products.add(product);
        return product;
    }

    public String getProduct(String id) {
        return id;
    }
}
