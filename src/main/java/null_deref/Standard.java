package null_deref;

public class Standard {

	public void unsafe() {
		String nullValue = 1 ==1? null : "unreachable";
		nullValue.contentEquals("");
		
	}
	
}
