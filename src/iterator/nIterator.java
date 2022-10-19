package iterator;

import java.util.Iterator;

public class nIterator implements Iterable<Integer>{

    private final int stop;

    public nIterator(int stop) {
        this.stop = stop;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int counter = 1;
            @Override
            public boolean hasNext() {
                return counter <= stop;
            }

            @Override
            public Integer next() {
                counter++;
                return (int)(Math.random() * 100);
            }
        };
    }

    public static void main(String[] args) {
        nIterator iterator = new nIterator(10);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }
    }
}
