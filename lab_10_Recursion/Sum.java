class Sum
{
    static int add(int num)
    {
        if(num == 1)
        return 1;

        return num + add(num -1);
    }

    public static void main(String[] args) {
        System.out.println("The sum of first 20 natural number is: " + add(20));
    }
}