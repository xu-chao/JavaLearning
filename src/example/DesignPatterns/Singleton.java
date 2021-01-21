package example.DesignPatterns;

/**
 * 参数 null
 *
 * @author xuchao
 * @description 单例模式
 * @date 2021/1/20 11:02:38
 * @Version 1.0
 */
public class Singleton {

//    //私有的静态变量
//    private static final Singleton INSTANCE = new Singleton();
//
//    //构造器私有化
//    private Singleton(){
//
//    }

    private static Singleton instance = null;

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }


}
