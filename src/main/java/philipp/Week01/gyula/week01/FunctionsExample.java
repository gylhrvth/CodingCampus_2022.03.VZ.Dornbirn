package philipp.Week01.gyula.week01;

public class FunctionsExample {
    public static void main(String[] args) {
        int testValue = 7;
        task1("Beispiel 1", testValue);
        task1("AAAA", 10);

        testValue = doubleInt(3);
    }

    public static int doSomething(){
        System.out.println(1+2);
        return 1+2;
    }

    public static int doubleInt(int number){
        System.out.println(2*number);
        return 2*number;
    }

    public static void task1(String name, int limit){
        System.out.println(name);
        for (int i = 0; i < limit; i++) {
            System.out.println(i);
        }
        System.out.println("========================");
    }

}
