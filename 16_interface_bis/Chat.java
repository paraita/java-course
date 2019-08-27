class Chat extends Animal implements Comparable {

    private int taille;

    Chat(int taille) {
	this.taille = taille;
    }

    public int getTaille() {
	return taille;
    }

    @Override
    public String getDescription() {
	return "[Chat: taille=" + taille + "]";
    }

    // Parce qu'un chat c'est filou
    @Override
    public int getAge() {
	if (age > 10) {
	    age = age -10;
	}
	return age;
    }

    public boolean estPlusGrandQue(Comparable comparable) {
	return true;
    }

    public boolean estPlusVieuxQue(Comparable comparable) {
	return age > comparable.getAge();
    }
}
