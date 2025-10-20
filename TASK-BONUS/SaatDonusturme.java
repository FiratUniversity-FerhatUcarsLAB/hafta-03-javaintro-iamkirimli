import java.util.Scanner;

public class bonustask_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saniyeyi Giriniz: ");
		int saniye = scanner.nextInt();
		int dakika = saniye/60;
		int saat = dakika/60;
		int dakikakalan = dakika%60;
		int saniyekalan = saniye%60;
		System.out.println(saat + ":" + dakikakalan + ":" + saniyekalan);
	}

}

