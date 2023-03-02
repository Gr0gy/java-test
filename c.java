import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово на англиском: ");
        String slovo = scan.nextLine(), copy = "";

        for (int i = 0; i < slovo.length(); i++) {
            if (i % 2 == 0) {
                copy += slovo.toUpperCase().charAt(i);
            } else {
                copy += slovo.toLowerCase().charAt(i);
            }
        }

        System.out.println(copy);
    }
}