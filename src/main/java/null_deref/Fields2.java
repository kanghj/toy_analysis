package null_deref;

public class Fields2 {


	public void safe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);	 
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNonNull to return null;
		obj.getNonNull().compareTo(anotherString);
	}
	
	public void safe2() {
		ObjectWithFields obj = new ObjectWithFields(10);
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNonNull to return null;
		obj.getNonNull().toString();
	}
	
	public void unsafe3() {
		ObjectWithFields obj = new ObjectWithFields(10);	
		// check the source code of `getNonNull` and the constructor of ObjectWithFields to determine if 
		// it is possible for getNullableValue to return null;
		obj.getNullableValue().toString();
	}
	
	public void unsafe(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(5);
		obj.getNull().compareTo(anotherString);
	}
	
	public void unsafe2(String anotherString) {
		ObjectWithFields obj = new ObjectWithFields(1);
		if (obj.getNull() == null) {
			obj.getNull().compareTo(anotherString);
		}
	}
	
}
