package null_deref;

public class Standard {

	public void unsafe() {
		String nullValue = 1 ==1? null : "unreachable";
		nullValue.contentEquals("");
		if (nullValue == null) {
			System.out.println("NPE when performing contentEquals");
		}
	}
	
	public void safe() {
		String nullValue = 1 ==1? null : "unreachable";
		
		if (nullValue == null) {
			System.out.println("no NPE");
		} else {
			nullValue.contentEquals("");
		}
	}
	
	
}
