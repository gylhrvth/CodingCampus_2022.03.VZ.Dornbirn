package cemil.Week4;

//import cemil.week04.Day4StringArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day4StringArrayTest {
    @Test
    public void testSortArrayAscending() {
        String[] unsortedArray = new String[]{"Z", "A", "V", "F", "U", "B"};
        String[] sortedArrayAsc = new String[]{"A", "B", "F", "U", "V", "Z"};

//        Day4StringArray.ascendingOrDescending(unsortedArray, true);
        Assertions.assertArrayEquals(sortedArrayAsc, unsortedArray, "Array is not sorted ascending!!!111");
    }

    @Test
    public void testSortArrayDescending() {
        String[] unsortedArray = new String[]{"Z", "A", "V", "F", "U", "B"};
        String[] sortedArrayDesc = new String[]{"Z", "V", "U", "F", "B", "A"};

//        Day4StringArray.ascendingOrDescending(unsortedArray, false);
        Assertions.assertArrayEquals(sortedArrayDesc, unsortedArray, "Array is not sorted descending!!!111");
    }

    @Test
    public void testEmptyArraySort() {
        String[] empty = new String[0];

//        Day4StringArray.ascendingOrDescending(empty, true);
        Assertions.assertArrayEquals(new String[0], empty);

//        Day4StringArray.ascendingOrDescending(empty, false);
        Assertions.assertArrayEquals(new String[0], empty);
    }
}
