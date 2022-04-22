package zah.week05;

public class Faktorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial1(10));
    }

    /**
     * factorial(n) = n * factorial(n-1)
     * factorial(1) = 1
     *
     * @param val
     * @return
     */
    public static long factorial(int val) {

        if (val == 1) {
            return 1;
        } else {
            return (val * factorial(val-1));
        }
    }
    public static long factorial1(int val){
        int index = 1;
        int number = val;
        for (int i = 1; i <=number ; i++) {
            System.out.println(index);
            index=index*i;

        }
        return index;
    }
}

