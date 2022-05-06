package aron.week07.DynamicDatastructures;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Apfel");
        v.add("Birne");
        for (int i = 0; i < 10; i++) {
            v.add("Korb " + i);
        }
        System.out.println(v);
        v.remove("Birne");
        System.out.println(v);
        v.remove(1);
        System.out.println(v);
        v.add(1, "Banane");
        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            String s = v.get(i);
            System.out.println("==> " + s);
        }
        System.out.println("________________________");
        for (String s: v){
            System.out.println("--> " + s);
        }

        v.set(2, "Korb 99");
        System.out.println(v);


        System.out.println("size() is " + v.size() +
                " capacity() " + v.capacity());

        System.out.println("contains(BRRRRR): " + v.contains("BRRRRR"));
        System.out.println("contains(Banane): " + v.contains("Banane"));

        System.out.println("indexOf(BRRRRR): " + v.indexOf("BRRRRR"));
        System.out.println("indexOf(Banane): " + v.indexOf("Banane"));

    }
}
