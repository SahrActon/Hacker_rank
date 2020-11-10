package test;

import main.FizzBuzzConverter;

public class FizzBuzzAppTest {
    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for (int i = 0; i <= 100; i++) {
            System.out.println(fizzBuzz.covert(i));
        }

    }
}
