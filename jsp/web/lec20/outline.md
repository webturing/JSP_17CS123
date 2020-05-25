lec20 jsp基本对象
## 环境配置
0. 安装java 配置JAVA_HOME,CLASSPATH
1. 安装tomcat,学习Tomcat目录结构
2. 从Idea开发环境中，配置服务器Tomcat
3. 导入（创建一个web项目) 了解web项目的结构
- src 项目中java代码
- web/WEB-INF **** web.xml 网站的核心配置
- web/WEB-INF/classes：  用户java程序的编译文件
- web/WEB-INF/lib/  存放该项目对应的第三方jar包
- web/WEB-INF/tags/ 重复使用jsp代码片段
- web jsp页面： UI/跳转逻辑
4. jsp开发提示：导入模块的依赖库(tomcat/lib/)

##JSP对象

1、request对象*
　　request 对象是 javax.servlet.httpServletRequest类型的对象。 该对象代表了客户端的请求信息，主要用于接受通过HTTP协议传送到服务器的数据。（包括头信息、系统信息、请求方式以及请求参数等）。request对象的作用域为一次请求。

2、response对象*
　　response 代表的是对客户端的响应，主要是将JSP容器处理过的对象传回到客户端。response对象也具有作用域，它只在JSP页面内有效。

3、session对象
　　session 对象是由服务器自动创建的与用户请求相关的对象。服务器为每个用户都生成一个session对象，用于保存该用户的信息，跟踪用户的操作状态。session对象内部使用Map类来保存数据，因此保存数据的格式为 “Key/value”。 session对象的value可以使复杂的对象类型，而不仅仅局限于字符串类型。

4、application对象
 　　application 对象可将信息保存在服务器中，直到服务器关闭，否则application对象中保存的信息会在整个应用中都有效。与session对象相比，application对象生命周期更长，类似于系统的“全局变量”。

5、out 对象*
　　out 对象用于在Web浏览器内输出信息，并且管理应用服务器上的输出缓冲区。在使用 out 对象输出数据时，可以对数据缓冲区进行操作，及时清除缓冲区中的残余数据，为其他的输出让出缓冲空间。待数据输出完毕后，要及时关闭输出流。