package www.xpeppers.kata.fizzbuzz;

import java.util.Arrays;

public class CompositeRule implements Rule {

    private Rule[] rules;

    public CompositeRule(Rule... rules) {
        this.rules = rules;
    }

    @Override
    public boolean canHandle(int number) {
        boolean canHandle = rules[0].canHandle(number);
        for (Rule rule : Arrays.copyOfRange(rules, 0, rules.length)) {
            canHandle = canHandle && rule.canHandle(number);
        }

        return canHandle;
    }

    @Override
    public String say(int number) {
        StringBuffer buffer = new StringBuffer();
        for (Rule rule : rules) {
            buffer.append(rule.say(number));
        }
        return buffer.toString();
    }

}
