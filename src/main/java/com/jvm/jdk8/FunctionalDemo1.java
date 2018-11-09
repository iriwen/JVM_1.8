package com.jvm.jdk8;


@FunctionalInterface
interface MyInterface1 {
    default void tests() {
        System.out.println("hello");
    }

    void test();

    String toString();

}

public class FunctionalDemo1 {
    public void toTest(MyInterface1 ms) {
        System.out.println("before");

        ms.test();
        System.out.println("after");
    }

    public static void main(String[] args) {
        FunctionalDemo1 fm = new FunctionalDemo1();
        fm.toTest(() -> {
            System.out.println("lambda output !");
        });

        MyInterface my1 = () -> {
            System.out.println("lamber");
        };

        System.out.println(my1.getClass().getName());
        System.out.println(my1.getClass().getSuperclass().getName());
        System.out.println(my1.getClass().getInterfaces()[0]);

    }
}
