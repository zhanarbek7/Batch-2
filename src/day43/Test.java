package day43;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);

        list.add("Element 3");
        list.add("Element 4");
        System.out.println(list);
        list.add(0,"Java");
        System.out.println(list);
        list.set(0, "Python");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Python"));
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}
