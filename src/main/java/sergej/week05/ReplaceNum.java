package sergej.week05;

public class ReplaceNum {
    public static void main(String[] args) {
        String text = "749813247132984712039487123049871204398712039487";
        String zeroToNine = "[0-9]";
        String textZero = text.replaceAll(zeroToNine,"");
        System.out.println("deleted all nums from 0-9: "+textZero);

        String oneToNine = "[1-9]";
        String textOne = text.replaceAll(oneToNine,"");
        System.out.println(textOne);

        String twoToFour = "[2-4]";
        String textTwo = text.replaceAll(twoToFour,"");
        System.out.println(textTwo);

        String oneThreeSixNine = "[1236789]";
        String textoneThreeSixNine = text.replaceAll(oneThreeSixNine,"");
        System.out.println(textoneThreeSixNine);




    }
}
