package reference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PersonTest {
	@Autowired
	ApplicationContext ctx;

	@Test
	public void builder() {
		Person person1 = Person.builder().firstName("Uwe").lastName("Meyer").build();

		Person person2 = Person.builder().firstName("Uwe").lastName("Meyer").build();

		Person person3 = Person.builder().firstName("Uwe").build();

		// Instanzen sind unterschiedlich
		assertTrue(person1 != person2);

		// Values gleich
		assertEquals(person1, person2);
	}
}
