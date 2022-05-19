package cyclicbarrier;

import cyclicbarrier.ferry.Ferry;

public class Main {
    public static void main(String[] args) {
        new Thread(new Ferry()).start();
    }
}
