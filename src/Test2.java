import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une cha�ne de caract�res !");
		al.add(12.20f);
		al.add('d');
		
		for(int i = 0; i< al.size(); i++) {
			System.out.println("donn�e � l'inde " +i+ " = " +al.get(i));
		}
	}

}
