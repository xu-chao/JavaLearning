package example.ThreadTicket;

/**
 * 参数 null
 * @author xuchao
 * @description 多线程
 * @date 2021/1/20 10:59:00
 * @Version     1.0
 */
public class Notifier implements Runnable{

    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg){
            msg.setMsg("唤醒线程工作");
            msg.notifyAll();
        }
    }
}
