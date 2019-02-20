##淘淘商城 
* taotao-parent 父项目 pom 通用jar版本管理


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