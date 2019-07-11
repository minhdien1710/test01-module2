package repository;

import model.Product;

public class ProductRepository implements GeneralRepository<Product> {
    Product[] listProduct = new Product[10];

    {
        listProduct[0] = new Product(1, "Asus", 10, true);
        listProduct[1] = new Product(2, "Macbook", 30, true);
        listProduct[2] = new Product(3, "DELL", 12, false);
        listProduct[3] = new Product(4, "msi", 20, true);

    }

    @Override
    public Product[] showProduct() {
        return listProduct;
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < 10; i++) {
            if (listProduct[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public void addProduct(Product product){
        int size = getSize();
        listProduct[size] = product;
    }



    @Override
    public Product editProduct(int id, Product product) {
        listProduct[id] = product;
        return listProduct[id];
    }

    @Override
    public Product deleteProduct(int id) {
        Product temp = listProduct[id];
        for (int i = 0; i < getSize(); i++) {
            listProduct[i] = listProduct[i + 1];
        }
        return temp;
    }

    @Override
    public boolean searchProduct(String name) {
        for (int i = 0; i<getSize();i++){
            if (listProduct[i].getName().equals(name))
                return false;
        }
        return searchProduct(name);
    }

    @Override
    public void softProduct() {
        for (int i = 0; i < listProduct.length; i++) {
            for (int j = 0; j < listProduct.length; j++) {
                if (listProduct[i].getPrice() > listProduct[j].getPrice()) {
                    Product temp = listProduct[i];
                    listProduct[i] = listProduct[j];
                    listProduct[j] = temp;
                }
            }
        }
    }
}
