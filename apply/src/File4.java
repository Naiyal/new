import java.util.Scanner;

/**
 * File4
 */
public class File4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int n[] = new int[size];
        for (int index = 0; index < n.length; index++) {
            System.out.print("Enter element #" + (index + 1) + " : ");
            n[index] = in.nextInt();
        }
        int sum = 0;
        for (int m : n)
            sum += m;
        System.out.println("average = " + (float) sum / n.length);

    }
}