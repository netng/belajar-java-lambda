package net.nandang.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name);
            }
        };
        consumer.accept("nandang");

        Consumer<String> consumer1 = name -> System.out.println("Hello " + name);
        consumer1.accept("kazu");
    }
}
