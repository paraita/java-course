class PersonnePubliqueDeTahiti {
    public String nom;
    public String prenom;
    public static String ile = "Tahiti";

    // getters & setters

    public void presenteToi() {
	System.out.println("Je m'appelle " + prenom + " " + nom + " et je suis de " + ile);
    }
}
