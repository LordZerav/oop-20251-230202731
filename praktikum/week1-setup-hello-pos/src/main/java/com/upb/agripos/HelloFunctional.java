package com.upb.agripos;
import java.util.function.BiFunction;

public class HelloFunctional {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> perkenalan =
                (name, nim) -> "Hello World, I'm " + name + " dengan nim " + nim;

        System.out.println(perkenalan.apply("Amru Muiz Fauzan", 230202731));
    }
}