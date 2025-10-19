import java.util.Scanner;

public class odev1 {

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Miktarı Girin = ");
    	int para = scanner.nextInt();
    	int yuzluk = para/100;
    	int yuzlukkalan = para%100;
    	int ellilik = yuzlukkalan/50;
    	int ellilikkalan = yuzlukkalan%50;
    	int yirmilik = ellilikkalan/20;
    	int yirmilikkalan = ellilikkalan%20;
    	int onluk = yirmilikkalan/10;
    	int onlukkalan = yirmilikkalan%10;
    	int beslik = onlukkalan/5;
    	int beslikkalan = onlukkalan%5;
    	int birlik = beslikkalan/1;
    	System.out.println("100 = x" + yuzluk);
    	System.out.println("50 = x" + ellilik);
    	System.out.println("20 = x" + yirmilik);
    	System.out.println("10 = x" + onluk);
    	System.out.println("5 = x" + beslik);
    	System.out.println("1 = x" + birlik);
    }
}
