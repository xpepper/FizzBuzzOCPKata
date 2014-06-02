package www.xpeppers.kata.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzFactory {

    public FizzBuzz create() {
        List<? extends Rule> rules = Arrays.asList(
                new CompositeRule(new FizzRule(), new BuzzRule(), new BangRule()),
                new CompositeRule(new BuzzRule(), new BangRule()),
                new CompositeRule(new FizzRule(), new BangRule()),
                new BangRule(),
                new CompositeRule(new FizzRule(), new BuzzRule()),
                new BuzzRule(),
                new FizzRule(),
                new SayTheNumberRule()
                );

        return new FizzBuzz(rules);
    }

}
