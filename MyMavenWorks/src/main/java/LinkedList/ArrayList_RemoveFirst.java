package LinkedList;

import java.util.LinkedList;

public class ArrayList_RemoveFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>obj= new LinkedList <Integer>();

		obj.add(5);
		obj.add(7);
		obj.add(10);// values stored in list
		obj.add(2);
		obj.add(1);
		obj.removeFirst();//Removes and returns the first element from this list.
		obj.removeLast();//Removes and returns the last element from this list.
		System.out.println(obj);
	}

}
