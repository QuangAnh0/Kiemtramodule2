package main;

import controller.ManagerProduct;

public class Main {
    public static void main(String[] args) {
        ManagerProduct managerProduct =new ManagerProduct();
        managerProduct.add();
//        managerProduct.edit();
        managerProduct.delete();

    }
}
