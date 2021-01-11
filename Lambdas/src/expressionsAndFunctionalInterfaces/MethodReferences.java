package expressionsAndFunctionalInterfaces;

import com.sun.jdi.IntegerValue;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferences {
    Function<Person, Integer> lambdaFunction1 = person -> person.getAge();
    Function<Person, Integer> methodReference1 = Person::getAge; //not static

//    BinaryOperation represents an operation on two operands of a datatype and returns the same datatype.
    BinaryOperator<Integer> lambdaFunction2 = (i1, i2) -> i1 + i2;
    BinaryOperator<Integer> lambdaFunction2Simplified = (i1, i2) -> Integer.sum(i1, i2);
    BinaryOperator<Integer> methodReference2 = Integer::sum; //static

//    the method reference can be static or non-static

    Consumer<String> lambdaFunction3 = s -> System.out.println(s);
    Consumer<String> methodReference3 = System.out::println;

    /*
    so lambda expression for now
    1. a new syntax
    2. a new way of expressing objects of an anonymous class
    3. passes code as a parameter
    4. alternative syntax to write lambda expressions is method references.
     */

}
