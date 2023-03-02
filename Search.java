import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину масива");
        int longi = sc.nextInt();
        longi++;
        int[] array = new int[longi];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " число: ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int result = 0;
        System.out.print("Введите число для поиска:");
        int search = sc.nextInt();
        int firstIndex = 0;
        int lastIndex = array.length;

        while (firstIndex <= lastIndex) {
            int middle = (firstIndex + lastIndex) / 2;

            if (search < array[middle]) {
                lastIndex = middle - 1;

            } else if (search > array[middle]) {
                firstIndex = middle + 1;

            } else {
                result = search;
                System.out.println("Индекс числа: " + middle);
                break;
            }
        }

        System.out.println("Число: " + result);
    }
}