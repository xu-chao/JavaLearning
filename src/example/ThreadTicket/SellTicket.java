package example.ThreadTicket;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 多线程卖票
 * @date 2021/1/20 10:57:37
 * @Version 1.0
 */
public class SellTicket implements Runnable {

    private static int ticketCount = 100;

    private Object object = new Object();

    @Override
    public void run() {
        try {
            while (ticketCount > 0) {
                sellTicket();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private synchronized static void sellTicket() {
        //synchronized 同步代码块  锁 任何一个对象
        if (ticketCount > 0) {
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "余票还剩" + ticketCount + "张");
        } else {
            System.out.println("票卖完了");
        }
    }
}
