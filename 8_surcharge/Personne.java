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

    public void presenteToi() {
	System.out.println("Je m'appelle " +
			   prenom + " " + nom);
    }

    public void modifierPresentation(String nom, String prenom) {
	this.nom = nom;
	this.prenom = prenom;
    }

    public void modifierPresentation(Personne p) {
	this.nom = p.getNom();
	this.prenom = p.getPrenom();
    }
}
