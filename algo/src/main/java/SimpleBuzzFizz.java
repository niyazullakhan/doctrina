package arrays;

public class SimpleBuzzFizz {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            if(i % 15 ==0) {
                System.out.print("BuzzFizz\t");
            }
            else if (i%3 == 0) {
                System.out.print("Buzz\t");
            }
            else if(i%5==0) {
                System.out.print("Fizz\t");
            } else {
                System.out.print(i + "\t");
            }
        }
    }
}
