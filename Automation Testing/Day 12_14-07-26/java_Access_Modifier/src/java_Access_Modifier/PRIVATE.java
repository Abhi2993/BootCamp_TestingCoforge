package java_Access_Modifier;
class A{
	int x=100;
	
}
public class PRIVATE {
 public static void main(String[]args) {
	 A obj = new A();
	 int output=obj.x;
	 System.out.println("Output is "+ output);
	 
 }
}
