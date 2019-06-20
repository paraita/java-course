class Exemple5 {

    public static PersonneFixe createPersonne(String prenom, String nom, String ile) {
	PersonneFixe p = new PersonneFixe();
	p.nom = nom;
	p.prenom = prenom;
	p.ile = ile;
	return p;
    }
    
    public static void main(String[] args) {
	PersonneFixe p1 = createPersonne("Jean", "Neige", "Moorea");
	p1.presenteToi();

	PersonneFixe p2 = createPersonne("Vaiana", "Disney", "Motu Nui");
	p2.presenteToi();

        p1.presenteToi();
    }
}
