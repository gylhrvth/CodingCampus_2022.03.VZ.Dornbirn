package gyula.week07.blackjack;

public class Deck {
    private Card[] deck;

    public Deck(int deckSize){
        deck = new Card[deckSize];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card();
        }
    }

    public static void main(String[] args) {
        Deck d = new Deck(52);
        System.out.println(d.deck);
        System.out.println(d.deck[0]);
        //System.out.println(d.deck[0].primaryValue);
        d.deck[0].printCard();
    }
}
