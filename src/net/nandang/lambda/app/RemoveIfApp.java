package net.nandang.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("nandang", "ok", "sopyan"));

        // anonymous class
        //names.removeIf(new Predicate<String>() {
        //    @Override
        //    public boolean test(String value) {
        //        return value.length() > 5;
        //    }
        //});

        names.removeIf(value -> value.length() > 5);
        System.out.println(names);
    }
}
