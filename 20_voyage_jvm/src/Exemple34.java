import java.io.Console;

public class Exemple34 {
    public static void main(String[] args) {
	Console c = System.console();
	System.out.println("Pret à manger 500 Mo ?");
	c.readLine();
	byte[] grosseVariable = new byte[99999976*5];
	System.out.println("MIAM !");
	c.readLine();
    }		  
}
