package expressionsAndFunctionalInterfaces;

import java.util.Comparator;
import java.util.function.Function;

@FunctionalInterface
public interface MyComparator<T> {
    public int compare(T t1, T t2);
//    a functional interface can have only only abstract method, any number of default or static methods
    static <U> Comparator<U> comparing(Function<U, Comparable> function)
    {
        return (p1, p2) -> function.apply(p1).compareTo(function.apply(p2)); //this is the lambda
    }

}
