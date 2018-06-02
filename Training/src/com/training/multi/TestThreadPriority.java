package com.training.multi;
public class TestThreadPriority {

    public static void main(String[] args) {

        HighPriorityThread highPriorityThread = new HighPriorityThread(); // create High Priority Thread
        LowPriorityThread lowPriorityThread = new LowPriorityThread(); // create Low Priority Thread
        Thread thread = new Thread(lowPriorityThread); // set low priority in thread to set particular priority
        
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // set max priority to High Priority Thread
        thread.setPriority(Thread.MIN_PRIORITY); // set min priority to Low Priority Thread

        highPriorityThread.start(); // start run High Priority Thread
        thread.start(); // start run Low Priority Thread

        System.out.println("The main() thread is finishing execution"); // print that main method is finish 
    }
}

/**
 * High Priority Thread class extends thread class
 */
class HighPriorityThread extends Thread {

    /**
     * run method is override method to start thread
     */
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("HighPriorityThread is printing " + i); // print from 1 to 5 and thread name
        }
    }

}

/**
 * Low Priority Thread class implements runnable interface
 */
class LowPriorityThread implements Runnable {

    /**
     * run method is override method to start thread
     */
    @Override
    public void run() {
        for (int i = 11; i <= 15; i++) {
            System.out.println("LowPriorityThread is printing " + i); // print from 11 to 15 and thread name
        }

    }
}
