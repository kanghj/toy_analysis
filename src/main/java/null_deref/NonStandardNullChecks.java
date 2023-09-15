package null_deref;

import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class NonStandardNullChecks {
	
	public void safe() {
		String nullValue = null;
		if (Objects.nonNull(nullValue)) {
			nullValue.compareTo("since the nonNull check will fail, this block of code is unreachable");
		}
	}
	
	public String decorateText(Object text) {
		// simplified from https://github.com/microsoft/azure-maven-plugins
		Supplier<String> dft = null;
		String result = null;
		if (text instanceof String) {
			result = (String) text;
		}

		return Objects.nonNull(dft) ? dft.get() : result;
	}


	public char[] get(Map<String, String> db, String name) {
		// simplified from https://github.com/tronprotocol/java-tron
		String bytesCapsule = db.containsKey(name) ? db.get(name): null;
		if (Objects.nonNull(bytesCapsule)) {
			return bytesCapsule.toCharArray();
		}
		return null;
	}
	
	public void unsafe() {
		String nullValue = null;
		if (Objects.isNull(nullValue)) {
			nullValue.toString();
		}
	}


}
