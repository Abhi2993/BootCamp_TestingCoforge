package java_Access_Modifier;
class B {
int x=10;
public void b1() {
	System.out.println("this is just a priome method ");
	
}
 protected int z =200;
 protected void ProtectedMethod() {
	 System.out.println("this is the perotected method");
	 
 }
}

public class DEFAULT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B obj = new B ();
     int output = obj.z;
     System.out.println("value of z is "+output);
     obj.b1();
     obj.ProtectedMethod();
	}

}
