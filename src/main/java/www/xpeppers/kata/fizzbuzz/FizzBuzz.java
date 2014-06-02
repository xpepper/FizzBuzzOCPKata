package www.xpeppers.kata.fizzbuzz;

import java.util.List;

public class FizzBuzz {

    private List<? extends Rule> rules;

    public FizzBuzz(List<? extends Rule> rules) {
        this.rules = rules;
    }

    public String say(int number) {
        for (Rule eachRule : rules) {
            if (eachRule.canHandle(number))
                return eachRule.say(number);
        }

        return null;
    }

}
