package springStu.springBootStu;

import junit.framework.TestCase;

/**
 * HelloWorldController 测试类
 * @author gino.chen
 *
 */
public class HelloWorldControllerTest extends TestCase {

	public void testSayhello() {
		HelloWorldController hd = new HelloWorldController();
		assertEquals("Hello World!", hd.sayhello());
	}
}
