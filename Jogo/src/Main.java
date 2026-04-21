import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Escolher nome do jogador
        System.out.println("#############");
        System.out.println("A GRANDE BATALHA");
        System.out.println("#############\n");

        System.out.print("Digite seu nome: ");
        String nomeJogador = sc.nextLine();

        // Escolher arma de curta distância
        System.out.println("\nEscolha sua arma de curta distância:");
        System.out.println("1) Faca");
        System.out.println("2) Espada");
        System.out.println("3) Katana");
        int escolhaArmaCurta = sc.nextInt();
        
        Arma armaCurta = null;
        while (escolhaArmaCurta < 1 || escolhaArmaCurta > 3) {
            System.out.println("Número inválido, escolha outro:");
            escolhaArmaCurta = sc.nextInt();
        }
        
        if (escolhaArmaCurta == 1) {
            armaCurta = new Faca();
        } else if (escolhaArmaCurta == 2) {
            armaCurta = new Espada();
        } else {
            armaCurta = new Katana();
        }

        // Escolher arma de longa distância
        System.out.println("\nEscolha sua arma de longa distância:");
        System.out.println("1) Arco e Flecha");
        System.out.println("2) Pistola");
        System.out.println("3) Metralhadora");
        int escolhaArmaLonga = sc.nextInt();
        
        Arma armaLonga = null;
        while (escolhaArmaLonga < 1 || escolhaArmaLonga > 3) {
            System.out.println("Número inválido, escolha outro:");
            escolhaArmaLonga = sc.nextInt();
        }
        
        if (escolhaArmaLonga == 1) {
            armaLonga = new ArcoEFlecha();
        } else if (escolhaArmaLonga == 2) {
            armaLonga = new Pistola();
        } else {
            armaLonga = new Metralhadora();
        }

        // Criar jogador com armas escolhidas
        Criatura jogador = new Jogador(nomeJogador, armaCurta, armaLonga);

        // Criar gerenciador de batalhas e executar a campanha
        GerenciadorBatalhas gerenciador = new GerenciadorBatalhas(jogador);
        gerenciador.executarCampanha();
    }
}
