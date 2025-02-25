
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Torneio> torneios = new ArrayList<>();
        ArrayList<Boxeador> boxeadores = new ArrayList<>();
        int escM = 5;
        int i = 0;
        while (escM !=0){

        
        System.out.println("O que voce deseja fazer?\n1)Registrar Torneio\n2)Registrar Participante\n3)Iniciar Torneio\n4)Iniciar Luta\n5)Listar Lutadores\n0)Sair");
        escM = scanner.nextInt();
        switch (escM){
            case 1:
                Torneio t1 = new Torneio(null);
                
                System.out.println("Qual será o nome do torneio?\n1");
                t1.nomeTorneio = scanner.nextLine();
                t1.nomeTorneio = scanner.nextLine();
                torneios.add(t1);
                System.out.println("Torneio " + t1.nomeTorneio +" registrado com sucesso!");
                break;
                
            case 2:
                if(torneios.isEmpty()){
                    System.out.println("Nenhum torneio registrado");
                    break;
                }else{
                    
                    
                    
                    System.out.println("Qual será o nome do participante?");
                    String nomeBoxeador = scanner.nextLine();
                    nomeBoxeador = scanner.nextLine();
                    System.out.println("Sua estamina?");
                    int StamBoxeador = scanner.nextInt();
                    System.out.println("Sua resistencia?");
                    int resBoxeador = scanner.nextInt();
                    for(int y = 0; y<torneios.size();y++){
                        System.out.println(y + ")"+ torneios.get(y).nomeTorneio);
                    }
                    System.out.println("Qual torneio ele irá participar?");
                    int t = scanner.nextInt();
                    Boxeador boxer = new Boxeador(resBoxeador, nomeBoxeador, 0, 0, StamBoxeador);
                    boxeadores.add(boxer);
                    torneios.get(t).adicionarParticipante(boxeadores.get(i));
                    i++;
                    }
                    break;
                case 3:
                    if(torneios.isEmpty()){
                        System.out.println("Não existem torneios registrados?");
                    }else{
                        System.out.println("Qual torneio voce deseja iniciar?");
                        for(int y = 0; y<torneios.size();y++){
                            System.out.println(y + ")"+ torneios.get(y).nomeTorneio);
                        }
                        int escTorneio = scanner.nextInt();
                        torneios.get(escTorneio).iniciarTorneio();
                    }
                    break;
                case 4:
                    Luta l1 = new Luta();
                    for(int y= 0; y< boxeadores.size(); y++){
                        System.out.println(y+ ")"+boxeadores.get(y).getNome()); 
                    }
                    System.out.println("Qual primeiro lutador?");
                    int primeiroLutador = scanner.nextInt();
                    System.out.println("E o segundo?");
                    int segundoLutador = scanner.nextInt();
                    l1.luta(boxeadores.get(primeiroLutador), boxeadores.get(segundoLutador));
                    break;
                case 5:
                    for(int y = 0; y<torneios.size();y++){
                    System.out.println(y + ")"+ torneios.get(y).nomeTorneio);
                    }
                    System.out.println("Exibir participantes de qual torneio?");
                    int exb = scanner.nextInt();
                    torneios.get(exb).exibirCompetidores();
                    break;

                }
                


        }
        
       

    }
}
