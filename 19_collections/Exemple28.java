import java.util.ArrayList;

class Exemple28 {

    public static ArrayList<Integer> getListe() {
	ArrayList<Integer> liste = new ArrayList<Integer>();
	liste.add(1);
	liste.add(2);
	return liste;
    }
    
    public static void main(String[] args) {
	ArrayList<Integer> liste = getListe();
	int total = liste.get(0) + liste.get(1);
	System.out.println("Total: " + total);
    }
}
