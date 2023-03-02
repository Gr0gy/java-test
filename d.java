import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input sentence or slovo: ");
        String slovo = scan.nextLine();
        int zamena = 0;

        for (int i = 0; i < slovo.length(); i++) {
            // eng "o"
            if (slovo.toLowerCase().charAt(i) == 'o') {
                slovo = slovo.replaceFirst("o", "0");
                zamena++;
            }
        }

        System.out.println(slovo);
        System.out.println(zamena);
    }
}
