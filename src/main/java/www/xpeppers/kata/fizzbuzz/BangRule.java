package www.xpeppers.kata.fizzbuzz;

public class BangRule implements Rule {

    @Override
    public boolean canHandle(int number) {
        return number % 7 == 0;
    }

    @Override
    public String say(int number) {
        return "Bang";
    }

}
