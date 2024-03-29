package all;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "all.com.mapper")
public class FacedemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FacedemoApplication.class, args);
    }



}
