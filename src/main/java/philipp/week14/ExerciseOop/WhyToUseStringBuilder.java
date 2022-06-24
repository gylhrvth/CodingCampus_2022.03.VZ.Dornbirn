package philipp.week14.ExerciseOop;

public class WhyToUseStringBuilder {
    public static void main(String[] args) {
        String a = "";

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < Integer.MAX_VALUE / 10000; i++) {
            a += "a";
        }

        long end = System.currentTimeMillis();
        System.out.println("Took: " + (end - start) + "ms " + a.length());

        start = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < Integer.MAX_VALUE / 10000; i++) {
            builder.append("a");
        }
        String b = builder.toString();
        end = System.currentTimeMillis();

        System.out.println("Took: " + (end - start) + "ms " + b.length());

        System.out.println("Are strings the same: " + b.equals(a));
    }
}
