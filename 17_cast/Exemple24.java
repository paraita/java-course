class Exemple24 {
      
    public static void main(String[] args) {
	Amical cali = new Chien("Cali");
	Amical garfield = new Chat("Garfield");
	cali.promenesToiAvec(garfield);
        ((Chien) cali).donnesLaPatte();
	System.out.println("Sexe de Garfield: " + ((Animal) garfield).getSexe());
    }
}
