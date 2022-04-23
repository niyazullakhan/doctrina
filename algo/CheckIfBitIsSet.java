package bit_operations;

public class CheckIfBitIsSet {
    public static void main(String[] args) {
        int i=2;
        int position=1;
        int check =  i & (1 << position);

        System.out.println(check);
    }
}
