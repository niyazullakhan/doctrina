import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SortBallsWithSameColour {

    public static class Balls {
        private String colour;
        private int weight;

        public Balls(String colour, int priority) {
            this.colour = colour;
            this.weight = priority;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Balls> bag = new PriorityQueue<Balls>(new Comparator<Balls>() {
            @Override
            public int compare(Balls o1, Balls o2) {
                return o2.weight-o1.weight;
            }
        });

        bag.add(new Balls("o", 2));
        bag.add(new Balls("b", 1));
        bag.add(new Balls("r", 3));
        bag.add(new Balls("o", 2));


        Iterator<Balls> iterator = bag.iterator();
        while(iterator.hasNext()) {
            Balls peek = bag.peek();
            System.out.println("ccolour:"+peek.colour);
            bag.remove();
        }
    }
}
