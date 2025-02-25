
import java.util.Random;

public class Boxeador {
    int res;
    int stm;
    int esc;
    String nome;
    int vit;
    int der;
    boolean blq;
    public Boxeador(int res, String nome, int vit, int der, int stm) {
        this.res = res;
        this.nome = nome;
        this.vit = vit;
        this.der = der;
        this.stm = stm;
    }

    public void ação(Boxeador b1, Boxeador b2){
        Random random = new Random();
        esc = random.nextInt(4)+1;
        switch(esc){
            case 1:
            b1.jab(b2);
            
            break;
            case 2:
            b1.direto(b2);
            
            break;
            case 3:
            b1.upper(b2);
            
            break;
            case 4:
            b1.bloquear();
            
            break;
        }
    }
    public boolean vefVencedor(Boxeador b1){
        
        if(b1.vit > 0){
            return true;
        }else{
            return false;
        }
    }
    public void verfRes(Boxeador boxeador){
        System.out.println("Ainda resta "+ boxeador.getRes() + " de energia! Para o "+ boxeador.getNome());
    }
    public void bloquear(){
        blq = true;
        stm+=10;
        System.out.println("o " + getNome() + " está bloqueando!");
        
    }
    public void jab(Boxeador alvo) {
        if (stm > 10) {
            blq = false;
            stm -= 10;  // Reduz a estamina ao fazer o golpe
            
            if (alvo.blq) {
                alvo.res -= 5;
                System.out.println(getNome() + " deu um jab, mas acertou o bloqueio!");
            } else {
                alvo.res -= 10;
                System.out.println(getNome() + " deu um jab!");
            }
        }
    }
    public void direto(Boxeador alvo) {
        if (stm > 15) {
            blq = false;
            stm -= 15;  // Reduz a estamina ao fazer o golpe
            
            if (alvo.blq) {
                alvo.res -= 10;
                System.out.println(getNome() + " deu um direto, mas acertou o bloqueio!");
            } else {
                alvo.res -= 15;
                System.out.println(getNome() + " deu um direto!");
            }
        }
    }
    public void upper(Boxeador alvo) {
        if (stm > 20) {
            blq = false;
            stm -= 20;  // Reduz a estamina ao fazer o golpe
            
            if (alvo.blq) {
                alvo.res -= 15;
                System.out.println(getNome() + " deu um upper, mas acertou o bloqueio!");
            } else {
                alvo.res -= 20;
                System.out.println(getNome() + " deu um upper!");
            }
        }
    }
    public boolean knockout(){
        return res> 0;
    }

    public int getRes() {
        return res;
        
    }

    public void setRes(int res) {
        this.res = res;
    }

    public int getStm() {
        return stm;
    }

    public void setStm(int stm) {
        this.stm = stm;
    }

    public int getEsc() {
        return esc;
    }

    public void setEsc(int esc) {
        this.esc = esc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDer() {
        return der;
    }

    public void setDer(int der) {
        this.der = der;
    }

    public boolean isBlq() {
        return blq;
    }

    public void setBlq(boolean blq) {
        this.blq = blq;
    }
}
