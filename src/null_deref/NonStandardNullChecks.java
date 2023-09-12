package null_deref;

import java.util.Objects;

public class NonStandardNullChecks {
	
	public void safe() {
		String nullValue = null;
		if (Objects.nonNull(nullValue)) {
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
