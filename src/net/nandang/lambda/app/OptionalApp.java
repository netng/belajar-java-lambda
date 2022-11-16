package net.nandang.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("nandang");
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        //
        //Optional<String> optionalName = Optional.ofNullable(name);
        //Optional<String> optionalUpperName = optionalName.map(value -> value.toUpperCase());
        //optionalUpperName.ifPresent(value -> System.out.println("Hello " + value));

        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);

    }
}
