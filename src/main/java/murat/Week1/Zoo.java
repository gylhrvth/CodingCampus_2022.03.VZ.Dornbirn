package murat.week1;

public class Zoo {

    public static void main(String[] args) {

        Animal gecko = new Animal();
        gecko.name = "Murat";
        gecko.age = 35;
        gecko.food = "leberkaese";
        gecko.beverage = "coffee";

        Plant mint = new Plant();

        mint.poisonous = true;
        mint.color = "green";

        System.out.println(gecko.name + " is " + gecko.age + " years old. He drinks " + gecko.beverage + " and eats " + gecko.food + ".");

    }
}
