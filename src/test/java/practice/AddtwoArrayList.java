package practice;

import java.util.ArrayList;

public class AddtwoArrayList {

	public static void main(String args[]) {
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("yogesh");
		list1.add("mangesh");
		list1.add("somesh");
		
		ArrayList<String> list2= new ArrayList<String>();
		list1.add("Deepak");
		list1.add("Sachin");
		list1.add("Nitin");
		
		ArrayList<String> joinList= new ArrayList<String>();
		joinList.addAll(list1);
		joinList.addAll(list2);
		
		System.out.println(joinList);
	}
}
