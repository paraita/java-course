
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class HeapSucker {

    private static class OneHundredMB {
        byte[] data = new byte[99999976];
    }

    public static void main(String[] args) {
        List<OneHundredMB> totos = new ArrayList<>();
        Console c = System.console();
        if (c == null) {
            System.err.println("Oups erreur de console");
            System.exit(1);
        }
        boolean shouldExit = false;
        while (!shouldExit) {
            System.out.println("Listening...");
            String input = c.readLine();

            if ("exit".compareTo(input) == 0 || "quit".compareTo(input) == 0) {
                shouldExit = true;
            }

            char operation = input.charAt(0);
            if (operation == '+' || operation == '-') {
                int amount = Integer.parseInt(input.substring(1));
                switch (operation) {
                    case '-':
                        for (int i = 0; i < amount; i++) {
                            totos.remove(0);
                        }
                        break;
                    case '+':
                        for (int i = 0; i < amount; i++) {
                            totos.add(new OneHundredMB());
                        }
                        break;
                    default:
                }
                System.out.println("totos size: " + totos.size());
            }
        }
    }
}
