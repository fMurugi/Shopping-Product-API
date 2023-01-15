package com.fiona.shoppingApi;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }
    public ProductModel addProduct(ProductModel product){
        return productRepository.save(product);
    }
    public Optional<ProductModel> getProduct(Integer id){
        return productRepository.findById(id);
    }
    public  void delete(Integer id){
        productRepository.deleteById(id);
    }
}
