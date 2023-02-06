import util.java.Scanner;

class Fibonacci{
    static int Fib(int num)
    {
        if(num == 0)
        return 0;

        if(num == 1 || num == 2)
        return 1;

        return Fib(num-1) + Fib(num -2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int x = scan.nextInt();

        System.out.println("The Fibonanci series is: ");

        for(int i = 0; i <= x; i++)
        {
            System.out.print(Fib(i) + " ");
        }
    }
}