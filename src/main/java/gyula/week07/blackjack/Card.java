package gyula.week07.blackjack;

public class Card {
    private CardColor color;
    private CardFigure figure;
    private int primaryValue;
    private int secondaryValue;

    public void printCard(){
        System.out.println("primaryValue: " + primaryValue);
    }
    public String toString() {
        return "Hello World!";
    }
}
