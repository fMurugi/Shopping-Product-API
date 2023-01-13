package com.fiona.shoppingApi;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public ProductModel getProduct(Integer id){
        return productRepository.getById(id);
    }
    public  void delete(Integer id){
        productRepository.deleteById(id);
    }
}
