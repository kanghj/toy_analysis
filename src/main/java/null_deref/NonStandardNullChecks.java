package null_deref;

import java.util.Objects;

public class NonStandardNullChecks {
	
	public void safe() {
		String nullValue = null;
		if (Objects.nonNull(nullValue)) {
			// since nonNull() already checked for null, this is not reachable
			nullValue.toString();
		}
	}
	
	public void unsafe() {
		String nullValue = null;
		if (Objects.isNull(nullValue)) {
			nullValue.toString();
		}
	}


}
