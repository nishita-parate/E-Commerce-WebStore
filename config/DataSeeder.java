package com.ecom.productcatalog.config;


import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
      private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        Category electronics = new Category();
        electronics.setName("Electronics");

         Category clothing = new Category();
         clothing.setName("Clothing");


         Category home= new Category();
         home.setName("Home and Kitchen");

         categoryRepository.saveAll(Arrays.asList(electronics, clothing,home));
         // create product
        Product phone = new Product();
        phone.setName("Smart Phone");
        phone.setDescription("Latest model");
        phone.setImageUrl("https://zitseng.com/uploads/2023/11/DSC08573-600x400.jpg");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop .setName("Laptop ");
        laptop .setDescription("High-Performance laptop for work and play");
        laptop .setImageUrl("https://cdn.mos.cms.futurecdn.net/Es7zVwq7nzRnvtQ4SJMJz9.jpg");
        laptop .setPrice(9999.99);
        laptop .setCategory(electronics);


         Product jacket = new Product();
         jacket .setName("Winter Jacket ");
         jacket .setDescription("Warm and cozy jacket ");
         jacket .setImageUrl("https://firstmfg.com/cdn/shop/files/jada-womens-thunder-denim-jacketwomens-thunder-denim-jacketfirst-manufacturing-company-201014.jpg?v=1722345878&width=600");
         jacket .setPrice(99.99);
         jacket.setCategory(clothing);


         Product blender = new Product();
         blender .setName("Blender ");
         blender.setDescription("High-Speed blender for smoothies and more ");
         blender.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5Vc8pEnX18Shk1rRQqYqRP991W1IjuJxEjg&s");
         blender.setPrice(159.99);
         blender.setCategory(home);

         productRepository.saveAll(Arrays.asList(phone, laptop,jacket,blender));


}
}
