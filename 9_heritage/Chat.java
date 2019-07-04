class Chat extends Animal {

    Chat() {
	super();
	super.setVitesseAttaque(10);
    }
    
    Chat(boolean estVivant, int age, String regime,
	 String sexe, int vitesseAttaque) {
	super(estVivant, age, regime, sexe, vitesseAttaque);
    }

    public void miaule() {
	System.out.println("miaouuuu");
    }
}
