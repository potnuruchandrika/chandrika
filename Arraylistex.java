import java.util.*;
public class Arraylistex {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("apple");
		l.add("banana");
		l.add("kiwi");
		l.add("apple");
		System.out.println(l);
		System.out.println("using for each");
		for(String x:l)
		{
			System.out.println(x);
		}
		/*System.out.println("using iterator");
		Iterator itr=l.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}*/
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("potato");
		l1.addAll(l);
		System.out.println(l1);
	
		l1.remove(1);
		System.out.println("after removing");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.get(0));
		System.out.println(l.set(1,"grapes"));
		System.out.println(l);
		
		// TODO Auto-generated method stub

	}

}
