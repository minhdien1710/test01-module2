import controller.ProductController;
import model.Product;
import repository.ProductRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            ProductController productController = new ProductController();
            Product[] listProduct = productController.showProduct();
            ProductRepository productRepository = new ProductRepository();
            int size = productRepository.getSize();
            switch (choice) {
                case 1: {

                    for (int i = 0; i < size; i++) {
                        if (listProduct[i] != null) {
                            System.out.println(listProduct[i]);
                        }
                    }
                    break;
                }
                case 2: {


                    System.out.println("them moi san pham");
                    System.out.println("nhap ten san pham:");
                    String name = scanner.next();
                    int price;
                    boolean description;
                    for (int i = 0; i < size - 1; i++) {
                        if (name.equals(listProduct[i].getName())) {
                            System.out.println("ten san pham da ton tai");
                        }
                    }
                    System.out.println("nhap gia san pham");
                    price = scanner.nextInt();
                    System.out.println("tinh trang san pham");
                    description = scanner.nextBoolean();

                    listProduct[size] = new Product(size + 1, name, price, description);
                    productController.addProduct(listProduct[size]);
                    System.out.println("them san pham thanh cong");
                    System.out.println(listProduct[size]);
                }

                break;

                case 3: {
                    System.out.println("Sua san pham");
                    System.out.println("nhap id san pham muon sua");
                    int id = scanner.nextInt();
                    if (id < 0 || id > size) {
                        System.out.println("ko co id nay");
                        break;
                    }
                    System.out.println("nhap ten moi");
                    String name = scanner.next();
                    System.out.println("nhap gia moi");
                    int price = scanner.nextInt();
                    System.out.println("nhap tinh trang");
                    boolean description = scanner.nextBoolean();

                    listProduct[id - 1] = new Product(id, name, price, description);
                    productController.editProduct(id, listProduct[id - 1]);
                    System.out.println("sua thanh cong");
                    System.out.println(listProduct[id - 1]);
                    break;
                }
                case 4: {
                    System.out.println("xoa san pham");
                    System.out.println("nhap id san pham muon xoa");
                    int id = scanner.nextInt();
                    if (id < 0 || id > size) {
                        System.out.println("ko co id nay");
                        break;
                    }
                    productController.deleteProduct(id);
                    System.out.println("xoa thanh cong");
                }
                case 5: {
                    System.out.println("tim theo ten");
                    System.out.println("nhap ten san pham muon tim");
                    String name = scanner.next();
                    for (int i = 0; i < size; i++) {
                        if (name.equals(listProduct[i].getName())) {
                            System.out.println(listProduct[i]);
                            break;
                        }
                    }


                    break;
                }


                case 6: {
                    System.out.println("sap xep");
                    productController.softProduct();
                    break;
                }
                case 0: {
                    System.out.println("thoat");
                    break;
                }
                default: {
                    System.out.println("yeu cau ko phu hop");
                }

            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("menu");
        System.out.println("1.hien thi");
        System.out.println("2.them");
        System.out.println("3.sua");
        System.out.println("4.xoa");
        System.out.println("5.tim");
        System.out.println("6.sap xep");
        System.out.println("0.exit");
    }


}
