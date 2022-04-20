package gyula.week05;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(getLength(0.1f));
        System.out.println(getLength(1.1234f));
        System.out.println(getLength(14f));
        System.out.println(getLength(990.56f));
        System.out.println(getLength(4567f));
    }

    public static int getLength(float value){
        return (int)Math.max(Math.ceil(Math.log10((int)value)), 1);
    }
}
