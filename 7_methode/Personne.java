class Personne {

    private String nom;
    private String prenom;

    Personne(String prenom, String nom) {
	this.nom = nom;
	this.prenom = prenom;
    }

    public String getNom() {
	return nom;
    }

    public String getPrenom() {
	return this.prenom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public void setPrenom(String p) {
	prenom = p;
    }

    public String getPresentation() {
	return prenom + " " + nom.toUpperCase();
    }
    
    public void presenteToi() {
	System.out.println("Je m'appelle " +
			   prenom + " " + nom);
    }

    public static String capitalize(String representation) {
	String[] names = representation.split(" ");
	String stringResult = "";
	for(String name: names) {
	    name = name.toLowerCase();
	    stringResult += name.substring(0,1).toUpperCase() + name.substring(1) + " ";
	}
	return stringResult;
    }
    
    /*
    public static String getPresentationInEnglish() {
	return "My name is " + this.getPrenom() + " " + this.getNom();
    }*/
}
