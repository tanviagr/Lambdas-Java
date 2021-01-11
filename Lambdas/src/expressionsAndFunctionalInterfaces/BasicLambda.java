package expressionsAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class BasicLambda {
    /*
    Lambda expression is another way of passing code as a parameter.
     */
//    a basic comparator looks like this - it is an object that is used to compare two other objects.

    private String[] arrayOfStrings = new String[]{"Tanvi", "Apples", "Oranges", "Cats", "Sunshine"};
    private String[] arrayOfStringsForLambda = new String[]{"Tanvi", "Apples", "Oranges", "Cats", "Sunshine"};
    private String[] arrayOfStringsForLambdaComplex = new String[]{"Tanvi", "Apples", "Oranges", "Cats", "Sunshine"};
    private Comparator<String> stringComparator = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };

//    private Comparator<String> lambdaComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
    private Comparator<String> lambdaComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
    private Comparator<String> aLittleComplexLambda = (String s1, String s2) -> {
        System.out.println("In a complex multiline lambda");
        return Integer.compare(s1.length(), s2.length());
    };

    private static void printArray(Object[] array)
    {
        for(Object obj : array)
        {
            System.out.println(obj);
        }
    }

    public static void main (String[] args)
    {
        BasicLambda obj = new BasicLambda();
        Arrays.sort(obj.arrayOfStrings, obj.stringComparator);
        printArray(obj.arrayOfStrings);

        Arrays.sort(obj.arrayOfStringsForLambda, obj.lambdaComparator);
        printArray(obj.arrayOfStringsForLambda);

        Arrays.sort(obj.arrayOfStringsForLambdaComplex, obj.aLittleComplexLambda);
//        called according to the sorting algorithm - quick sort
        printArray(obj.arrayOfStringsForLambdaComplex);
    }
}
