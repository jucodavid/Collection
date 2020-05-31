import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(12);
		l.add("Toto ! !");
		l.add(12.20f);
		
		for(int i = 0; i < l.size(); i++)
			System.out.println("Element � l'index " +i+ " = " + l.get(i));
		
		System.out.println("\n \tParcours avec un it�rateur ");
		System.out.println("------------------------------------");
		ListIterator li = l.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next());
	}

}
