package controller;

import model.Product;

import java.util.*;

public class ManagerProduct {
    List<Product> list;
    Set<Integer> id;

    {
        list = new ArrayList<>();
        id = new HashSet<>();
        Product product1 = new Product(1, "Bia", 9000, 10, "Dùng để uống, có nồng độ cồn nhẹ");
        Product product2 = new Product(2, "Sting", 9000, 10, "Dùng để uống, có nồng độ cồn nhẹ");
        Product product3 = new Product(3, "Cá chỉ vàng", 9000, 10, "Dùng để uống, có nồng độ cồn nhẹ");
        Product product4 = new Product(4, "Mực", 9000, 10, "Dùng để uống, có nồng độ cồn nhẹ");
        Product product5 = new Product(5, "Nem", 9000, 10, "Dùng để uống, có nồng độ cồn nhẹ");
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        id.add(product1.getId());
        id.add(product2.getId());
        id.add(product3.getId());
        id.add(product4.getId());
        id.add(product5.getId());

    }

    public Product add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đang thêm mới sản phẩm");
        System.out.println("Nhập mã sản phẩm");
        int id = scanner.nextInt();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = scanner.nextInt();
        System.out.println("Nhập số lượng sản phẩm");
        int quantity = scanner.nextInt();
        System.out.println("Mô tả sản phẩm");
        String describle = scanner.nextLine();
        Product product = new Product(id, name, price, quantity, describle);
        System.out.println("Đã tạo thành công sản phẩm là: " + product);
        list.add(product);
        return product;
    }
        public void edit(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Đang sửa sản phẩm");
            System.out.println("Nhập mã sản phẩm muốn sửa");
            int number = scanner.nextInt();
            for (int i = 0 ;i<id.size();i++
                 ) {
                if (id.contains(number)  );{
                System.out.println("Sửa mã sản phẩm");
                int id  = scanner.nextInt();
                System.out.println("Sửa tên sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Sửa giá sản phẩm");
                int price = scanner.nextInt();
                System.out.println("Sửa số lượng sản phẩm");
                int quantity=scanner.nextInt();
                System.out.println("Sửa mô tả sản phẩm");
                String describle= scanner.nextLine();
                list.get(i).setId(id);
                list.get(i).setName(name);
                list.get(i).setPrice(price);
                list.get(i).setQuantity(quantity);
                list.get(i).getDescribe(describle);
            }
            }
    }public void   delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm xoá");
        int number = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (id.contains(number)) {
               list.remove(i);
            }
        }
    }
    public void Sort(){
        Scanner scanner =new Scanner(System.in);
        int choice = scanner.nextInt();

    }
    public void checkChoice(int i){
        if (i==1){
            Product

        }

    }
}