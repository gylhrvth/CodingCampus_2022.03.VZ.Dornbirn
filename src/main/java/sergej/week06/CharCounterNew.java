package sergej.week06;

public class CharCounterNew {
    class NoOfOccurenceOfCharacters {
        static final int MAX_CHAR = 256;

        static void getOccuringChar(String str) {

            int count[] = new int[MAX_CHAR];

            int len = str.length();

            // Initialize count array index
            for (int i = 0; i < len; i++)
                count[str.charAt(i)]++;

            // Create an array of given String size
            char ch[] = new char[str.length()];
            for (int i = 0; i < len; i++) {
                ch[i] = str.charAt(i);
                int find = 0;
                for (int j = 0; j <= i; j++) {

                    // If any matches found
                    if (str.charAt(i) == ch[j])
                        find++;
                }

                if (find == 1)
                    System.out.println(
                            "Number of Occurrence of "
                                    + str.charAt(i)
                                    + " is:" + count[str.charAt(i)]);
            }
        }

        // Driver Code
        public static void main(String[] args) {
            String str = "geeksforgeeks";
            getOccuringChar(str);
        }
    }
}
