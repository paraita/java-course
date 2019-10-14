import java.util.Map;
import java.util.HashMap;

class Exemple33 {

    public static Map<String, Chien> getMap() {
	Map<String, Chien> map = new HashMap<>();
	map.put("Dos", new Chien("Dos"));
	map.put("Cali", new Chien("Cali"));
	map.put("Cali", new Chien("Cali"));
	map.put("Zwan", new Chien("Zwan"));
	return map;
    }

    public static void main(String[] args) {
	Map<String, Chien> chiens = getMap();
	for (String nom: chiens.keySet()) {
	    System.out.println("nom: " + chiens.get(nom));
	}
    }
}
