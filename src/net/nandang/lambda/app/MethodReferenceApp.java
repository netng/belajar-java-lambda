package net.nandang.lambda.app;

import net.nandang.lambda.util.StringUtil;

import java.util.function.Consumer;
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

        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;
        System.out.println(predicateIsLowerCase.test("Nandang"));
        System.out.println(predicateIsLowerCase.test("nandang"));
    }
}
