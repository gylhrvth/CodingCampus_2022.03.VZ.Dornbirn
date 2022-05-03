package gyula.week07;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Hello");
        v.add("World!");
        v.add("Alpha");

        System.out.println(v.size());
        System.out.println(v.capacity()); // We don't need it...
        for (String s: v){
            System.out.println(s);
        }
        System.out.println("-----------");
        for (int i = 0; i < v.size(); i++) {
            String s = v.get(i);
            System.out.println(s);
        }
        v.add(1, "Beta");
        System.out.println(v);
        System.out.println("indexOf: " + v.indexOf("Beta"));
        System.out.println("contains " + v.contains("Alpha"));
        v.remove("Beta");
        System.out.println(v);
        String first = v.remove(0);
        System.out.println(first);
        System.out.println(v);

    }
}
