import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord= new Scanner (System.in);
        System.out.println( "1. Nollställ antalet passagerare. 2. Öka antalet passagerare med en. 3. Minska antalet passagerare med en.  4. Skriv ut antalet passagerare. 5. Avsluta");
        int val = tangentbord.nextInt();
        int passagerare = 0;
        while (val<5) {
        val = 0;
        System.out.println( "1. Nollställ antalet passagerare. 2. Öka antalet passagerare med en. 3. Minska antalet passagerare med en.  4. Skriv ut antalet passagerare. 5. Avsluta");
        val = tangentbord.nextInt();
        
        switch (val) {
            case 1:
            passagerare=0;
            break;
            case 2:
            passagerare++;
            break;
            case 3:
            passagerare--;
            break;
            case 4:
            System.out.println(passagerare);
            break;
        }
    }

    
}
}
