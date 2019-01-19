package configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Best-Practice.<br>
 * <br>
 * Test mit @SpringBootTest: Instanziert alle Beans mittels der @Config Klassen
 * im Spring Context. Die Application wird anschließend ausgeführt.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanWithAppStartTest {
	@Autowired
	Bean1 bean1;

	@Autowired
	Bean2 bean2;

	@Test
	public void testBeans() {
		// Nichts zu tun; Beans wurden instanziert
	}
}
