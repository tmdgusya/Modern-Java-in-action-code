package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example03 {

    public static List<Apple> filterApples(List<Apple> inventory) {
        return inventory
                .stream()
                .filter(apple -> Color.GREEN.equals(apple.getColor()))
                .collect(Collectors.toList());
    }

}
