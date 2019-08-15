class Exemple15 {
    public static void main(String[] args) {
	Animal garfield = new Animal(true, 4, "herbivore", "male", 0);
	Animal a1 = new Animal(true, 4, "herbivore", "femelle", 0);
	Animal a2 = new Animal(true, 4, "herbivore", "male", 0);
	Animal a3 = garfield;

	System.out.println("Verification par 'equals()':");
	System.out.println("garfield == a1 ? " + garfield.equals(a1));
        System.out.println("garfield == a2 ? " + garfield.equals(a2));
 	System.out.println("garfield == a3 ? " + garfield.equals(a3));

	System.out.println("Verification par '==':");
	System.out.println("garfield == a1 ? " + (garfield == a1));
	System.out.println("garfield == a2 ? " + (garfield == a2));
	System.out.println("garfield == a3 ? " + (garfield == a3));
    }
}
