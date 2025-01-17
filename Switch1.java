import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();
        System.out.println("enter the operator: ");
        char op = sc.next().charAt(0);
        int result;
        switch (op) {
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Invalid operator");
                return;

        }
        System.out.println(result);

        sc.close();
    }
}
