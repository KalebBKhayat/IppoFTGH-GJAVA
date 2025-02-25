import java.util.ArrayList;
import java.util.List;



public class Torneio {
    String nomeTorneio;
    List<Boxeador> listaParticipantes;

    public Torneio(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
        this.listaParticipantes = new ArrayList<>();
    }
    public void registrarBoxeador(Boxeador b1){
        
    }
   public void exibirCompetidores(){
    for(int i = 0; i<listaParticipantes.size(); i++){
        System.out.println(listaParticipantes.get(i).getNome()+"Está participando do " + nomeTorneio);
    }
   }
    public boolean adicionarParticipante(Boxeador boxeador) {
        listaParticipantes.add(boxeador);
        System.out.println(boxeador.getNome() + " foi adicionado ao torneio " + nomeTorneio);
        return true;
    }

    
    public void iniciarTorneio() {
        if (listaParticipantes.size() < 2) {
            System.out.println("Não há participantes suficientes para iniciar o torneio.");
            return;
        }

        List<Boxeador> competidores = new ArrayList<>(listaParticipantes);
        int rodada = 1;

       
        while (competidores.size() > 1) {
            System.out.println("\n--- Rodada " + rodada + " ---");
            List<Boxeador> vencedoresDaRodada = new ArrayList<>();

            for (int i = 0; i < competidores.size() - 1; i += 2) {
                Boxeador b1 = competidores.get(i);
                Boxeador b2 = competidores.get(i + 1);

                Luta luta = new Luta();
                Boxeador vencedor = luta.luta(b1, b2);

                if (vencedor != null) {
                    vencedoresDaRodada.add(vencedor);
                }
            }

            
            if (competidores.size() % 2 != 0) {
                Boxeador byeBoxeador = competidores.get(competidores.size() - 1);
                System.out.println(byeBoxeador.getNome() + " avança automaticamente para a próxima rodada.");
                vencedoresDaRodada.add(byeBoxeador);
            }

            
            competidores = vencedoresDaRodada;
            rodada++;
        }

        
        if (competidores.size() == 1) {
            System.out.println("\n=== Campeão do Torneio " + nomeTorneio + " ===");
            System.out.println("O campeão é " + competidores.get(0).getNome() + "!");
        }
    }
}



