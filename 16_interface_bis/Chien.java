class Chien extends Animal implements Joueur, Amical {

    private String nom;

    Chien(String nom) {
	super();
	this.nom = nom;
    }
    
    public void donnesLaPatte() {
	System.out.println("*donnes la patte*");
    }

    public void vaChercher() {
	System.out.println("va chercher le baton");
    }

    public String getNom() {
	return this.nom;
    }

    public void jouesAvec(Amical amical) {
	System.out.println("* " + this.getNom() + " joue avec " + amical.getNom() + " *");
    }

    public boolean renifles(Animal animal) {
	return animal instanceof Amical;
    }

    @Override
    public String getDescription() {
	return "[Chien: nom=" + nom + "]";
    }
}
