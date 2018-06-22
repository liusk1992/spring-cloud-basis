/**
 * BEYONDSOFT.COM INC
 */
package cn.liusk.cloudbasis.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liusk
 * @version $Id: RCApplication.java, v 0.1 2018/6/20 11:22 liusk Exp $
 */
@EnableEurekaServer
@SpringBootApplication
public class RCApplication {

    public static void main(String[] args) {
        SpringApplication.run(RCApplication.class,args);
        //springboot2.0启动验证web方式变化
        //new SpringApplicationBuilder(RCApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
