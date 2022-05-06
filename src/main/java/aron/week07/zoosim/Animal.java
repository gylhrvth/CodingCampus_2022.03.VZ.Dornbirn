package aron.week07.zoosim;

public class Animal {
    
    private  String name;
    private String genus;
    private int quantity;

    public Animal(String name , String genus, int quantity){

        this.name = name;
        this.genus = genus;
        this.quantity =quantity;
    }

//      if(animals.size() == maxSize) {
//        throw new Exception("Enclosure is full!!!!!!!!!!!");

    @Override
    public String toString() {return "Animal{" + "name='" + name + '\'' + ", genus='" + genus + '\'' + ", quantity=" + quantity + '}';

    }
}
