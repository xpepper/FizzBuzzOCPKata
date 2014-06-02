package www.xpeppers.kata.fizzbuzz;

public class FizzRule implements Rule {

    @Override
    public boolean canHandle(int number) {
        return number % 3 == 0;
    }

    @Override
    public String say(int number) {
        return "Fizz";
    }

}
