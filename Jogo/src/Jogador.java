import java.util.Random;
import java.util.Scanner;


public class Jogador extends Criatura{

    Scanner sc = new Scanner(System.in);
    private int ataquePerto = 40;
    private int ataqueLonge = 150;

    private Arma[] armas = {
            new Faca(),
            new Pistola()
    };

    public Jogador(String nome) {
        super(nome, 950);
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        System.out.println("Escolha sua arma: ");
        int n = 0;
        for(Arma arma : armas){
            n++;
            System.out.println(n + ") " );
            arma.descricao();
        }


        int escolha = sc.nextInt();
        while (escolha < 1 || escolha > n){
            System.out.println("Número inválido, escolha outro:");
            escolha = sc.nextInt();
        }


        if (escolha == 1){
            alvo.tomaDano(this.ataquePerto);
        } else{
            Random rd = new Random();
            int sorteio = rd.nextInt(100);


            if (sorteio >= 70){
                alvo.tomaDano(this.ataqueLonge);
            }else{
                System.out.println("Ataque Falhou.");
            }

            armas[n-1].golpe(alvo);

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
