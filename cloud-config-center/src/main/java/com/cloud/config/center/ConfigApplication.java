package com.cloud.config.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author keven
 * @date 2018-05-30 下午9:14
 * @Description
 *
 *
 */
@SpringBootApplication
@EnableConfigServer  // 激活该应用为配置文件服务器， 读取远程配置文件，转换为rest 接口服务
@EnableEurekaClient // 配置本应用 将使用 服务注册和服务发现
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
