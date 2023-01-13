package com.fiona.shoppingApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    ProductRepository repository;
    @GetMapping("/products")
    public List<ProductModel> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("/products/{id}")
        public ProductModel getProduct(@PathVariable Integer Id){
        return service.getProduct(Id);
    }
//    @DeleteMapping("/products/{id}")
//        public void deleteProduct(@PathVariable Integer Id){
//        Optional<ProductModel> product= Optional.ofNullable(repository.findById(Id));
//
//        product.ifPresent(value->{
//            repository.delete(value);
//        });
//        }

    @PostMapping("/products")
    public ProductModel addProduct(@RequestBody ProductModel product){
        return service.addProduct(product);
    }

}
