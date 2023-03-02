import java.util.Scanner;

class randomaizer {
    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 || low >= high)
            return;
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];
        int i = low, k = high;
        while (i <= k) {
            while (sortArr[i] < border)
                i++;
            while (sortArr[k] > border)
                k--;
            if (i <= k) {
                int temp = sortArr[i];
                sortArr[i] = sortArr[k];
                sortArr[k] = temp;
                i++;
                k--;
            }
        }
        if (low < k)
            quickSort(sortArr, low, k);
        if (high > i)
            quickSort(sortArr, i, high);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int longi = sc.nextInt();
        System.out.print("Введите максимальное число в массиве: ");
        int max = sc.nextInt();
        int[] sortArr = new int[longi];
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int) (Math.random() * max);
        }
        quickSort(sortArr, 0, sortArr.length - 1);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}