package philipp.week07.vectorExercises;

import java.util.Random;
import java.util.Vector;

public class VectorExercises {
    static Random rn = new Random();

    public static void main(String[] args) {
        Vector<Integer> vec = createVectorNumbers(20);

//        System.out.println(vec);
//        System.out.println("----");
//        amountEvenNumbers(vec);
//        System.out.println("----");
//        minAndMaxNumbers(vec);
//        System.out.println("----");
//        sortDsc(vec, false);
//        sortDsc(vec, true);
//        System.out.println("----");
//        deleteUnevenNumbers(vec);
        System.out.println("----");
        combineVector();

    }

    private static Vector<Integer> createVectorNumbers(int vSize) {
        Vector<Integer> vec = new Vector<>();
        for (int i = 0; i < vSize; i++) {
            vec.add(Integer.valueOf(rn.nextInt(99)));
        }
        return vec;
    }

    private static void amountEvenNumbers(Vector<Integer> vec) {
        for (Integer i : vec) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private static void minAndMaxNumbers(Vector<Integer> vec) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : vec) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);
    }

    private static void sortVector(Vector<Integer> vec, boolean asc) {
        for (int i = 0; i < vec.size() - 1; i++) {
            for (int j = 0; j < vec.size() - 1 - i; j++) {
                if (asc != vec.get(j) < vec.get(j + 1)) {
                    Integer temp = vec.get(j);
                    vec.set(j, vec.get(j + 1));
                    vec.set(j + 1, temp);
                }
            }
        }
        System.out.println(vec);
    }

    private static void deleteUnevenNumbers(Vector<Integer> vec) {
        Vector<Integer> toRemove = new Vector<>();
        for (Integer i : vec) {
            if (i % 2 != 0) {
                toRemove.add(i);
            }
        }
        for (Integer i : toRemove) {
            vec.remove(i);
        }
//        vec.removeIf(i -> i % 2 != 0);
        System.out.println(vec);
    }

    private static void combineVectorWRONG(boolean asc) {
        Vector<Integer> vec1 = createVectorNumbers(20);
        sortVector(vec1, asc);

        Vector<Integer> vec2 = createVectorNumbers(20);
        sortVector(vec2, asc);

        Vector<Integer> vecOutput = new Vector<>();
        vecOutput.addAll(vec1);
        vecOutput.addAll(vec2);

        sortVector(vecOutput, asc);

    }

    private static void combineVector() {
        Vector<Integer> vec1 = createVectorNumbers(5);
        sortVector(vec1, true);
        Vector<Integer> vec2 = createVectorNumbers(40);
        sortVector(vec2, true);
        Vector<Integer> vecOutput = new Vector<>();
        int indexVec1 = 0;
        int indexVec2 = 0;

        while (indexVec1 < vec1.size() || indexVec2 < vec2.size()) {
            if ((indexVec2 == vec2.size()) ||
                (indexVec1 < vec1.size() && indexVec2 < vec2.size() && vec1.get(indexVec1) < vec2.get(indexVec2))) {
                vecOutput.add(vec1.get(indexVec1));
                indexVec1++;
            } else {
                vecOutput.add(vec2.get(indexVec2));
                indexVec2++;
            }
        }
        System.out.println(vecOutput);

    }
}
