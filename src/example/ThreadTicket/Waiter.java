package example.ThreadTicket;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 多线程等待
 * @date 2021/1/20 10:58:10
 * @Version 1.0
 */
public class Waiter implements Runnable {

    private Message msg;

    public Waiter(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + "等待时间" + System.currentTimeMillis());
                //持有该线程的会等待
                msg.wait();
                System.out.println(name + "--" + msg.getMsg() + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
