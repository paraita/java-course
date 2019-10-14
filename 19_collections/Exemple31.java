import java.util.List;
import java.util.ArrayList;

class Exemple31 {

    public static List<String> getList() {
	List<String> list = new ArrayList<>();
	list.add("Dos");
	list.add("Cali");
	list.add("Cali");
	list.add("Zwan");
	return list;
    }

    public static void main(String[] args) {
	List<String> chiens = getList();
	for (String chien: chiens) {
	    System.out.println("Chien: " + chien);
	}
    }
}
