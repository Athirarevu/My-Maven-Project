package access_Modifiers;

public class Private2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private1 obj=new Private1();
		//obj.show();                   // error, because its declared in class1 privately, it cannot access here
	//	System.out.println(obj.a);    // error [instance var]
	}

}
