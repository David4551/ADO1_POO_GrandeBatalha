import java.util.Random;
import java.util.Scanner;


public class Jogador extends Criatura{

    Scanner sc = new Scanner(System.in);
    private Arma armaCurta;
    private Arma armaLonga;

    public Jogador(String nome, Arma armaCurta, Arma armaLonga) {
        super(nome, 950);
        this.armaCurta = armaCurta;
        this.armaLonga = armaLonga;
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        System.out.println("\nEscolha sua arma: ");
        System.out.println("1) ");
        this.armaCurta.descricao();
        System.out.println("2) ");
        this.armaLonga.descricao();

        int escolha = sc.nextInt();
        while (escolha < 1 || escolha > 2){
            System.out.println("Número inválido, escolha outro:");
            escolha = sc.nextInt();
        }

        if (escolha == 1){
            this.armaCurta.golpe(alvo);
        } else {
            this.armaLonga.golpe(alvo);
        }
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("não contava com minha paradinha!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("eu vou voltar pra te amassar");
    }
}

