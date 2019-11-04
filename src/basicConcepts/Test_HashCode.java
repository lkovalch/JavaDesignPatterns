package basicConcepts;

public class Test_HashCode {

	public static void main(String[] args) {
		
		A aobj = new A ();
		B bobj = new B ();
		 
		//Superclass object = new Subclass ();
	
	System.out.println(aobj.hashCode()); // Each new object generates Hashcode. Function .hashCode is used to verify that NEW object is created.
	System.out.println(bobj.hashCode());

}
}
