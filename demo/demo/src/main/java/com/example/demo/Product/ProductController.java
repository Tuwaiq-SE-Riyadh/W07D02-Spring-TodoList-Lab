package com.example.demo.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "products")
public class ProductController {

    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(@RequestParam(required = false) String filter){
        System.out.println(filter);
        return productService.getProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
         return productService.addProduct(product);
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable String id){
        return productService.getProduct(id);

    }

}
