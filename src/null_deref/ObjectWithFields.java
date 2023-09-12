package null_deref;

public class ObjectWithFields {
	
	private String nonNull = null;

	private final String nullValue = null;
	
	private String thing1;
	private String thing2;
	private String thing3;
	
	public ObjectWithFields(int times) {
		if (times <= 0) throw new RuntimeException();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; i ++) {
			thing1 = new StringBuilder().toString();
			thing2 = "";
			thing3 = "";
			sb.append("one more");
//			nonNull = "1";
		}
		if (sb.length() > 0) {
			nonNull = sb.toString();
		}
		
	}
	
	public String getNull() {
		return this.nullValue;
	}
	
	public String getNonNull() {
		return this.nonNull;
	}
	
	

}
