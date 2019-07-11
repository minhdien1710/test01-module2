package repository;

import model.Product;

public interface GeneralRepository<T> {
    T[] showProduct();
    void addProduct(T t);
    Product editProduct(int id, T t);
    Product deleteProduct(int id);
    boolean searchProduct(String name);
    void softProduct();
}
