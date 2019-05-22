# **Spring boot dubbo demo**

主要内容：

1、pom依赖

        <dependency>
            <groupId>com.alibaba.boot</groupId>
            <artifactId>dubbo-spring-boot-starter</artifactId>
            <version>0.2.0</version>
        </dependency>

2、服务提供方的application.properties配置

    ## Dubbo 服务提供者配置
    #服务名称
    dubbo.application.name=provider
    #注册中心地址
    dubbo.registry.address=zookeeper://127.0.0.1:2181
    #dubbo 协议
    dubbo.protocol.name=dubbo
    dubbo.protocol.port=20880
    #坑，该属性未支持。需要到启动类使用@DubboComponentScan的basePackages属性指定
    #dubbo.scan.base-packages=com.example.dubboprovider.service

3、服务提供方启动类

```
@DubboComponentScan(basePackages="com.example.dubboprovider.service")
@SpringBootApplication
public class DubboProviderApplication {

public static void main(String[] args) {
    SpringApplication.run(DubboProviderApplication.class, args);
}

}
```

4、服务消费方的application.properties配置

```
### Dubbo 服务消费者配置
#服务名称
dubbo.application.name=consumer
#注册中心地址
dubbo.registry.address=zookeeper://127.0.0.1:2181
```

5、brew安装zookeeper

brew install zookeeper