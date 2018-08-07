package springStu.springBootStu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot Say Hello World 案例
 * @author gino.chen
 * Created by bysocket on 18/08/07.
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/HelloWorld")
	public String sayhello()
	{
		return"Hello World!";
	}
}
