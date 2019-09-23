class Exemple22 {
      
    public static void main(String[] args) {

	Chien cali = new Chien("Cali");
	Chat garfield = new Chat("Garfield");
	boolean estAmical = cali.renifles(garfield);
	if (estAmical) {
	    cali.promenesToiAvec(garfield);
	    garfield.promenesToiAvec(cali);
	}
    }
}     
