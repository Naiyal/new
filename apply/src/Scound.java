import java.util.Scanner;

/**
 * Scound
 */
public class Scound {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dag = 0;
        int m = 0;
        int d = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("Enter dagre " + (m + 1) + "#   ");
            d = in.nextInt();

            if (d != -1) {
                dag += d;
                m++;
            } else {
                flag = false;
            }
        }
        System.out.println("avrag = " + (dag / m));
    }

}