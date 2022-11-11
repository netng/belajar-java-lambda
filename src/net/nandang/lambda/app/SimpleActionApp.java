package net.nandang.lambda.app;

import net.nandang.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Nandang";
            }
        };

        System.out.println(simpleAction1.action());

        SimpleAction simpleAction2 = () -> {
            return "Nandang";
        };

        System.out.println(simpleAction2.action());

        SimpleAction simpleAction3 = () -> "nandang";
        System.out.println(simpleAction3.action());
    }
}
