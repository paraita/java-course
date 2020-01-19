import javassist.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class MetaspaceSucker {

    static ClassPool cp = ClassPool.getDefault();

    public static void createClass(String name) {
        CtClass newClass = cp.makeClass(name);
        try {
            for (int i = 0; i < 1000; i++) {
                String methodSrc = "public void hello" + name + i + "() { System.out.println(); }";
                CtMethod ctMethod = CtMethod.make(methodSrc, newClass);
                newClass.addMethod(ctMethod);
            }
            CtField ctField = CtField.make("public static byte[] data" + name +
                    " = new byte[99999976];", newClass);
            newClass.addField(ctField);
            newClass.toClass();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int classAmount = 0;
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
                            System.out.println("NOT IMPLEMENTED");
                        }
                        break;
                    case '+':
                        for (int i = 0; i < amount; i++) {
                            String name = "MetaspaceSuckerClass" + (i + classAmount);
                            createClass(name);
                            System.out.println("Created class " + name + "()");
                        }
                        classAmount += amount;
                        break;
                    default:
                }
                System.out.println("totos size: " + classAmount);
            }
        }
    }
}
