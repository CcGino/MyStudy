package springStu.springBootStu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 * @author gino.chen
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//run方法会启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件。
		SpringApplication.run(Application.class,args);

	}

}
