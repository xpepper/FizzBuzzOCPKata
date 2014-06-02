package www.xpeppers.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzzFactory().create();
    }

    @Test
    public void justSayTheNumber() {
        assertEquals("1", fizzBuzz.say(1));
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void sayFizzForMultipleOf3() {
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
    }

    @Test
    public void sayBuzzForMultipleOf5() {
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }

    @Test
    public void sayFizzBuzzForMultipleOf5And3() {
        assertEquals("FizzBuzz", fizzBuzz.say(3*5));
    }

    @Test
    public void sayBangForMultipleOf7() {
        assertEquals("Bang", fizzBuzz.say(7));
        assertEquals("Bang", fizzBuzz.say(14));
    }

    @Test
    public void sayFizzBangForMultipleOf3And7() {
        assertEquals("FizzBang", fizzBuzz.say(3*7));
    }

    @Test
    public void sayBuzzBangForMultipleOf5And7() {
        assertEquals("BuzzBang", fizzBuzz.say(5*7));
    }

    @Test
    public void sayFizzBuzzBangForMultipleOf3And5And7() {
        assertEquals("FizzBuzzBang", fizzBuzz.say(3*5*7));
    }

}
