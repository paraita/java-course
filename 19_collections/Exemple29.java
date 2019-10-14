import java.util.List;
import java.util.ArrayList;

class Exemple29 {

    public static List<Integer> getListe() {
 	List<Integer> liste = new ArrayList<Integer>();
	liste.add(1);
	liste.add(2);
	return liste;
    }
    
    public static void main(String[] args) {
	List<Integer> liste = getListe();
	int total = liste.get(0) + liste.get(1);
	System.out.println("Total: " + total);
    }
}
