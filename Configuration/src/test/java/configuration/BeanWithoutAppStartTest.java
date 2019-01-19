package configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test mit @ContextConfiguration: Instanziert alle Beans mittels der impliziert
 * aufgeführten @Config Klassen im Spring Context. Es findet KEIN Start der
 * Application statt.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { Config1.class, Config2.class })
public class BeanWithoutAppStartTest {
	@Autowired
	Bean1 bean1;

	@Autowired
	Bean2 bean2;

	@Test
	public void testBeans() {
		// Nichts zu tun; Beans wurden instanziert
	}
}
