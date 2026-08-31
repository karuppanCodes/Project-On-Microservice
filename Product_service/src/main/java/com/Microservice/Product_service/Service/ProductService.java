package com.Microservice.Product_service.Service;

import com.Microservice.Product_service.Entity.Product;
import com.Microservice.Product_service.Repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;
     public ProductService(ProductRepo productRepo){
        this.productRepo=productRepo;
    }


    //create
    public Product create(Product product){
       return productRepo.save(product);
    }
    //deleteById
    public void deleteById(Long id){
         productRepo.deleteById(id);
    }
    //getByID
    public Product getProductById(Long id){
         return productRepo.findById(id).orElseThrow(()-> new RuntimeException("Id not exist !"));
    }
    //update
    public Product updateProduct(Long id , Product product){
         Product existingProduct =  getProductById(id);

         existingProduct.setProductName(product.getProductName());
         existingProduct.setPrice(product.getPrice());

         return productRepo.save(existingProduct);
    }
    //getAll
    public List<Product> getAllProducts(){
         return productRepo.findAll();
    }
}
