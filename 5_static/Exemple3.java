class Exemple3 {

    public static Personne createPersonne(String prenom, String nom, String ile) {
	Personne p = new Personne();
	p.nom = nom;
	p.prenom = prenom;
	p.ile = ile;
	return p;
    }
    
    public static void main(String[] args) {
	Personne p1 = createPersonne("Jean", "Neige", "Moorea");
	p1.presenteToi();

	Personne p2 = createPersonne("Vaiana", "Disney", "Motu Nui");
	p2.presenteToi();

        p1.presenteToi();
    }
}
