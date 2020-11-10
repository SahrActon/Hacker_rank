package main;

public class FizzBuzzConverter {
    public String covert(int valueToCovert) {

        if (valueToCovert % 3 == 0) {
            if (valueToCovert % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        }
        else if (valueToCovert % 5 == 0) {
            return "Buzz";
        }
        else {
        return String.valueOf(valueToCovert);
        }
    }
}
