## Java基础
HashMap的源码，实现原理，JDK8中对HashMap做了怎样的优化。
HaspMap扩容是怎样扩容的，为什么都是2的N次幂的大小。
HashMap，HashTable，ConcurrentHashMap的区别。
极高并发下HashTable和ConcurrentHashMap哪个性能更好，为什么，如何实现的。
HashMap在高并发下如果没有处理线程安全会有怎样的安全隐患，具体表现是什么。
java中四种修饰符的限制范围。 Object类中的方法。
接口和抽象类的区别，注意JDK8的接口可以有实现。 动态代理的两种方式，以及区别。
Java序列化的方式。 传值和传引用的区别，Java是怎么样的，有没有传值引用。
一个ArrayList在循环过程中删除，会不会出问题，为什么。
@transactional注解在什么情况下会失效，为什么。 
## 数据结构和算法 
 B+树 快速排序，堆排序，插入排序（其实八大排序算法都应该了解
 一致性Hash算法，一致性Hash算法的应用 
## JVM 
JVM的内存结构。 JVM方法栈的工作过程，方法栈和本地方法栈有什么区别。
JVM的栈中引用如何和堆中的对象产生关联。 可以了解一下逃逸分析技术。
GC的常见算法，CMS以及G1的垃圾回收过程，CMS的各个阶段哪两个是Stop the
world的，CMS会不会产生碎片，G1的优势。 标记清除和标记整理算法的理解以及优缺点。 eden
survivor区的比例，为什么是这个比例，eden survivor的工作过程。
JVM如何判断一个对象是否该被GC，可以视为root的都有哪几种类型。
强软弱虚引用的区别以及GC对他们执行怎样的操作。 Java是否可以GC直接内存。
Java类加载的过程。 双亲委派模型的过程以及优势。 常用的JVM调优参数。 dump文件的分析。
Java有没有主动触发GC的方式（没有）。 
## 多线程 
Java实现多线程有哪几种方式。 Callable和Future的了解。
线程池的参数有哪些，在线程池创建一个线程的过程。 volitile关键字的作用，原理。
synchronized关键字的用法，优缺点。 Lock接口有哪些实现类，使用场景是什么。
可重入锁的用处及实现原理，写时复制的过程，读写锁，分段锁（ConcurrentHashMap中的segment）。
悲观锁，乐观锁，优缺点，CAS有什么缺陷，该如何解决。 ABC三个线程如何保证顺序执行。
线程的状态都有哪些。 sleep和wait的区别。 notify和notifyall的区别。
ThreadLocal的了解，实现原理。 
## 数据库相关 
常见的数据库优化手段 索引的优缺点，什么字段上建立索引 数据库连接池。 durid的常用配置。  
 
## 计算机网络 
TCP，UDP区别。 三次握手，四次挥手，为什么要四次挥手。 长连接和短连接。
连接池适合长连接还是短连接。 
## 设计模式
观察者模式 代理模式 单例模式，有五种写法，可以参考文章单例模式的五种实现方式
可以考Spring中使用了哪些设计模式 
## 分布式相关
分布式事务的控制。 分布式锁如何设计。 分布式session如何设计。
dubbo的组件有哪些，各有什么作用。 zookeeper的负载均衡算法有哪些。
dubbo是如何利用接口就可以通信的。 

## 缓存相关
redis和memcached的区别。 redis支持哪些数据结构。
redis是单线程的么，所有的工作都是单线程么。 redis如何存储一个String的。
redis的部署方式，主从，集群。
redis的哨兵模式，一个key值如何在redis集群中找到存储在哪里。 redis持久化策略。

## 框架相关
 SpringMVC的Controller是如何将参数和前端传来的数据一一对应的。
 Mybatis如何找到指定的Mapper的，如何完成查询的。 Quartz是如何完成定时任务的。
 自定义注解的实现。 Spring使用了哪些设计模式。 Spring的IOC有什么优势。
 Spring如何维护它拥有的bean。 
 
## 一些较新的东西 
JDK8的新特性，流的概念及优势，为什么有这种优势。 区块链了解
如何设计双11交易总额面板，要做到高并发高可用。 

## 一些小建议
可以去leetcode上刷题换换思路。 八大排序算法一定要手敲一遍（快排，堆排尤其重要）。
了解一些新兴的技术。
面试之后面试官都会问你有没有什么问题，千万不要没问题，也别傻乎乎的问一些敏感问题。
了解你要面试的公司的产品及竞争产品。 

- http://www.importnew.com/22083.html
- http://www.importnew.com/22087.html
- http://www.importnew.com/17232.html