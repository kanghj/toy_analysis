package null_deref;

public class ObjectWithFields {
	
	private String nonNull = null;
	private final String nullValue = null;
	private String nullableValue;
	
	public ObjectWithFields(int times) {
		if (times <= 0) throw new RuntimeException();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; i ++) {
			sb.append("non-empty string");
		}
		if (sb.length() >= 0) {
			// nonNull is always set to be non-null
			nonNull = sb.toString();
		}
		
		nullableValue = null;
	}
	
	public void setNullableValue(String value) {
		nullableValue = value;
	}
	
	public String getNullableValue() {
		return nullableValue;
	}
	
	public String getNull() {
		return this.nullValue;
	}
	
	public String getNonNull() {
		return this.nonNull;
	}
	
	

}
