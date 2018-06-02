package com.training.multi;
public class TestLuckyDrawGifts {

    public static void main(String[] args) throws InterruptedException {

        IssueGiftsThread thread_1 = new IssueGiftsThread(); // create first thread
        IssueGiftsThread thread_2 = new IssueGiftsThread(); // create second thread
        IssueGiftsThread thread_3 = new IssueGiftsThread(); // create third thread

        thread_1.start(); // start thread 1
        thread_2.sleep(500); // sleep thread 2 until thread 1 finish
        thread_2.start(); // start thread 2
        thread_3.sleep(1000); // sleep thread 3 until thread 2 and 1 finish
        thread_3.start(); // start thread 3

    }

}

/**
 * Lucky Draw Gifts class have gifts
 */
class LuckyDrawGifts {

    // arrays of gifts in decs order
    public String[] lcds = {"Sony 55", "Sony 42", "Sony 32"}; 
    public String[] mobiles = {"Sony Xperia Z", "Sony Xperia L", "Sony Xperia E3"};
    public String[] hampers = {"Snapdeal INR 2000", "Amazon INR 1000", "Bigbazaar INR 500"};

}

/**
 * Issue Gifts Thread class manage gifts
 */
class IssueGiftsThread extends Thread {

    private static int threads = 0; // decide in which thread
    LuckyDrawGifts gifts = new LuckyDrawGifts(); // object of gifts

    /**
     * run method is override method to start thread
     */
    @Override
    public void run() {
        threads++;
        String[] gift = null;
        if (threads == 1) { // if first thread gifts is lcds
            gift = gifts.lcds;
        } else if (threads == 2) { // if second thread gifts is mobiles
            gift = gifts.mobiles;
        } else if (threads == 3) { // if third thread gifts is hampers
            gift = gifts.hampers;
        }
        for (int i = 0; i < gift.length; i++) {
            System.out.println(gift[i] + "  "); // print gifts
        }
    }

}
