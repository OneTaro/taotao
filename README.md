##淘淘商城 
* taotao-parent 父项目 pom 通用jar版本管理

###服务
+ dubbo服务
+ zookeeper服务
+ mybatis逆向工程
+ 图片服务器ngnix
+ 分布式文件系统FastDFS

###项目启动操作
+ 启动虚拟机，打开zookeeper服务和dubbo-admin监听服务
+ 启动项目 taotao-manager、taotao-manager-web

###逆向工程  
+ 逆向工程生成的文件是单表查询

###常见问题
问题一、java.lang.ClassNotFoundException: com.fasterxml.jackson.databind.exc.InvalidDefinitionException  
原因：spring和jackson版本不匹配导致的。  
解决：spring 5.0.6.RELEASE 和 jackson 2.9.4 匹配  

问题二、Opening socket connection to server 192.168.1.129/192.168.1.129:2181. Will not attempt to authenticate using SASL 
(unknown error)  
原因1：centos7防火墙未关闭，阻止访问。 -- 本次报错原因  
解决1：关闭防火墙。[关闭方法](https://www.cnblogs.com/moxiaoan/p/5683743.html)
```
firewalld的基本使用
启动：systemctl start firewalld
关闭：systemctl stop firewalld
查看状态：systemctl status firewalld 
开机禁用：systemctl disable firewalld
开机启用：systemctl enable firewalld
```
原因2：zookeeper客户端和服务端版本不一致导致。 -- 可能原因  
解决2；修改pom中版本  

问题三、Cannot resolve com.mysq.jdbc.Connection.ping method.  Will use 'SELECT 1' instead.  
原因：druid与mysql版本兼容性问题  
解决：<mysql.version>5.1.34</mysql.version> 和 <druid.version>1.0.9</druid.version>

问题四、java.lang.ClassCastException: com.github.pagehelper.PageHelper cannot be cast to org.apache.ibatis.plugin.Interceptor
原因：视频中给出的分页插件是改过的，支持多边查询的分页。而我们引入的高版本的分页插件中，已经修复了这个bug，所以在写配置文件的时候，不需要再配置方言，会默认的读取方言信息。
解决：去掉方言配置。[参考方法](https://blog.csdn.net/ljm15832631631/article/details/78639487)