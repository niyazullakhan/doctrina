package bit_operations;

public class SetBitAtPosition {
    public static void main(String[] args) {
        int n=4;
        System.out.println(setBit(n, 2));
    }

    private static int setBit(int n, int i) {
        return n | (1 << i-1);
    }
}
