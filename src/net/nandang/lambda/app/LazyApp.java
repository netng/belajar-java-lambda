package net.nandang.lambda.app;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
        testScore(80, () -> getName());
        testScore(60, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 60) {
            System.out.println("Selamat " + name.get() + " kamu lulus");
        } else {
            System.out.println("Kamu tidak lulus");
        }
    }

    public static String getName() {
        System.out.println("method getName() dipanggil");
        return "nandang";
    }
}
