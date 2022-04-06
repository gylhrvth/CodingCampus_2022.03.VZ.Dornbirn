package lukas.week4.day3;

public class Color {
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = new String[]{
            "\u001B[31m",
            "\u001B[32m",
            "\u001B[33m",
            "\u001B[34m",
            "\u001B[35m",
            "\u001B[36m",
            "\u001B[37m"
    };

    public static final String[] BACKGROUND_COLORS = new String[]{
            "\033[40m",
            "\033[41m",
            "\033[42m",
            "\033[43m",
            "\033[44m",
            "\033[45m",
            "\033[46m"
    };
}
