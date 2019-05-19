package practice.sort.com;

public class recursion
{
    public static void main(String[] args)
    {
        int couunter = 5;
        int result;
        result = recursion(couunter);
        System.out.println("The result is → " + result);
    }

    public static int recursion(int n)
    {
        int result = 1;
        if (n != 1) {
            result = n * recursion(n - 1);
        }
        return result;
    }
}
