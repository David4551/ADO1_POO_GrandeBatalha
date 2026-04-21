import java.util.ArrayList;

public class GerenciadorBatalhas {
    private Criatura jogador;
    private ArrayList<Batalha> batalhas;
    private Criatura[] inimigos;

    public GerenciadorBatalhas(Criatura jogador) {
        this.jogador = jogador;
        this.batalhas = new ArrayList<>();
        // Cria os 3 inimigos para enfrentar
        this.inimigos = new Criatura[]{
                new Malignus(),
                new Demonion(),
                new Darius()
        };
    }

    public void executarCampanha() {
        System.out.println("#############");
        System.out.println("CAMPANHA - 3 BATALHAS");
        System.out.println("#############\n");

        for (int i = 0; i < inimigos.length; i++) {
            System.out.println("\n========== BATALHA " + (i + 1) + " ==========");
            
            // Restaura a vida do jogador antes de cada batalha
            jogador.restaurarVida();
            
            // Cria e executa a batalha
            Batalha batalha = new Batalha(jogador, inimigos[i]);
            batalha.iniciar();
            
            // Armazena o resultado da batalha
            batalhas.add(batalha);
            
            // Se o jogador perder, encerra a campanha
            if (!jogador.estaVivo()) {
                System.out.println("\n" + jogador.getNome() + " foi derrotado na batalha " + (i + 1) + "!");
                break;
            }
        }

        // Exibe o resultado final
        exibirResultado();
    }

    private void exibirResultado() {
        System.out.println("\n#############");
        System.out.println("RESULTADO FINAL DA CAMPANHA");
        System.out.println("#############\n");

        int vitoriasJogador = 0;
        
        for (int i = 0; i < batalhas.size(); i++) {
            Batalha batalha = batalhas.get(i);
            String vencedor = batalha.getNomeVencedor();
            String resultado;

            if (vencedor.equals(jogador.getNome())) {
                resultado = "VITÓRIA";
                vitoriasJogador++;
            } else {
                resultado = "DERROTA";
            }

            System.out.println("Batalha " + (i + 1) + ": " + resultado);
            System.out.println("  Jogador: " + jogador.getNome());
            System.out.println("  Inimigo: " + inimigos[i].getNome());
            System.out.println("  Vencedor: " + vencedor);
            System.out.println();
        }

        System.out.println("========== RESUMO ==========");
        System.out.println("Total de batalhas: " + batalhas.size());
        System.out.println("Vitórias: " + vitoriasJogador);
        System.out.println("Derrotas: " + (batalhas.size() - vitoriasJogador));
        
        if (vitoriasJogador == 3) {
            System.out.println("\n*** " + jogador.getNome() + " VENCEU TODA A CAMPANHA! ***");
        } else if (vitoriasJogador == 0) {
            System.out.println("\n*** " + jogador.getNome() + " FOI ELIMINADO! ***");
        } else {
            System.out.println("\n*** Campanha finalizada com " + vitoriasJogador + " vitória(s)! ***");
        }
        
        System.out.println("#############\n");
    }

    public ArrayList<Batalha> getBatalhas() {
        return this.batalhas;
    }
}
