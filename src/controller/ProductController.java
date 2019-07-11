package controller;

import model.Product;
import service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public Product[] showProduct() {
        return productService.showProduct();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public Product editProduct(int id, Product product) {
         return productService.editProduct(id, product);
    }

    public Product deleteProduct(int id) {
        return productService.deleteProduct(id);
    }

    public boolean searchProduct(String name) {
        return productService.searchProduct(name);
    }

    public void softProduct() {
        productService.softProduct();
    }
}
