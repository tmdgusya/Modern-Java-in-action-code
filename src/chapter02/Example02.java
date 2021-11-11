package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Example02 {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicateStrategy) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicateStrategy.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
