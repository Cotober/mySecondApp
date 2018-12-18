package org.cosmocourses.example.maven;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) {
        int i = 42;
        System.out.format("Ответ на «Главный вопрос жизни, вселенной и всего такого»: %d%n",i);
        double pi = Math.PI;
        System.out.format("Почему бы нам и число PI не вывести: %.2f%n",pi);
    }
}
