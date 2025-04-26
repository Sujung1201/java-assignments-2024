import java.util.Scanner;

public class Exercise_13_3 {
    public static void main(String[] args) {
        char[][] map = new char[10][10];
        int x = 5, y = 5;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = '.';
            }
        }
        map[x][y] = 'X';

        while (true) {
            printMap(map);
            System.out.print("Enter command: ");
            char command = scanner.next().charAt(0);

            map[x][y] = '.';
            switch (command) {
                case 'n': if (x > 0) x--; break;
                case 's': if (x < 9) x++; break;
                case 'e': if (y < 9) y++; break;
                case 'w': if (y > 0) y--; break;
                case 'q': return;
                default: System.out.println("Invalid command!"); continue;
            }
            map[x][y] = 'X';
        }
    }

    public static void printMap(char[][] map) {
        for (char[] row : map) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
