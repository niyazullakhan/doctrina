public class Factorial {
    public static void main(String[] args) {
        int input = 2;

        System.out.println(fact(input));
    }

    private static int fact(int input) {
        if(input==1)
            return 1;

        return input*fact(input-1);
    }

    //nCr = fact(n)/fact(r)*fact(n-r)
}
