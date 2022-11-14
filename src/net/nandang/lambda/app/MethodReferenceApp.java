package net.nandang.lambda.app;

import net.nandang.lambda.util.StringUtil;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        //Predicate<String> predicateIsLowerCase = new Predicate<String>() {
        //    @Override
        //    public boolean test(String value) {
        //        return StringUtil.isLowerCase(value);
        //    }
        //};

        //System.out.println(predicateIsLowerCase.test("nandang"));
        //System.out.println(predicateIsLowerCase.test("Nandang"));

        //Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;
        //System.out.println(predicateIsLowerCase.test("Nandang"));
        //System.out.println(predicateIsLowerCase.test("nandang"));

        MethodReferenceApp methodReferenceApp = new MethodReferenceApp();
        methodReferenceApp.run();

        Function<String, String> functionToUpperCase = new Function<String, String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        };

        Function<String, String> functionToUpperCase2 = (value) -> value.toUpperCase();

        Function<String, String> functionToUpperCase3 = String::toUpperCase;

        System.out.println(functionToUpperCase.apply("nandang"));
        System.out.println(functionToUpperCase2.apply("sopyan"));
        System.out.println(functionToUpperCase3.apply("kazu"));

    }

    public void run() {
        //Predicate<String> predicateIsLowerCase = value -> MethodReferenceApp.this.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = this::isLowerCase;
        System.out.println(predicateIsLowerCase.test("nandang"));
        System.out.println(predicateIsLowerCase.test("NanDang"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
