abstract class Animal {
    
    protected boolean estVivant;
    protected int age;
    protected String regime;
    protected String sexe;
    protected int vitesseAttaque;

    Animal() {
	this(false, 0, "omnivore", "male", 5);
    }

    Animal(boolean estVivant, int age, String regime,
	   String sexe, int vitesseAttaque) {
	this.estVivant = estVivant;
	this.age = age;
	this.regime = regime;
	this.sexe = sexe;
	this.vitesseAttaque = vitesseAttaque;
    }

    public boolean getEstVivant() {
	return estVivant;
    }

    public int getAge() {
	return age;
    }

    public String getRegime() {
	return regime;
    }

    public String getSexe() {
	return sexe;
    }

    public int getVitesseAttaque() {
	return vitesseAttaque;
    }

    public void setEstVivant(boolean estVivant) {
	this.estVivant = estVivant;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public void setRegime(String regime) {
	this.regime = regime;
    }

    public void setSexe(String sexe) {
	this.sexe = sexe;
    }

    public void setVitesseAttaque(int vitesseAttaque) {
	this.vitesseAttaque = vitesseAttaque;
    }
    
    public abstract String getDescription();

    @Override
    public String toString() {
	return this.getDescription();
    }

    @Override
    public boolean equals(Object o) {
	Animal a = (Animal) o;
	boolean memeClasse = a != null && a.getClass() == this.getClass();
	boolean memeAge = a.getAge() == this.getAge();
	boolean memeSexe = a.getSexe() == this.getSexe();
	return memeClasse && memeAge && memeSexe;
    }
    
}
