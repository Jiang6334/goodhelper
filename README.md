# goodhelper
校园好帮手


## Maven
    quickstart -> Pom


## SpringBoot 开发
    约定大于配置
    编码，命名规范，jar包版本，所有能提前约定的都列出细化出来（尤其协同开发）
    
    Steps for building a springboot application
    1. 添加 maven 依赖
    2. 创建 配置文件 application.properties
    3. 项目启动类 


## RESTful Web Service:
    1. 添加数据：请求用post, 数据库操作对应insert
    2. 获取数据：请求用get，数据库操作对应select
    3. 更新数据：请求用put(幂等)/post(不幂等), 数据库操作对应update
    4. 删除数据：请求用delete，数据库操作对应delete 
    
    幂等：多次执行同一个sql，数据库中的数据记录是否一直。
        如，post方法向数据库插入同样的数据，数据库中的id是变化的，所以不幂等；
        而put可以满足多次插入相同的数据，数据库的记录是一致的，id不会变化，所以是幂等。
        
    TODO: 找spring boot实现的这4种方法的例子（自己再找，慕课网等等，一些初级教程都有这部分的介绍），参考下面连接：
    https://blog.csdn.net/Java_Fly1/article/details/103484954

## 日志系统slf4j
    1. 加注解@Slf4j
    2. 了解日志级别，什么情况下使用什么
       log.info(userId+"");
       log.error();
       log.debug();
       log.warn();
       log.trace();
## QA
    1. Lombok Dependency is missing
    在pom.xml中添加依赖，依赖的坐标位置在maven仓库(https://mvnrepository.com/tags/maven?__cf_chl_jschl_tk__=0de085be6b78313b3a145e578bf007464bb48a77-1596246426-0-ARgaZeydxhtMAlwTZteHm8wzLg_u0OholG8fMeagQD35MGw8DkkQpwbw2lfWZtELiX27-5g8jRnZU-akq1hlT8s8OMVcpLt971Jlz6zBCmAHJ7uIkSKGobvJuZHf5APaCZOpHp01QbpyCpVVbTdIkW23081q2c4PVmg7hkM-GLdOSrQ-cP2MQUUTmjouyH3wknumj4_EUfwRGQ-_bN5-P3mKcFKYooFvoZgpWH6DIK-VH7GxlJPvQZyFseny6ekuuK5WEHwERUMnVpGd21T22n7ifyDro_bU9XbJpA9FqSDYKZ2gJ4OMlZhG53Mnq1Ctu3DhtSSHJ6IA1WG0GdNkOCS4CJhoNXv_gohNm-gcg7fB)搜索得到
    lombok 可以在编译期自动生成一些常用的方法，如get,set,constructor
    需要稍微了解它的用法，简洁高效清晰的编程
    
    2. Idea 使用git
    * 在github上创建项目
    * 在idea, File -> New -> Project from version control , 填入git项目的克隆地址
    * 
    * 今后直接在github这个目录下写代码，写完一部分上传一部分是吧？对