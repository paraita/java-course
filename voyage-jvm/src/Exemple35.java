import java.io.Console;

public class Exemple35 {

    public static void manger500Mo() {
	byte[] grosseVariable = new byte[99999976*5];
    }

    public static void main(String[] args) {
	
	Console c = System.console();
	System.out.println("Pret à manger 500 Mo ?");
	c.readLine();
	manger500Mo();
	System.out.println("MIAM !");
	c.readLine();
    }
			  
}
