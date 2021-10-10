package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(45, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(5, 5);

        calc.println.accept(c);
        calc.println.accept(a);
    }

}
