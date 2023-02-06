import java.util.Scanner;

class Factorial{
    static int fact(int num)
    {
        if(num == 1)
        return 1;

        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial: ");
        int x = scan.nextInt();

        System.out.println("The Factorial of " + x + " is: " + fact(x));
    }
}