package configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest -> hier nicht notwendig, nur Context checken
public class ApplicationTest {
	@Autowired
	ApplicationContext ctx;

	@Test
	public void contextLoads() {
		// Nichts zu tun; Context ist geladen
	}
}
