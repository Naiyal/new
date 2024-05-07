import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter oprater * / % + - ");
        char c = in.next().charAt(0);
        System.out.println("Enter n1 :");
        int n1 = in.nextInt();
        System.out.println("Enter n2 :");
        int n2 = in.nextInt();
        switch (c) {
            case '*':
                System.out.println("res= " + (n1 * n2));
                break;
            case '+':
                System.out.println("res= " + (n1 + n2));
                break;
            case '-':
                System.out.println("res= " + (n1 - n2));
                break;
            case '/':
                System.out.println("res= " + (n1 / n2));
                break;
            case '%':
                System.out.println("res= " + (n1 % n2));
                break;
            default:
                System.out.println("not operater this");
        }

    }
}