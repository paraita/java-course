import java.util.Set;
import java.util.HashSet;

class Exemple30 {

    public static Set<String> getSet() {
	Set<String> set = new HashSet<>();
	set.add("Dos");
	set.add("Cali");
	set.add("Cali");
	set.add("Zwan");
	return set;
    }

    public static void main(String[] args) {
	Set<String> chiens = getSet();
	for (String chien: chiens) {
	    System.out.println("Chien: " + chien);
	}
    }
}
