class Chat extends Animal {

    Chat() {
	super();
	super.setVitesseAttaque(10);
    }
    
    Chat(boolean estVivant, int age, String regime,
	 String sexe, int vitesseAttaque) {
	super(estVivant, age, regime, sexe, vitesseAttaque);
    }

    @Override
    public void miaule() {
	System.out.println("miaouuuu");
    }

    @Override
    public String toString() {
	return "[Chat:: estVivant: " + this.estVivant +
	    ", age: " + this.age + ", regime: " + this.regime +
	    ", sexe: " + this.sexe + ", vitesseAttaque: " +
	    this.vitesseAttaque + "]";
    }
    
}
