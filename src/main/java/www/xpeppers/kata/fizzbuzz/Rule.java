package www.xpeppers.kata.fizzbuzz;

public interface Rule {

    public abstract boolean canHandle(int number);

    public abstract String say(int number);

}