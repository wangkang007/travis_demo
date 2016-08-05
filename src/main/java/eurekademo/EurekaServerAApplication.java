package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName: EurekaApplication
 * Description:
 *
 * @author kang.wang03
 *         Date 16/8/1
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaServerAApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaServerAApplication.class, args);
    }

}