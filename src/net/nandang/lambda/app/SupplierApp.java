package net.nandang.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "nandang";
        System.out.println(supplier.get());
    }
}
