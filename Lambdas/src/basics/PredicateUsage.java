package basics;

import java.util.List;

public class PredicateUsage
{
    private List<Apple> inventory = List.of(new Apple("Red"), new Apple("Green"),  new Apple("Green"), new Apple("Yellow"));
    public static void main (String[] args)
    {
        // want to filter apples based on color and even IDs
        PredicateUsage obj = new PredicateUsage();
        System.out.println(Apple.filterOnGreen(obj.inventory));
        System.out.println(Apple.filterOnEvenIds(obj.inventory));

//        had to write the same method almost to the t - with very little different code. can be refactored with java 8 Predicate class.
//        a Predicate method returns a boolean based on the "test" condition.

        System.out.println("Using predicates: " + Apple.filterApples(obj.inventory, Apple::filterOnGreen));
        System.out.println("Using predicates: " + Apple.filterApples(obj.inventory, Apple::filterOnEvenId));

    }
}