package null_deref;

import java.util.Objects;

public class NonStandardNullChecks2 {
	
	public void safe2() {
		String anotherNull = null;
		if (Objects.nonNull(anotherNull)) {
			// since nonNull() already checked for null, this is not reachable 
			anotherNull.toCharArray();
		}
	}
	
	public void unsafe2() {
		String anotherNull = null;
		if (Objects.isNull(anotherNull)) {
			anotherNull.toCharArray();
		}
	}


}
