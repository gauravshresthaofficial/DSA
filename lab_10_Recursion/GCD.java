class GCD
{
    static int hcf(int a, int b)
    {
        if(b == 0)
        return a;

        return hcf( b , a % b);
    }


    public static void main(String[] args) {
        System.out.println("The GCD is: " + hcf(40,20));
    }
}
