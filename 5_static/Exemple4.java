class Exemple4 {

    public static PersonneDeTahiti createPersonne(String prenom, String nom) {
	PersonneDeTahiti p = new PersonneDeTahiti();
	p.nom = nom;
	p.prenom = prenom;
	return p;
    }
    
    public static void main(String[] args) {
	PersonneDeTahiti p1 = createPersonne("Jean", "Neige");
	p1.presenteToi();

	PersonneDeTahiti p2 = createPersonne("Vaiana", "Disney");
	p2.presenteToi();

        p1.presenteToi();
    }
}
