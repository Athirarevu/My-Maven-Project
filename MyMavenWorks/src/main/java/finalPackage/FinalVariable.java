package finalPackage;

public class FinalVariable {
	final int num=15;
	
	public void var()
	{
		//num=22;value cannot be change error:The final field FinalVariable.num cannot be assigned

		System.out.println(num);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FinalVariable obj= new FinalVariable();
		obj.var();
		
	}

}
