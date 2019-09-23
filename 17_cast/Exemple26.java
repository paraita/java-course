class Exemple26 {
      
    public static void main(String[] args) {
	Animal cali = new Chien("Cali");
	Animal garfield = new Chat("Garfield");
	((Amical) cali).promenesToiAvec((Amical) garfield);
	((Chien) cali).donnesLaPatte();
	System.out.println("Sexe de Garfield: " + garfield.getSexe());
    }
}
