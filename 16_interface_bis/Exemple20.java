class Exemple20 {
    public static void main(String[] args) {
	Chien cali = new Chien(70);
	Chat garfield = new Chat(30);
	System.out.println("Cali: " + cali);
	System.out.println("Garfield: " + garfield);
	System.out.println("Garfield est plus grand que Cali ? " + garfield.estPlusGrandQue(cali));
	System.out.println("Cali est plus grande que Garfield ? " + cali.estPlusGrandQue(garfield));
    }
}
