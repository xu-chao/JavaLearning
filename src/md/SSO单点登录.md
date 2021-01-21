# 单点登录
只要登录过一次，在其他子系统中就无需重复登录

原理是登录过一次之后就会在cookie 或者session保存值，如果访问另外的子系统，子系统向登录系统发出请求，因为有值所以验证成功可以直接登录

## 根据cookie来实现单点登录
每次登陆调用login接口，第一次登陆生成cookie 保存token
响应到浏览器，之后子系统登陆根据浏览器的cookie所携带的token查询是否有值，有值就登录成功

## 根据cookie来退出
根据cookie登出只需要将maxAge设置为0是不够的，因为一个cookie对应一个path和domain，
所以删除时候必须设置这两个值才能删除

## 根据session实现单点登录
退出只需要sesion.invalidate就行了，session无效就是退出状态