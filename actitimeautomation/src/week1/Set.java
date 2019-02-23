package week1;

import java.util.ArrayList;
import java.util.Iterator;

public class Set 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(34);
		a1.add(45);
		a1.add(99);
		a1.add(12);
		System.out.println("=========fwd traversing=========");
		Iterator i1 = a1.iterator();
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.next());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.hasNext());
		
		
		
		
		
	}
}
