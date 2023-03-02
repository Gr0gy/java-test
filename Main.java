import java.util.Scanner;

public class Main {
    public static final String USER_SIGN = "X";
    public static final String USER_SIGN_SECOND = "O";
    public static final String NOT_SIGN = "*";
    public static final int DIMENSION = 3;
    public static String[][] field = new String[DIMENSION][DIMENSION];

    public static void main(String[] args) {
        System.out.println("Выберите : ");
        System.out.println("1. Старт");
        System.out.println("2. Выйти.");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        switch (i) {
            case 1: {
                modeTwoPlayers();
                break;
            }
            case 2: {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Было введено неверное значение!");
            }
        }
    }

    public static void modeTwoPlayers() {
        int count = 0;
        initField();
        while (true) {
            printField();
            userShot(USER_SIGN, 1);
            count++;
            if (checkWin(USER_SIGN)) {
                System.out.println("USER 1 WIN!!!");
                printField();
                break;
            }
            userShot(USER_SIGN_SECOND, 2);
            count++;
            if (checkWin(USER_SIGN_SECOND)) {
                System.out.println("USER 2 WIN!!!");
                printField();
                break;
            }
            if (count == Math.pow(DIMENSION, 2)) {
                printField();
                break;
            }
        }
    }

    public static void initField() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                field[i][j] = NOT_SIGN;
            }
        }
    }

    public static void printField() {
        for (int i = 0; i <= DIMENSION; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < DIMENSION; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < DIMENSION; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void userShot(String sign, int i) {
        int x = -1;
        int y = -1;
        do {
            if (i == 0) {
                System.out.println("Введите координаты x(ENTER) y(ENTER) (1 - " + DIMENSION + "): ");
            } else {
                System.out.println("Игрок " + i + ". Введите координаты x(ENTER) y(ENTER) (1 - " + DIMENSION + "):");
            }
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellBusy(x, y));
        field[x][y] = sign;
    }

    public static boolean isCellBusy(int x, int y) {
        if (x < 0 || y < 0 || x > DIMENSION - 1 || y > DIMENSION - 1) {
            return false;
        }
        return field[x][y] != NOT_SIGN;
    }

    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign) {
        for (int i = 0; i < DIMENSION; i++) {
            if (field[start_x + i * dx][start_y + i * dy] != sign)
                return false;
        }
        return true;
    }

    public static boolean checkWin(String sign) {
        for (int i = 0; i < DIMENSION; i++) {
            if (checkLine(i, 0, 0, 1, sign))
                return true;
            if (checkLine(0, i, 1, 0, sign))
                return true;
        }
        if (checkLine(0, 0, 1, 1, sign))
            return true;
        if (checkLine(0, DIMENSION - 1, 1, -1, sign))
            return true;
        return false;
    }
}