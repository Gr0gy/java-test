import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int max = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int longi = sc.nextInt();
        int[] arrays = new int[longi];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * max);
        }
        System.out.println("Массив с рандомными числами: " + Arrays.toString(arrays));
        boolean sorts = false;
        while (!sorts) {
            sorts = true;
            for (int i = 1; i < arrays.length; i++) {
                if (arrays[i] > arrays[i - 1]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[i - 1];
                    arrays[i - 1] = temp;
                    sorts = false;
                }
            }
        }
        System.out.println("Отсартированный массив: " + Arrays.toString(arrays));
    }
}