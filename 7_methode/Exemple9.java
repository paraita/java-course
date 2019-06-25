class Exemple9 {

    public static void main(String[] args) {
	Personne p1 = new Personne("JeAn", "NeIgE");
        String nomComplet = p1.getPresentation();
	System.out.println("p1: " + nomComplet);
	System.out.println("Je m'appelle " + Personne.capitalize(nomComplet));
    }
}
