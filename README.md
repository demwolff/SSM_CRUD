# 1.环境搭建

## 1.1POM.xml引入maven依赖

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>cn.cjy</groupId>
  <artifactId>ssmcrud</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>

  <name>ssm Maven Webapp</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <spring.version>5.0.2.RELEASE</spring.version>
    <slf4j.version>1.6.6</slf4j.version>
    <log4j.version>1.2.12</log4j.version>
    <shiro.version>1.2.3</shiro.version>
    <mysql.version>5.1.6</mysql.version>
    <mybatis.version>3.4.5</mybatis.version>
  </properties>

  <dependencies>

      <!--jSR303数据校验的支持；-->
      <dependency>
          <groupId>org.hibernate</groupId>
          <artifactId>hibernate-validator</artifactId>
          <version>5.4.1.Final</version>
      </dependency>

      <!--返回json字符串的支持-->
      <dependency>
          <groupId>com.fasterxml.jackson.core</groupId>
          <artifactId>jackson-databind</artifactId>
          <version>2.9.3</version>
      </dependency>

      <!--分页插件-->
    <dependency>
      <groupId>com.github.pagehelper</groupId>
      <artifactId>pagehelper</artifactId>
      <version>5.0.0</version>
    </dependency>

      <!--mbg-->
      <dependency>
      <groupId>org.mybatis.generator</groupId>
      <artifactId>mybatis-generator-core</artifactId>
      <version>1.3.5</version>
    </dependency>


    <!-- spring -->
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>aspectjweaver</artifactId>
      <version>1.6.8</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context-support</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-orm</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-test</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>${spring.version}</version>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>compile</scope>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>${mysql.version}</version>
    </dependency>

    <!--<dependency>-->
      <!--<groupId>javax.servlet</groupId>-->
      <!--<artifactId>javax.servlet-api</artifactId>-->
      <!--<version>3.1.0</version>-->
      <!--<scope>provided</scope>-->
    <!--</dependency>-->

      <dependency>
          <groupId>javax.servlet</groupId>
          <artifactId>servlet-api</artifactId>
          <version>2.5</version>
          <scope>provided</scope>
      </dependency>

    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>jsp-api</artifactId>
      <version>2.0</version>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
    </dependency>

    <!-- log start -->
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>${log4j.version}</version>
    </dependency>

    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>${slf4j.version}</version>
    </dependency>

    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-log4j12</artifactId>
      <version>${slf4j.version}</version>
    </dependency>

    <!-- log end -->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>${mybatis.version}</version>
    </dependency>

    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.0</version>
    </dependency>

    <dependency>
      <groupId>c3p0</groupId>
      <artifactId>c3p0</artifactId>
      <version>0.9.1.2</version>
      <type>jar</type>
      <scope>compile</scope>
    </dependency>

  </dependencies>

  <build>
    <finalName>ssmcrud</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-war-plugin</artifactId>
          <version>3.2.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>

```



## 1.2WEB.xml编写

在web.xml中注册三大组件：

- **listener**

  ​	启动Spring容器；ContextLoaderListener

- **servlet**

  ​	配置SpringMVC前端控制器；DispatcherServlet

- **filter**

  ​	解决中文乱码问题；CharacterEncodingFilter

  ​	使用Rest风格，将页面普通的post请求转为指定的delete或者put请求；HiddenHttpMethodFilter；

  ```java
  <?xml version="1.0" encoding="UTF-8"?>
  <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
           version="4.0">
  
      <!--1.启动Spring的容器-->
      <!--配置Spring的监听器，默认只加载WEB-INF目录下的applicationContext.xml配置文件-->
      <listener>
          <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
      </listener>
      <!--设置配置文件的路径-->
      <context-param>
          <param-name>contextConfigLocation</param-name>
          <param-value>classpath:applicationContext.xml</param-value>
      </context-param>
  
      <!--2.springmvc的前端控制器，拦截所有请求-->
      <!--配置前端控制器-->
      <servlet>
          <servlet-name>dispatcherServlet</servlet-name>
          <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
          <!--加载springMVC.xml配置文件-->
          <init-param>
              <param-name>contextConfigLocation</param-name>
              <param-value>classpath:springMVC.xml</param-value>
          </init-param>
          <!--启动服务器，创建该servlet-->
          <load-on-startup>1</load-on-startup>
      </servlet>
      <servlet-mapping>
          <servlet-name>dispatcherServlet</servlet-name>
          <url-pattern>/</url-pattern>
      </servlet-mapping>
  
      <!--3.字符编码过滤器，一定要放在所有过滤器之前-->
      <!--解决中文乱码的过滤器-->
      <filter>
          <filter-name>characterEncodingFilter</filter-name>
          <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
          <init-param>
              <param-name>encoding</param-name>
              <param-value>UTF-8</param-value>
          </init-param>
          <init-param>
              <param-name>forceRequestEncoding</param-name>
              <param-value>true</param-value>
          </init-param>
          <init-param>
              <param-name>forceResponseEncoding</param-name>
              <param-value>true</param-value>
          </init-param>
      </filter>
      <filter-mapping>
          <filter-name>characterEncodingFilter</filter-name>
          <url-pattern>/*</url-pattern>
      </filter-mapping>
  
      <!--4.使用Rest风格，将页面普通的post请求转为指定的delete或者put请求-->
      <filter>
          <filter-name>hiddenHttpMethodFilter</filter-name>
          <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
      </filter>
      <filter-mapping>
          <filter-name>hiddenHttpMethodFilter</filter-name>
          <url-pattern>/*</url-pattern>
      </filter-mapping>
  
      <filter>
          <filter-name>httpPutFormContentFilter</filter-name>
          <filter-class>org.springframework.web.filter.HttpPutFormContentFilter</filter-class>
      </filter>
      <filter-mapping>
          <filter-name>httpPutFormContentFilter</filter-name>
          <url-pattern>/*</url-pattern>
      </filter-mapping>
  
  
  </web-app>
  ```



## 1.3Spring配置文件applicationContext.xml的编写

包含的内容：

1. 开启注解的扫描，希望处理service和dao，controller不需要spring处理
2. Spring整合Mybatis框架
   1. 配置连接池
   2. 指定mybatis全局配置文件位置以及mybatis，mapper文件的位置
   3. 配置扫描器，将mybatis接口的实现加入到ioc容器中
   4. 配置一个可以执行批量的sqlSession
3. 配置spring框架声明式事务管理

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xmlns:tx="http://www.springframework.org/schema/tx"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
               http://www.springframework.org/schema/beans/spring-beans.xsd
               http://www.springframework.org/schema/tx
               http://www.springframework.org/schema/tx/spring-tx.xsd
               http://www.springframework.org/schema/aop
               http://www.springframework.org/schema/aop/spring-aop.xsd
               http://www.springframework.org/schema/context
               http://www.springframework.org/schema/context/spring-context.xsd">

    <!--开启注解的扫描，希望处理service和dao，controller不需要spring处理-->
    <context:component-scan base-package="cn.cjy">
        <!--配置哪些注解不扫描-->
        <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"></context:exclude-filter>
    </context:component-scan>


    <!--========================Spring整合Mybatis框架=========================================-->
    <!--数据库连接配置文件-->
    <bean id="configBean" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
        <property name="location" value="classpath:jdbcConfig.properties"/>
    </bean>
    <!--配置连接池-->
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource" destroy-method="close">
        <property name="driverClass" value="${jdbc.driverClass}" />
        <property name="jdbcUrl" value="${jdbc.jdbcUrl}" />
        <property name="user" value="${jdbc.user}" />
        <property name="password" value="${jdbc.password}" />
    </bean>

    <!--配置和MyBatis的整合-->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <!--指定mybatis全局配置文件位置-->
        <property name="configLocation" value="classpath:mybatis-config.xml"></property>
        <property name="dataSource" ref="dataSource"></property>
        <!--指定mybatis，mapper文件的位置-->
        <property name="mapperLocations" value="classpath:cn/cjy/mapper/*.xml"/>
    </bean>

    <!--配置扫描器，将mybatis接口的实现加入到ioc容器中-->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <!--扫描所有dao接口的实现，加入到ioc容器中-->
        <property name="basePackage" value="cn.cjy.mapper"/>
    </bean>

    <!--配置一个可以执行批量的sqlSession-->
    <bean id="sessionTemplate" class="org.mybatis.spring.SqlSessionTemplate">
        <constructor-arg name="sqlSessionFactory" ref="sqlSessionFactory"></constructor-arg>
        <constructor-arg name="executorType" value="BATCH"></constructor-arg>
    </bean>
    <!--=======================================================================-->


    <!--配置spring框架声明式事务管理-->
    <!--配置事务管理器-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"></property>
    </bean>

    <!--配置事务通知-->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
        <tx:attributes>
            <tx:method name="get*" read-only="true"/>
            <tx:method name="*" isolation="DEFAULT"/>
        </tx:attributes>
    </tx:advice>

    <!--配置aop增强-->
    <aop:config>
        <aop:pointcut id="ptc" expression="execution(* cn.cjy.service..*(..))"></aop:pointcut>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="ptc"/>
    </aop:config>

    <!--spring配置的核心点（数据源、与mybatis整合，事务控制）-->
</beans>
```

jdbcConfig.properties:

```properties
jdbc.driverClass=com.mysql.jdbc.Driver
jdbc.jdbcUrl=jdbc:mysql:///ssmcrud?characterEncoding=utf8
jdbc.user=root
jdbc.password=root
#?useUnicode=true&amp;characterEncoding=utf-8
```





## 1.4SpringMVC配置文件springMVC.xml的编写

包含的内容：

1. 开启注解扫描，只扫描Controller注解
2. 配置视图解析器对象。方便页面返回
3. 开启SpringMVC注解的支持
4. 将springMVC不能处理的请求交给tomcat

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <!--springMVC的配置文件，包含网站跳转逻辑的控制和配置-->

    <!--开启注解扫描，只扫描Controller注解-->
    <context:component-scan base-package="cn.cjy">
        <context:include-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>

    <!--配置视图解析器对象。方便页面返回-->
    <bean id="internalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/views/"/>
        <property name="suffix" value=".jsp"/>
    </bean>

    <!--过滤静态资源-->
    <!--<mvc:resources mapping="/static/css/**" location="/static/css/"/>-->
    <!--<mvc:resources mapping="/static/images/**" location="/static/css/"/>-->
    <!--<mvc:resources mapping="/static/js/**" location="/static/css/"/>-->

    <!--两个标准配置-->
    <!--开启SpringMVC注解的支持-->
    <mvc:annotation-driven/>
    <!--将springMVC不能处理的请求交给tomcat-->
    <mvc:default-servlet-handler/>

</beans>
```



## 1.5Mybatis配置文件mybatis-config.xml的编写

包含的内容：

1. 开启驼峰命名法

2. 开启对别名的支持

3. 分页参数合理化

   配置了这个如果在首页点击前一页，当前页面不会变成-1页，mybatis会自动对分页进行逻辑控制

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <!--开启驼峰命名法-->
    <!--<settings>-->
        <!--<setting name="mapUnderscoreToCamelCase" value="true"/>-->
    <!--</settings>-->
    <!--开启对别名的支持-->
    <typeAliases>
        <package name="cn.cjy.bean"/>
    </typeAliases>

    <plugins>
        <plugin interceptor="com.github.pagehelper.PageInterceptor">
            <!--分页参数合理化-->
            <property name="reasonable" value="true"/>
        </plugin>
    </plugins>
</configuration>
```



# 2.dao层增删改查功能的实现

使用mybatis的逆向工程实现。

步骤：

1. 在navicat中建好crud要使用的数据表
2. 导入maven依赖，开启对Mybatis-generator的支持

```xml
<dependency>
      <groupId>org.mybatis.generator</groupId>
      <artifactId>mybatis-generator-core</artifactId>
      <version>1.3.5</version>
</dependency>
```

3. 编写逆向工程的配置文件mbg.xml（其位置在项目路径下）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>

    <context id="DB2Tables" targetRuntime="MyBatis3">

        <!--配置了这个就会生成没有注释的代码-->
        <commentGenerator>
            <property name="suppressAllComments" value="true" />
        </commentGenerator>

        <!--配置数据库连接-->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver"
                        connectionURL="jdbc:mysql:///ssm"
                        userId="root"
                        password="root">
        </jdbcConnection>

        <javaTypeResolver >
            <property name="forceBigDecimals" value="false" />
        </javaTypeResolver>

        <!--指定javaBean生成的位置-->
        <javaModelGenerator targetPackage="cn.cjy.bean" targetProject=".\src\main\java">
            <property name="enableSubPackages" value="true" />
            <property name="trimStrings" value="true" />
        </javaModelGenerator>

        <!--指定sql映射文件生成的位置-->
        <sqlMapGenerator targetPackage="mapper"  targetProject=".\src\main\resources">
            <property name="enableSubPackages" value="true" />
        </sqlMapGenerator>

        <!--指定dao接口生成的位置，mapper接口-->
        <javaClientGenerator type="XMLMAPPER" targetPackage="cn.cjy.mapper" targetProject=".\src\main\java">
            <property name="enableSubPackages" value="true" />
        </javaClientGenerator>

        <!--table指定每个表的生成策略-->
        <table tableName="tbl_emp" domainObjectName="Employee"></table>
        <table tableName="tbl_dept" domainObjectName="Department"></table>

    </context>
</generatorConfiguration>

```

4. 在test中写一个方法，执行配置文件中配置的内容逆向生成crud代码

```java
package cn.cjy.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author cjy
 * @Date 2020/5/19 20:25
 */
public class MBGTest {

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}

```

生成后有三个效果：

* 生成javaBean
* 生成dao接口（crud方法均写好）
* 生成mapper配置文件（crud的具体实现）



# 3.客户端与后台服务器交互

服务端使用SpringMVC框架，客户端对服务器发送ajax请求，controller接收到客户端发送的请求（ajax可以通过data发送数据给服务器），执行crud或校验操作，将数据通过@ResponseBody注解，将方法的返回值返回给客户端。这样子就完成了客户端和服务器的交互。

对新增员工功能进行举例：

1. 用户点击新增按钮，输入用户名密码邮箱等值，对用户输入的值进行校验并且通过以后，用户可以点击保存按钮，客户端会向服务器发送ajax请求：

```jsp
 $.ajax({
			//客户端请求的url地址，controller会接收到此请求，并执行保存操作，
			//将用户输入的数据保存到数据库，客户端进行页面刷新并将数据显示出来
            url: "${APP_PATH}/emp",
			//发送的请求方式，一般新增使用POST请求，修改使用PUT，删除使用DELEte
			//查询使用GET请求
            type: "POST",
			//将用户输入的数据序列化以后发送给客户端
            data: $("#empAddModal form").serialize(),
			//controller执行完成之后，客户端执行回调函数success，进行关闭模态框，展示刚才保存的数据
            success: function (result) {
                //员工保存成功
                if (result.code == 100) {
                    //1.关闭模态框
                    $("#empAddModal").modal('hide');
                    //2.来到最后一页，显示刚才保存的数据
                    to_page(totalRecord);
                } else {
                    //console.log(result);
                    if (undefined != result.extend.errorFields.email) {
                        show_validate_msg("#email_add_input", "error", result.extend.errorFields.email);
                    }
                    if (undefined != result.extend.errorFields.empName) {
                        show_validate_msg("#empName_add_input", "error", result.extend.errorFields.empName);
                    }
                }
            }
        });
```

2. 客户端发送localhost:8888/ssm/emp请求，controller接收到请求，并执行Service层的saveEmp()方法，将用户在客户端输入的数据加入数据库中。

```java
/**
     * 员工保存
     * @return
     */
    @RequestMapping(value="/emp",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveEmp(@Valid Employee employee, BindingResult result){
        if(result.hasErrors()){
            //校验失败，应该返回失败，在模态框中显示校验失败的错误信息
            Map<String,Object> map =new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError error : errors) {
//                System.out.println("错误的字段名"+error.getField());
//                System.out.println("错误的信息"+error.getDefaultMessage());
                map.put(error.getField(),error.getDefaultMessage());
            }
            return Msg.fail().add("errorFields",map);
        }else {
            employeeService.saveEmp(employee);
            return Msg.success();
        }
    }
```

获取请求参数：

由于ajax请求data: $("#empAddModal form").serialize()封装的属性名和
saveEmp(@Valid Employee employee, BindingResult result)方法的形参employee【javabean】中的属性名称一致，所以方法形参中的employee对应的实参实际上就是客户端用户输入的数据。

执行操作返回数据给客户端：

通过@ResponseBody，controller即可将方法的返回值传递给客户端，并且由ajax请求成功后的回调函数
success: function (result)的形参result接收。

这样，客户端向服务器发送数据，服务端收到数据并执行相应的操作，并将客户端需要的数据返回给客户端。实现了客户端和服务器的交互



# 注意

1. @ResponseBody如果返回的数据是一个对象。SpringMVC会自动的把对象转换为 Json，需要 Jackson。

2. 具体Ajax页面与SpringMVC中Controller的交互过程看博客：

[Ajax页面与SpringMVC中Controller的交互过程](https://blog.csdn.net/qq_42080073/article/details/90489229)



# 总结

这个项目的技能点：

1. SSM环境的搭建
2. 使用Mybatis逆向工程实现crud操作和实体类的编写
3. 非常详细的用户信息校验操作【具体看项目代码，没有在这里详细论述】
4. 使用ajax请求进行前后端交互，并且使用JSP进行前端的编写

![image-20200521115858631](Demo1-ssmcrud.assets/image-20200521115858631.png)

