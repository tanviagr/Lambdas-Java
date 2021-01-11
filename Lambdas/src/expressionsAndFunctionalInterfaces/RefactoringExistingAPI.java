package expressionsAndFunctionalInterfaces;

import java.util.Comparator;
import java.util.function.Function;

public class RefactoringExistingAPI {
    Comparator<Person> comparatorAge = (person1, person2) -> person1.getAge() - person2.getAge();
    Comparator<Person> comparatorFirstName = (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName());

    /*
    the common point between these lambdas is taking two person objects and applying some method on them
     */
    Function<Person, Integer> f1 = person -> person.getAge();
    Function<Person, String> f2 = person -> person.getFirstName();

//    Comparator<Person> comparePeople = MyComparator.comparing(f1);
//    Comparator<Person> comparePeopleBasedOnAge = MyComparator.comparing(person -> person.getAge());
    Comparator<Person> comparePeopleBasedOnAge = MyComparator.comparing(Person::getAge);
//    build a comparator on comparing people based on the function we have passed

//    write lambda for lastName
    Comparator<Person> comparePeopleBasedOnLastName = MyComparator.comparing(Person::getLastName);
}
