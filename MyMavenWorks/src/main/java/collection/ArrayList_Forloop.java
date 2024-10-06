package collection;

import java.util.ArrayList;

public class ArrayList_Forloop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String>obj= new ArrayList <String>();
		obj.add("Hi");
		obj.add("This");
		obj.add("is");// values stored in list
		obj.add("an");
		obj.add("example");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}

}
