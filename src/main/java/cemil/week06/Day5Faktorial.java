package cemil.week06;

public class Day5Faktorial {
    public static void main(String[] args) {

        System.out.println(faktorial(5));
        System.out.println(factorial1(5));

    }

    public static long faktorial(int val) {
        int index = 1;
        int indexA = val;
        for (int i = 1; i <= indexA; i++) {
           System.out.println(index);
            index = index * i;
        }
        return index;
    }

    public static long factorial1(int val) {
        if (val == 1) {
            return 1;
        } else {
            return (val * factorial1(val - 1));
        }
    }
}
