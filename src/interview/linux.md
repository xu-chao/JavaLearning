## 列出几个常用的linux命令
- cd 切换目录
- ls 查看文件目录 
- grep 搜索
- cp 复制文件
- mv 移动文件
- rm 删除文件
- ps 输出进程
- kill 杀死进程

在vm 文件中 输入/'关键字' 可搜索关键字

## 检查java进程是否存在；
 ps -ef |grep java

## 终止pid为18037的线程
 kill -9 18037

## 查看端口占用
 netstat -antp
 
 
## Redis操作命令
Redis：

- Redis-server /usr..../redis.conf 启动redis服务，并指定配置文件
- Redis-cli 启动redis 客户端
- Pkill redis-server 关闭redis服务
- Redis-cli shutdown 关闭redis客户端
- Netstat -tunpl|grep 6379 查看redis 默认端口号6379占用情况
