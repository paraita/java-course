class Chien extends Animal {

    private String nom;

    Chien(String nom) {
	super();
	this.nom = nom;
    }

    public String getNom() {
	return this.nom;
    }

    @Override
    public String getDescription() {
	return "[Chien: nom=" + nom + "]";
    }
}
