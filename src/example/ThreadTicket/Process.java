package example.ThreadTicket;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 多线程
 * @date 2021/1/20 10:57:18
 * @Version 1.0
 */
public class Process {

    //开启线程有两种方式
    // 实现Runnable接口  和 继承Thread类

    public static void main(String[] args) {
        //实现Runnble 接口需要new Thread   但是继承Thread类不需要
        Thread t1 = new Thread(new SellTicket(), "窗口1");
        Thread t2 = new Thread(new SellTicket(), "窗口2");
        Thread t3 = new Thread(new SellTicket(), "窗口3");
        Thread t4 = new Thread(new SellTicket(), "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // wait notify notifyall
//         Message msg = new Message("锁");
//         Waiter waiter = new Waiter(msg);
//         new Thread(waiter,"waiter").start();
//         Waiter waiter1 = new Waiter(msg);
//         new Thread(waiter,"waiter1").start();
//
//         Notifier notifier = new Notifier(msg);
//         new Thread(notifier,"notifier").start();
    }
}
