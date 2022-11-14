package net.nandang.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "nandang");
        map.put("last_name", "sopyan");

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " => " + value);
            }
        });

        map.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
