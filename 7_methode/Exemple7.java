class Exemple7 {

    public static void main(String[] args) {
	Personne p1 = new Personne("Jean", "Neige");
	System.out.println("p1: " + p1.getPrenom() + " " + p1.getNom());
	p1.setPrenom("Jon");
	p1.setNom("Snow");
	System.out.println("p1: " + p1.getPrenom() + " " + p1.getNom());
    }
}
