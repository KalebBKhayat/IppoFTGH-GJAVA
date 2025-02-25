
import java.util.Random;


public class Luta {
    Random random = new Random();

    public Boxeador luta(Boxeador b1, Boxeador b2) {
        System.out.println("De um lado com " + b1.getVit() + " vitórias e " + b1.getDer() + " derrotas..." + b1.getNome() + "!!!!!");
        System.out.println("Do outro lado com " + b2.getVit() + " vitórias e " + b2.getDer() + " derrotas..." + b2.getNome() + "!!!!!");

        
        while (b1.res > 0 && b2.res > 0) {
            b1.ação(b2, b1);
            if (b1.res <= 0 || b2.res <= 0) {
                break;
            }
            b2.ação(b1, b2);
        }

        
        if (b1.res > 0 && b2.res <= 0) {
            System.out.println("\n|||DOWNNNNN!!!!|||\n" + b2.getNome() + " está fora de combate!\nO " + b1.getNome() + " é o vencedor!");
            b1.vit++;
            b2.der++;
            return b1; 
        } else if (b1.res <= 0 && b2.res > 0) {
            System.out.println("\n|||DOWNNNNN!!!!|||\n" + b1.getNome() + " está fora de combate!\nO " + b2.getNome() + " é o vencedor!");
            b2.vit++;
            b1.der++;
            return b2; 
        }

        
        return null;
    }
}

