import java.util.random.*;
class stkclass implements Runnable {
    static int ticketNum = 10000;
    int tTicket;
    Thread t;

    stkclass(String name) {
        tTicket = 0;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        Random rand = new Random();
        int selled = rand.nextInt(1, 5);
        while (getTicket(selled)) {
            tTicket += selled;
            System.out.printf("%s 此次賣出 %d 張\n", t.getName(), selled);
        }
        System.out.printf("%s 共賣出 %d 張\n", t.getName(), tTicket);
    }

    synchronized private static boolean getTicket(int num) {
        if (ticketNum >= num) {
            ticketNum -= num;
            return true;
        } else {
            return false;
        }
    }
    public class hw_0929 {
        public static void main(String[] args) {
            sellClass tA = new sellClass("A");
            sellClass tB = new sellClass("B");
            sellClass tC = new sellClass("C");
            sellClass tD = new sellClass("D");
        }
    }
}
