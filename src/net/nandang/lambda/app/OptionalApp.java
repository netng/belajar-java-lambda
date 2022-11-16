package net.nandang.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("nandang");
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        Optional<String> optionalName = Optional.ofNullable(name);
        Optional<String> optionalUpperName = optionalName.map(value -> value.toUpperCase());

        optionalUpperName.ifPresent(value -> System.out.println("Hello " + value));
    }
}
