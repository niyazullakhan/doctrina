package concurrency;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;

    private static Semaphore fooS = new Semaphore(1);
    private static Semaphore barS = new Semaphore(1);

    static {
        try {
            barS.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            fooS.acquire();
            printFoo.run();
            barS.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            barS.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooS.release();
        }
    }
}
