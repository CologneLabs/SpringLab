package injection;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

	public void saySomething() {
		System.out.println("Hallo!");
	}
}
