class Chat extends Animal implements Amical {

    private String nom;

    Chat(String nom) {
	super();
	this.nom = nom;
    }
    
    public void promenesToiAvec(Amical amical) {
	System.out.println("* " + this.getNom() + " se promène avec " + amical.getNom() + " (sans réelle conviction)"  + " *");
    }

    public boolean renifles(Animal animal) {
	return false;
    }

    public String getNom() {
	return this.nom;
    }

    @Override
    public String getDescription() {
	return "[Chat: nom=" + nom + "]";
    }
}
