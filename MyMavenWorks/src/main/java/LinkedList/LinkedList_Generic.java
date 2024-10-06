package LinkedList;


import java.util.LinkedList;

public class LinkedList_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>obj= new LinkedList <Integer>();

		obj.add(5);
		obj.add(7);
		obj.add(10);// values stored in list
		obj.add(2);
		obj.add(1);
		System.out.print(obj);// for getting result
		
		for(int temp:obj) // for each loop - for printing the line one by one
		{
			System.out.println(temp);
		}
	}

}
