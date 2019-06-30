class Exemple10 {

    public static void main(String[] args) {
	Personne p1 = new Personne("Jean", "Patrick");
	var p2 = new Personne("Jean", "Doe");

	p2.modifierPresentation("Pascal", "Jean");
	p2.presenteToi();
	p2.modifierPresentation(p1);
	p2.presenteToi();
	
    }
}
