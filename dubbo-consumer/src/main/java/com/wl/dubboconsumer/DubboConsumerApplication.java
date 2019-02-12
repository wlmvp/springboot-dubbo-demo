package com.wl.dubboconsumer;

//import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wl.dubbointerface.service.HelloService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@EnableDubboConfiguration
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class DubboConsumerApplication {

//    @Reference
//    private HelloService demoService;

//    @Bean
//    public ApplicationRunner runner() {
////        return args -> logger.info(demoService.sayHello("mercyblitz"));
//        System.out.println(demoService.sayHello("mercyblitz"));
//        return null;
//    }

//    @Component
//    public class ApplicationRunnerBean1 implements ApplicationRunner {
//        @Override
//        public void run(ApplicationArguments arg0) throws Exception {
//            System.out.println("ApplicationRunnerBean 1");
//            System.out.println(demoService.sayHello("mercyblitz"));
//        }
//    }

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

}

