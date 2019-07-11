package service;

import model.Product;
import repository.ProductRepository;

public class ProductService implements GeneralService<Product>{
    ProductRepository productRepository = new ProductRepository();
    @Override
    public Product[] showProduct() {
        return productRepository.showProduct();
    }

    @Override
    public void addProduct(Product product) {
         productRepository.addProduct(product);
    }

    @Override
    public Product editProduct(int id, Product product) {
        return productRepository.editProduct(id, product);
    }

    @Override
    public Product deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }

    @Override
    public boolean searchProduct(String name) {
        return productRepository.searchProduct(name);
    }

    @Override
    public void softProduct() {
        productRepository.softProduct();
    }
}
