import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list + "->" + list.size());
        list.add(1,2000);
        System.out.println(list + "->" + list.size());
        int val = list.get(1);
        System.out.println(val);
        list.set(1,2000);
        System.out.println(list + "->" + list.size());
        list.remove(1);
        System.out.println(list + "->" + list.size());
ArrayList<String>  l2 = new ArrayList<>();

l2.add("hello");
l2.add("Hello");
l2.add("s");
System.out.println(l2+"->" + l2.size());
    }
}
