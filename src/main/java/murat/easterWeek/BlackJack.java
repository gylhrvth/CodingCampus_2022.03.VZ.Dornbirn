package murat.easterWeek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] gameDeck = createDeck();
        System.out.println();
        shuffleTheCards(gameDeck);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Get first hands...
        int[][] dealerHand = new int[2][2];
        int[][] gamblerHand = new int[2][2];
        getFirstHands(gameDeck, dealerHand, gamblerHand);

        int gamblerHandValue = getAHandsValue(gamblerHand);
        int dealerHandValue = getAHandsValue(dealerHand);

        System.out.println("Dealer Hand: " + dealerHandValue);
        printAHand(dealerHand);

        System.out.println("Gambler Hand: " + gamblerHandValue);
        printAHand(gamblerHand);

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        if (dealerHandValue == 21) {
            System.out.println("Dealer Blackjack");

        } else if (gamblerHandValue == 21) {
            System.out.println("Gambler Blackjack");

        } else {
            String userDecision = readUserText(input);
            int nextCard = 4;

            if (userDecision.equals("H") || userDecision.equals("h")) {
                while (gamblerHandValue < 21) {
                    enlargeAMatrix(gamblerHand);

                    gamblerHand[0][nextCard - 2] = gameDeck[0][nextCard];
                    gamblerHand[1][nextCard - 2] = gameDeck[1][nextCard];
                    nextCard++;
                    gamblerHandValue = getAHandsValue(gamblerHand);
                    System.out.println('\n' + "Gambler Hand: " + gamblerHandValue);
                    printAHand(gamblerHand);
                    System.out.println("Dealer: " + getAHandsValue(dealerHand) + " Gambler: " + getAHandsValue(gamblerHand));

                    if (gamblerHandValue == 21) {
                        System.out.println("Blackjack");
                    } else if (gamblerHandValue > 21) {
                        System.out.println(" Gambler Bust");
                    } else {
                        //System.out.println("Press H for Hit or S for Stand");
                        userDecision = readUserText(input);
                        if (userDecision.equals("S") || userDecision.equals("s")) {

                            dealerHandValue = dealersTurn(gameDeck, dealerHand, nextCard);
                            if (gamblerHandValue > dealerHandValue) {
                                System.out.println("Gambler wins");
                            } else if (dealerHandValue > gamblerHandValue && dealerHandValue < 21) {
                                System.out.println("Dealer wins");
                            }
                            break;
                        }
                    }
                }
            } else {
                dealerHandValue = dealersTurn(gameDeck, dealerHand, nextCard);
                if (gamblerHandValue > dealerHandValue && gamblerHandValue < 21) {
                    System.out.println("Gambler wins");
                } else if (dealerHandValue > gamblerHandValue && dealerHandValue < 21) {
                    System.out.println("Dealer wins");
                }
            }
        }
    }

    public static int[][] createDeck() {

        int suitIncrement = 1;
        int[][] deck = new int[2][52];

        System.out.println("Initial deck: ");
        for (int j = 0; j < deck[0].length; j++) {
            deck[0][j] = (j % 13) + 1;

            // Create suits 1-Heart, 2-Diamond, 3-Club, 4-Spade
            if (((j + 1) % 13) != 0) {
                deck[1][j] = suitIncrement;
            } else {
                deck[1][j] = suitIncrement;
                suitIncrement++;
            }
        }

        printTheDeck(deck);
        return deck;
    }

    public static void getFirstHands(int[][] aDeck, int[][] firstHand, int[][] secondHand) {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                firstHand[i][j] = aDeck[i][j];
                secondHand[i][j] = aDeck[i][j + 2];
            }
        }
    }

    public static int getAHandsValue(int[][] aHand) {

        int valueOfAHand = 0;
        for (int j = 0; j < aHand[0].length; j++) {
            if (aHand[0][j] >= 10 && aHand[0][j] <= 12) {
                valueOfAHand = valueOfAHand + 10;
            } else if (aHand[0][j] == 13) {
                valueOfAHand = valueOfAHand + 11;
            } else {
                valueOfAHand = valueOfAHand + aHand[0][j];
            }
        }
        return valueOfAHand;
    }

    public static void shuffleTheCards(int[][] aDeck) {

        System.out.println("100 times shuffled deck: ");
        for (int i = 0; i < 100; i++) {
            int firstRandNo = getARandomNumber();
            int secondRandNo = getARandomNumber();
            int tempNo;

            // Swap the card numbers
            tempNo = aDeck[0][firstRandNo];
            aDeck[0][firstRandNo] = aDeck[0][secondRandNo];
            aDeck[0][secondRandNo] = tempNo;

            // Swap the corresponding suits
            tempNo = aDeck[1][firstRandNo];
            aDeck[1][firstRandNo] = aDeck[1][secondRandNo];
            aDeck[1][secondRandNo] = tempNo;
        }

        printTheDeck(aDeck);
        System.out.println();
    }

    public static void printTheDeck(int[][] aDeck) {

        for (int i = 0; i < aDeck[0].length; i++) {
            if (i + 1 > 13 && ((i + 1) % 13 == 1)) {
                System.out.print(" ");
                System.out.print(aDeck[0][i] + " ");
            } else {
                System.out.print(aDeck[0][i] + " ");
            }
        }

        System.out.println();

        for (int j = 0; j < aDeck[0].length; j++) {
            if (aDeck[0][j] >= 9) {
                System.out.print(aDeck[1][j] + "  ");
            } else {
                System.out.print(aDeck[1][j] + " ");
            }
        }
        System.out.println();
    }

    public static void printAHand(int[][] aHand) {

        for (int j = 0; j < aHand[0].length; j++) {

            // Create suits 1-Heart, 2-Diamond, 3-Club, 4-Spade
            if (aHand[1][j] == 1) {
                System.out.println(ANSI_RED + aHand[0][j] + " Heart " + "\u2665" + ANSI_RESET);
            } else if (aHand[1][j] == 2) {
                System.out.println(ANSI_RED + aHand[0][j] + " Diamond " + "\u2666" + ANSI_RESET);
            } else if (aHand[1][j] == 3) {
                System.out.println(ANSI_BLACK + aHand[0][j] + " Club " + "\u2663" + ANSI_RESET);
            } else {
                System.out.println(ANSI_BLACK + aHand[0][j] + " Spade " + "\u2660" + ANSI_RESET);
            }
        }
        System.out.println();
    }

    public static int getARandomNumber() {

        Random rand = new Random();
        return rand.nextInt(51);
    }

    public static void enlargeAMatrix(int[][] aMatrix) {

        for (int i = 0; i < 2; i++) {
            aMatrix[i] = Arrays.copyOf(aMatrix[i], aMatrix[i].length + 1);

        }
    }

    public static String readUserText(Scanner sc) {

        String userText = "";
        System.out.println("Press H for Hit or S for Stand");
        while (!userText.equals("H") && !userText.equals("h") && !userText.equals("S") && !userText.equals("s")) {
            userText = sc.nextLine();
            if (!userText.equals("H") && !userText.equals("h") && !userText.equals("S") && !userText.equals("s")) {
                System.out.println("Please enter a H or S!");
            }
        }
        return userText;
    }

    public static int dealersTurn(int[][] aDeck, int[][] dealerHand, int nextCard) {

        int dealerHandValue = getAHandsValue(dealerHand);

        // If the dealer has a hand smaller than 17, get a new card, otherwise STAND
        while (dealerHandValue < 17) {

            // Get the next card from the shuffled deck and make the dealer hand bigger.
            enlargeAMatrix(dealerHand);
            dealerHand[0][dealerHand[0].length - 1] = aDeck[0][nextCard];
            dealerHand[1][dealerHand[0].length - 1] = aDeck[1][nextCard];
            nextCard++;
            dealerHandValue = getAHandsValue(dealerHand);

            System.out.println("Dealer Hand: " + dealerHandValue);
            printAHand(dealerHand);

            if (dealerHandValue > 17 && dealerHandValue < 21) {
                return dealerHandValue;
            } else if (dealerHandValue == 21) {
                System.out.println("Dealer Blackjack");
                return dealerHandValue;
            } else if (dealerHandValue > 21) {
                System.out.println("Bust Dealer");
                return dealerHandValue;
            }
        }
        dealerHandValue = getAHandsValue(dealerHand);
        return dealerHandValue;
    }
}

