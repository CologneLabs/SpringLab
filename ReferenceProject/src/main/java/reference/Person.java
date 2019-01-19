package reference;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Person {
	private String firstName;

	@NotNull
	@NotBlank
	private String lastName;

}
