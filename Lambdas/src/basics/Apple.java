package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Apple {
    private static Integer id = 0;
    private Integer appleId;
    private String color;

    public Apple(String color)
    {
        this.color = color;
        this.appleId = ++id;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Integer getAppleId()
    {
        return this.appleId;
    }

    public void setAppleId(Integer appleId)
    {
        this.appleId = appleId;
    }

    public static List<Apple> filterOnGreen(List<Apple> originalList)
    {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : originalList)
        {
            if (apple.getColor().equals("Green"))
            {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public static List<Apple> filterOnEvenIds(List<Apple> originalList)
    {
        List<Apple> evenIds = new ArrayList<>();
        for (Apple apple : originalList)
        {
            if (apple.getAppleId() % 2 == 0)
            {
                evenIds.add(apple);
            }
        }
        return evenIds;
    }

    public static boolean filterOnGreen(Apple apple)
    {
        return apple.getColor().equals("Green");
    }

    public static boolean filterOnEvenId(Apple apple)
    {
        return apple.getAppleId() % 2 == 0;
    }

    public static List<Apple> filterApples(List<Apple> originalList, Predicate<Apple> p)
    {
        List<Apple> filteredList = new ArrayList<>();
        for (Apple apple : originalList)
        {
            if (p.test(apple))
            {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleId=" + appleId +
                ", color='" + color + '\'' +
                '}';
    }
}
