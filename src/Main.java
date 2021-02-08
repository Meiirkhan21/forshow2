import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        System.out.println("Enter first num");
        first = num.nextInt();

        if (first >= 50)
            System.out.print("num is 10");
    }
}
