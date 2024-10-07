package excelthrows;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println(ExcelRead.getIntegerData(0,0));
		System.out.println(ExcelRead.getIntegerData(1,0));
		System.out.println(ExcelRead.getIntegerData(2,0));
		System.out.println(ExcelRead.getIntegerData(3,0));
		System.out.println(ExcelRead.getIntegerData(4,0));
		
		System.out.println(ExcelRead.getStringData(0,1));
		System.out.println(ExcelRead.getStringData(1,1));
		System.out.println(ExcelRead.getStringData(2,1));
		System.out.println(ExcelRead.getStringData(3,1));
		System.out.println(ExcelRead.getStringData(4,1));

	}

}
