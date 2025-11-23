package com.ecom.productcatalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Data
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

  private  Long id;
 // @Setter
  //@Getter
  private String name;

    @OneToMany(mappedBy ="category",
               cascade = CascadeType.ALL,
            fetch =FetchType.LAZY
               )
   private Set<Product> products;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
