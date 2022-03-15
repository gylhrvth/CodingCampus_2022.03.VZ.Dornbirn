package zah.week01;

public class CountToTen {
    public static void main(String[] args) {


        int counter1 = 0;
        int limit = 10;
        while (counter1 <= limit) {
            System.out.println(counter1);
            ++counter1;
        }

        System.out.println("---------------------");
        for (int counter2 = 0; counter2 <= limit; ++counter2) {
            System.out.println(counter2);
        }

        System.out.println("------------------------------");

        int counter3 = 0;
        while (counter3 < limit) {
            System.out.println(counter3);
            ++counter3;
        }

        System.out.println("--------------------------");
        int counter4 = 0;
        while (counter4 <= limit) {
            if (counter4 % 2 == 0) {
                System.out.println(counter4);
            }
            ++counter4;
        }
        System.out.println("-----------------");
        int counter5= 10;
        for (counter5 = 10; counter5 >= -10; counter5 = counter5 - 1){
            System.out.println(counter5);
        }



    }
}

