class Personne {

    public String nom;
    public String prenom;

    Personne() {
	this("John", "Doe");
    }

    Personne(String nom, String prenom) {
	this.nom = nom;
	this.prenom = prenom;
    }

    public void presenteToi() {
	System.out.println("Je m'appelle " +
			   prenom + " " + nom);
    }

}
