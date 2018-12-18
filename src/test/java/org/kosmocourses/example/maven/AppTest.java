package org.kosmocourses.
        example.maven;

public class AppTest {
    public static void main(String[] args) {
        int i=42;
        Object obj = new Object();
        AppTest myClass = new AppTest();
        myClass.someMethod (obj);
    }
    private void someMethod (Object param){
        String str = param.toString();
        System.out.println(str);
    }
}