class Chien extends Animal implements Joueur, Comparable {

    private int taille; // en cm

    Chien(int taille) {
	this.taille = taille;
    }
    
    public void donnesLaPatte() {
	System.out.println("*donnes la patte*");
    }

    public void vaChercher() {
	System.out.println("va chercher le baton");
    }

    public int getTaille() {
	return taille;
    }

    public boolean estPlusGrandQue(Comparable comparable) {
	return taille > comparable.getTaille();
    }

    public boolean estPlusVieuxQue(Comparable comparable) {
	return age > comparable.getAge();
    }

    @Override
    public String getDescription() {
	return "[Chien: taille=" + taille + "]";
    }
}
