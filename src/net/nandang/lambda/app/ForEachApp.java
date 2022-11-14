package net.nandang.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("nandang", "sopyan");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        list.forEach(value -> System.out.println(value));

        list.forEach(System.out::println);
    }
}
