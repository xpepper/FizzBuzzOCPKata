package www.xpeppers.kata.fizzbuzz;

public class BuzzRule implements Rule {

    @Override
    public boolean canHandle(int number) {
        return number % 5 == 0;
    }

    @Override
    public String say(int number) {
        return "Buzz";
    }

}
