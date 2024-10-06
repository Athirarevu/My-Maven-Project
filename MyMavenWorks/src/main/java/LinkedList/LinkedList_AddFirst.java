package LinkedList;

import java.util.LinkedList;

public class LinkedList_AddFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>obj= new LinkedList <Integer>();

		obj.add(5);
		obj.add(7);
		obj.add(10);// values stored in list
		obj.add(2);
		obj.add(1);
		obj.addFirst(8);//Inserts the specified element at the beginning of this list.
		System.out.println(obj);
	}

}
