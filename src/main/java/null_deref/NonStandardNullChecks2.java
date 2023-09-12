package null_deref;

import java.util.Objects;

public class NonStandardNullChecks2 {
	
	public void safe2() {
		String anotherNull = null;
		if (Objects.nonNull(anotherNull)) {
			anotherNull.equals("with the nonNull guard, this block of code is unreachable");
		}
	}
	
	public void unsafe2() {
		String anotherNull = null;
		if (Objects.isNull(anotherNull)) {
			anotherNull.toCharArray();
		}
	}


}
