class Exemple27 {
      
    public static void main(String[] args) {
	Chien cali = new Chien("Cali");
	Chat garfield = new Chat("Garfield");
	((Amical) cali).promenesToiAvec((Amical) garfield);
    }
}
