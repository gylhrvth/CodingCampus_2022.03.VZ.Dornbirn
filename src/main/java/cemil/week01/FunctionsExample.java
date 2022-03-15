package cemil.week01;

public class FunctionsExample {

    public static void task1(int limitStart,int limitEnd){
        for (int i=limitStart; i <= limitEnd; ++i) {
            System.out.println(i);
        }
    }
    public static void task2(int limitStart,int limitEnd) {
        for (int i = limitStart; i < limitEnd; ++i) {
            System.out.println(i);

        }
    }
    public static void task3(int limitStart,int limitEnd) {
        for (int i = limitStart; i <= limitEnd; i+=2) {
            System.out.println(i);

        }
    }
    public static void task4(int limitStart,int limitEnd) {
        for (int i = limitStart; i >= limitEnd; --i) {
            System.out.println(i);

        }
    }
    public static void task5(int limitStart,int limitEnd) {
        int i = limitStart;
        while ( i != limitEnd) {

            System.out.println(i);

            if (limitStart <= limitEnd) {
                ++i;
            } else {
                --i;
            }
        }
        System.out.println(limitEnd);
    }








    public static void main(String[] args) {

       task1(0,10);
        System.out.println("--------------1");
       task2(0,10);
        System.out.println("--------------2");
       task3(0,10);
        System.out.println("--------------3");
        task4(10,-10);
        System.out.println("--------------4");
        task5(15,10);
        System.out.println("--------------5");

    }
}
