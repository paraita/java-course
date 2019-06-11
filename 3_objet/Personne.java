class Personne {
    
    String nom;
    String prenom;
    int age;

    public void setNom(String nom) {
	this.nom = nom;
    }

    public void setPrenom(String prenom) {
	this.prenom = prenom;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getNom() {
	return nom;
    }

    public String getPrenom() {
	return this.prenom;
    }

    public int getAge() {
	return age;
    }
    

    public void presenteToi() {
	System.out.println("Je m'appelle " + prenom + " " +
			   this.nom + " et j'ai " +
			   getAge() + " ans");
    }
}
