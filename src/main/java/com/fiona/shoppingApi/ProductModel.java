package com.fiona.shoppingApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Id;

@Entity
@Table(name="product")
public class ProductModel {
    @Id
    @GeneratedValue
    private Integer Id;
    private String name;
    private float price;

    public ProductModel(Integer id, String name, float price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public ProductModel() {
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
