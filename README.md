# spring boot demo

一、spring-boot-mybatis-xml

Spring Boot 1.5.9使用MyBatis集成MySql数据库，myBatis generator自动生成Entity、Mapper类和对应的xml配置文件
ps:
  1、需先安装eclipse插件mybatis generator，可以eclipse->help->Eclipse Marketplace，然后搜索mybatis generator，选择install即可。
  2、安装完插件后右键/src/main/resources/generator/generatorConfig.xml文件，选择Run As->Run MyBatis Generator运行。
  3、/src/main/java/com/zheng/mapper/、/src/main/java/com/zheng/entity、/src/main/resources/mybatis/mapper/这三个文件下就会出现自动生成的代码和配置文件。


二、spring-boot-noparent-war

spring boot不继承spring-boot-starter-parent打包成war
