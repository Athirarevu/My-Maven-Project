package encapsulation;

public class DataOutput {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DataInput obj=new DataInput();
		int s=obj.getside();
		int area=s*s;
		System.out.println("Area of square = "+area+"sq.cm");
	}

}
