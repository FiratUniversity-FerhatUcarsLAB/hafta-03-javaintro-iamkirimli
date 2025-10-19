public class odev1 {

	public static void main(String[] args) {
		int saniye = 45896;
		int dakika = saniye/60;
		int saat = dakika/60;
		int dakikakalan = dakika%60;
		int saniyekalan = saniye%60;
		System.out.println(saat + ":" + dakikakalan + ":" + saniyekalan);
	}

}
