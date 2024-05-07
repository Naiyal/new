import java.util.Arrays;

public class File3 {
    static void print(int n[]) {
        for (int m : n) {
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 5, 2, 1 },
                { 2, 1, 3 },
        };
        int arr2[][];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + arr[j][i]);
                // arr2[][]=arr[j][i];
            }
            System.out.println("");
        }

    }
}