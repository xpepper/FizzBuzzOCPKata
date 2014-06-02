package www.xpeppers.kata.fizzbuzz;

public class SayTheNumberRule implements Rule {

    @Override
    public boolean canHandle(int number) {
        return true;
    }

    @Override
    public String say(int number) {
        return String.valueOf(number);
    }

}
