package sergej.week07;


public class BookPrinter {


    private static void printBook(Book[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static Book minPage(Book[] list) {
        Book min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPages() < min.getPages()) {
                min = list[i];
            }
        }
        return min;
    }

    private static Book maxPage(Book[] list) {
        Book max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPages() > max.getPages()) {
                max = list[i];
            }
        }
        return max;
    }

    private static int avgPage(Book[] list) {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getPages();
        }
        avg = sum / list.length;
        return avg;
    }

    public static void bubbleSortString(Book[] array, boolean ascending) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (ascending) {
                    if (array[j].getTitle().compareTo(array[j + 1].getTitle()) > 0) {
                        swap(array, j, j + 1);
                    }
                } else {
                    if (array[j].getTitle().compareTo(array[j + 1].getTitle()) < 0) {
                        swap(array, j, j + 1);
                    }
                }
            }
        }
    }

    public static void bubbleAscending(Book[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getPages() > array[j + 1].getPages()) {
                   swap(array,j,j+1);
                }
            }
        }

    }

    private static void swap(Book[] array, int indexA, int indexB) {
        Book swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }



    public static void main(String[] args) {

        Book[] list = {
                new Book("Sergej goes to campus", "lala la", 175),
                new Book("TimoKant isch verbrannt ;)", "auf und drauf", 8),
                new Book("Aron", "Hallo Welt", 75),};


        printBook(list);
        System.out.println("+++++++++++++++++++++");
        System.out.println(minPage(list));
        System.out.println("--------------------");
        System.out.println(maxPage(list));
        System.out.println("Average page size of all books: " + avgPage(list));
        System.out.println("Sorted:");
        bubbleSortString(list,true);
        printBook(list);
        bubbleAscending(list);
        System.out.println("Sorted by pages size: ");
        printBook(list);


    }

}

