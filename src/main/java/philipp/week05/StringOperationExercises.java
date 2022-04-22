package philipp.week05;


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StringOperationExercises {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        stringTabular();
//        System.out.println();
//        System.out.println("The search for Hesse:");
//        searchHesse();
//        System.out.println();
//        System.out.println("Empasize Hesse");
//        emphasizeHesse();
//        System.out.println();
//        System.out.println("Longest common Word:");
//        longestCommonWord();
        System.out.println("Longest common Substring:");
        longestCommonSubstring();

    }

    private static void stringTabular() {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int fN = checkWordLengthString(firstName);
        int lN = checkWordLengthString(lastName);
        int pl = checkWordLengthString(place);

        int repeat = fN + 3 + lN + 3 + pl + 3 + "age".length() + 3 + "Distance from Capital".length() + 7;
        System.out.println("*".repeat(repeat));
        System.out.printf("| %-" + fN + "s | %-" + lN + "s | %" + "age".length() + "s | %-" + pl + "s | %" + "  Distance from Capital".length() + "s  |%n", "First Name", "Last Name", "Age", "Place", "Distance from Capital");
        System.out.println("-".repeat(repeat));
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("| %-" + fN + "s | %-" + lN + "s | %" + "age".length() + "d | %-" + pl + "s | %" + "Distance from Capital".length() + ".2f km |%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
        System.out.println("*".repeat(repeat));
    }

    private static int checkWordLengthString(String[] input) {
        int charInput = Integer.MIN_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            if (charInput < input[i].length()) {
                charInput = input[i].length();
            }
        }
        return charInput;
    }

    /*
        private static void searchHesse() {
            int index = 0;
            int counter = 0;
            while (true) {
                int a = textToAnalyse.indexOf("Hesse", index);
                if (a == -1) {
                    break;
                }
                System.out.print(a + ", ");
                index = a + 1;
                counter++;
            }
            System.out.println();
            System.out.println(counter);
        }
    */
    private static void searchHesse() {
        int index = textToAnalyse.indexOf("Hesse");
        int counter = 0;
        while (index >= 0) {
            counter++;
            System.out.print(index + ", ");
            index = textToAnalyse.indexOf("Hesse", 1 + index);
        }
        System.out.println();
        System.out.println(counter);
    }

    private static void emphasizeHesse() {
        String input = userInput(sc, "Please enter the word or letter you want to emphasize:");
        String replaceString = "";
        // case insensitive
        for (int i = 0; i < input.length(); i++) {
            String singleChar = input.substring(i, i + 1);
            replaceString += ("[" + singleChar.toUpperCase() + singleChar.toLowerCase() + "]");
        }
        System.out.println(replaceString);

        String newText = textToAnalyse.replaceAll(replaceString, input.toUpperCase());
        System.out.print(newText);
    }

    private static String userInput(Scanner sc, String msg) {
        System.out.println(msg);
        String userInput = sc.nextLine();
        return userInput;
    }

    private static void longestCommonWord() {
        String[] a = userInput(sc, "Please enter a sentence").split(" ");
        String[] b = userInput(sc, "Please enter another sentence").split(" ");
        int lengthCommonWordString = a.length;
        if (a.length < b.length) {
            lengthCommonWordString = b.length;
        }
        // kürzere Version con lengthCommonWordString
        int maxLength = Math.max(a.length, b.length);
        String[] commonWords = new String[lengthCommonWordString];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (Objects.equals(a[i], b[j])) {
                    commonWords[i] = a[i];
                }
            }
        }
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(commonWords));
        System.out.println();
        System.out.print("The longest common word is: ");
        System.out.println(longestWord(commonWords));
    }

    private static void longestCommonSubstring() {
        String userInput1 = userInput(sc, "Please enter a sentence");
        char[] a = userInput1.toCharArray();
        String userInput2 = userInput(sc, "Please enter another sentence");
        char[] b = userInput2.toCharArray();

        int maxLength = Math.max(a.length, b.length);
        String[] commonSubStrings = new String[maxLength];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                String subTemp = String.valueOf(a[i]);
                if (userInput2.contains(subTemp)) {
                    while (i < a.length - counter) {
                        if(userInput2.contains(subTemp+a[i + counter])) {
                            subTemp = subTemp + a[i + counter];
                        } else {
                            break;
                        }
                        counter++;
                    }
                }
                commonSubStrings[i] = subTemp;
                counter = 1;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(commonSubStrings));
        System.out.println();
        System.out.print("The longest common substring is: ");
        System.out.println(longestWord(commonSubStrings));
    }


    private static String longestWord(String[] data) {
        int charInput = Integer.MIN_VALUE;
        String word = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                continue;
            }
            if (charInput < data[i].length()) {
                charInput = data[i].length();
                word = data[i];
            }
        }
        return word;
    }

    private static String textToAnalyse = "Zur Zeit des Zweiten Weltkriegs waren seine großen Werke Siddhartha und Der Steppenwolf noch verboten. Heute gehört Hermann Hesse zu den bekanntesten deutschen Schriftstellern. Mehr über den Weltveränderer lest ihr hier\n" +
            "Hermann Hesse\n" +
            "\n" +
            "Hermann Hesse erhielt den Nobelpreis für Literatur\n" +
            "Hermann Hesse: Kurz-Steckbrief\n" +
            "\n" +
            "    Vollständiger Name: Hermann Karl Hesse\n" +
            "    Lebensdaten: 2. Juli 1877 bis 9. August 1962\n" +
            "    Nationalität: deutsch, später schweizerisch\n" +
            "    Zitat: \"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es auf jeden Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "\n" +
            "Als Schriftsteller, Dichter und Maler prägte Hermann Hesse die Literatur und Kunst des 19. Jahrhunderts.\n" +
            "Wie Hermann Hesse lebte\n" +
            "\n" +
            "Hermann Hesse wurde am 2. Juli 1877 in Calw, einer Stadt in Württemberg geboren. Seine Familie war sehr religiös, der Vater Johannes sogar Missionar, also so genannter \"Gesandter\", der seinen Glauben weiterverbreiten wollte.\n" +
            "\n" +
            "So sollten auch die Kinder in die Fußstapfen der religiösen Eltern treten. Hesse war davon aber gar nicht begeistert und soll einmal gesagt haben, dass er \"entweder Dichter oder gar nichts werden\" wolle.\n" +
            "\n" +
            "1893 verließ der junge Hesse das Gymnasium mit dem Abschluss der Mittleren Reife. Danach schloss er zwei Lehren ab: eine als Turmuhrenmechaniker und eine als Buchhändler.\n" +
            "\n" +
            "Gegen den Willen seiner Eltern ließ er sich in der Schweizer Stadt Basel nieder, um seinem Traum vom Dichter-Dasein näher zu kommen. 1899 veröffentlichte er seine erste Lyriksammlung. In dieser Zeit heiratete er auch seine erste Frau Maria Bernoulli, von der er sich aber 15 Jahre später wieder trennte. Aus der Ehe gingen drei Söhne hervor.\n" +
            "\n" +
            "Zwölf Jahre lang ist Adolf Hitler Deutschlands Reichskanzler. Viele Menschen sind damals von ihm begeistert, doch es wird eine Schreckensherrschaft. Wir haben die Geschichte des Nationalsozialismus auf dieser Themenseite für euch zusammengefasst\n" +
            "\n" +
            "\n" +
            "Wie Hermann Hesse die Welt veränderte\n" +
            "\n" +
            "Um das Jahr 1904 gelang ihm der Durchbruch. Der Roman \"Peter Camenzind\" stimmt an vielen Stellen mit Hesses Leben überein. Literatur-Experten handeln das Werk als \"Beginn des modernen Bildungsromans\". Auf den ersten großen Erfolg folgten weitere beeindruckende Erzählungen und Romane.\n" +
            "\n" +
            "1914, als der erste Weltkrieg begann, meldete sich der Schriftsteller zum Militärdienst für das Deutsche Reich. Aufgrund seiner Kurzsichtigkeit wurde er aber ausgemustert und der deutschen Kriegsgefangenenfürsorge zugeteilt. Seine Aufgabe war es, für die Gefangenen Bücher zu sammeln. Außerdem leitete er die \"Bücherei für deutsche Kriegsgefangene\".\n" +
            "\n" +
            "Diese Erfahrungen prägten Hesse sehr. In vielen seiner folgenden Texte sprach er sich deutlich gegen Krieg und Patriotismus (\"Vaterlandsliebe\") aus. Zusätzlich belasteten ihn familiäre Schicksalsschläge: 1916 starb sein Vater, sein Sohn litt an einer schweren Erkrankung und seine Ehe mit Bernoulli ging in die Brüche. Das ging Hesse so nahe, dass er eine Therapie machte. In dieser Phase seines Lebens widmete er sich auch erstmals der Malerei.\n" +
            "\n" +
            "Innerhalb kurzer Zeit heiratete er daraufhin zweimal: 1924 Ruth Wenger, die Tochter einer bekannten Schriftstellerin, 1931 die Kunsthistorikerin Ninon Dolbin. Gleichzeitig begann der Zweite Weltkrieg. Die Nationalsozialisten erklärten seine Werke als volksfeindlich und verbaten beispielsweise \"Unterm Rad\", \"Der Steppenwolf\" und \"Betrachtungen\". Hesses Verleger Peter Suhrkamp wurde 1944 sogar verhaftet.\n" +
            "\n" +
            "Hermann Hesse ließ sich den Mund aber nicht verbieten: Weiterhin schrieb er Regime-kritische Texte, also Texte, die die nationalsozialistische Herrschaft unter Adolf Hitler angriffen. Nach dem Zweiten Weltkrieg wurden diese dann auch veröffentlicht.\n" +
            "\n" +
            "Er hasste den Krieg. In seinem Testament widmete der Physiker und Chemiker Alfred Nobel sein Vermögen unter anderem der Vergabe des jährlichen Friedenspreises\n" +
            "Hermann Hesses Tod in der Schweiz\n" +
            "\n" +
            "1946 zog sich Hesse zurück, da sein Gesundheitszustand immer schlechter wurde. \"Das Glasperlenspiel\" und \"Krieg und Frieden\" waren Anlass dafür, dass er am 14. November desselben Jahres mit dem Nobelpreis für Literatur ausgezeichnet wurde. Für sein Lebenswerk wurde er ein Jahr später zum Ehrendoktor sowie Ehrenbürger von Calw, seiner Geburtsstadt, ernannt. 1955 folgte der Friedenspreis des Deutschen Buchhandels.\n" +
            "\n" +
            "Am 9. August 1962 starb Hermann Hesse an einem Gehirnschlag in seinem Haus in der Schweiz. Heute gehört Hermann Hesse zu denbekanntesten deutschsprachigenr Schriftstellern. Seine Werke wurden in 55 Sprachen übersetzt.\n" +
            "Zitate von Hermann Hesse\n" +
            "\n" +
            "\"Man muß das Unmögliche versuchen, um das Mögliche zu erreichen.\"\n" +
            "Hermann Hesse\n" +
            " \n" +
            "\n" +
            "\"Man braucht vor niemand Angst zu haben. Wenn man jemanden fürchtet, dann kommt es daher, daß man diesem Jemand Macht über sich eingeräumt hat.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Man hat nur Angst, wenn man mit sich selber nicht einig ist.\"\n" +
            "Hermann Hesse, Demian\n" +
            " \n" +
            "\n" +
            "\"Recht als wolle es ihn mit der Nase darauf stoßen, hatte sein Glück ihm diese prächtige Figur in seinen Weg gestellt, daß er sich an sie halte. Aber der Mensch ist zu nichts schwerer zu bringen als zu seinem Glück.\"\n" +
            "Hermann Hesse, Der Weltverbesserer\n" +
            " \n" +
            "\n" +
            "\"Wenn wir einen Menschen glücklicher und heiterer machen können, so sollten wir es in jedem Fall tun, mag er uns darum bitten oder nicht.\"\n" +
            "Hermann Hesse, Das Glasperlenspiel\n" +
            " \n" +
            "\n" +
            "\"Die Welt zu durchschauen, sie zu verachten, mag großer Denker Sache sein. Mir aber liegt einzig daran, die Welt lieben zu können, sie und mich und alle Wesen mit Liebe und Bewunderung und Ehrfurcht betrachten zu können.\"\n" +
            "Hermann Hesse\n";
}


