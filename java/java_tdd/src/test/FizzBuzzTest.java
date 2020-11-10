package test;


//"Write a program that prints the numbers from 1 to 100. " +
// "But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. " +
// "For numbers which are multiples of both three and five print “FizzBuzz”."


import main.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

/*
 example
 1 =
 2 = 2
 3 = fizz
 4 = 4
 5 = buzz
 6 = fizz
 7 = 7
 ..
 10 = buzz
 ..
 15 = fizzbuzz

 */
public class FizzBuzzTest {

    // this will number values
    @Test
    public  void fizzBuzzCovertForNormalNumber(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1", fizzBuzz.covert(1));
        Assert.assertEquals("2", fizzBuzz.covert(2));
    }

    // this will handle multiple of 3
    @Test
    public void fizzBuzzCoverToMultiplesOfThree(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Fizz", fizzBuzzConverter.covert(3));
        Assert.assertEquals("Fizz", fizzBuzzConverter.covert(6));
        Assert.assertEquals("Fizz", fizzBuzzConverter.covert(9));

    }

    // this will handle multiple of 5
    @Test
    public void fizzBuzzCoverToMultiplesOfFive(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("Buzz", fizzBuzzConverter.covert(5));
        Assert.assertEquals("Buzz", fizzBuzzConverter.covert(10));
    }

    // this will handle multiple of 5
    @Test
    public void multipleOfBothAndFive(){
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.covert(15));
        Assert.assertEquals("FizzBuzz", fizzBuzzConverter.covert(30));
    }
}

