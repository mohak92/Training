package com.training.multi;
/**
 * first thread class extends thread class
 */
class FirstThread extends Thread {

    /**
     * run method is override method to start thread
     */
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("FirstThread is printing " + i); // print from 1 to 5 and thread name
        }
    }

}

/**
 * second thread class implements runnable interface
 */
class SecondThread implements Runnable {

    /**
     * run method is override method to start thread
     */
    @Override
    public void run() {
        for (int i = 11; i <= 15; i++) {
            System.out.println("SecondThread is printing " + i); // print from 11 to 15 and thread name
        }
    }

}

public class TestThread {

    public static void main(String[] args) {
        
        FirstThread firstThread = new FirstThread(); // create first thread
        SecondThread secondThread =new SecondThread(); // create second thread
        
        firstThread.start(); // start run first thread 
        secondThread.run(); // start run second thread 
        
        System.out.println("The main() thread is finishing execution"); // print that main method is finish 
    }
}
