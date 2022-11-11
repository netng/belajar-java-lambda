package net.nandang.lambda.app;

import net.nandang.lambda.SimpleAction;
import net.nandang.lambda.SimpleActionWithParameter;

public class SimpleActionWithParamterApp {
    public static void main(String[] args) {
        SimpleActionWithParameter simpleActionWithParameter = (name) -> {
            return name;
        };

        System.out.println(simpleActionWithParameter.action("nandang"));

        SimpleActionWithParameter simpleActionWithParameter1 = (String name) -> "Hello " + name;
        System.out.println(simpleActionWithParameter1.action("nandang"));

        SimpleActionWithParameter simpleActionWithParameter2 = name -> "Hello " + name;
        System.out.println(simpleActionWithParameter2.action("nandang"));
    }
}
