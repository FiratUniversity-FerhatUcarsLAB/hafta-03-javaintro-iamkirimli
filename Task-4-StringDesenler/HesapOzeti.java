public class odev1 {

	public static void main(String[] args) {
		String urun1 = "Deterjan";
		String urun2 = "Süt";
		String urun3 = "Ekmek";
		int miktar1 = 1;
		int miktar2 = 3;
		int miktar3 = 5;
		int detfiyat = 150;
		int sutfiyat = 35;
		int ekmfiyat = 15;
		int toplam = (miktar1*detfiyat)+(miktar2*sutfiyat)+(miktar3*ekmfiyat);
		System.out.println("Ürünler    " + urun1 + " " + urun2 + " " + urun3);
		System.out.println("Miktar        " + miktar1 + "      " + miktar2 + "    " + miktar3);
		System.out.println("Fiyat        " + detfiyat + "    " + sutfiyat + "   " + ekmfiyat);
		System.out.println("");
		System.out.println("Toplam = " + toplam + "₺");
	}

}
