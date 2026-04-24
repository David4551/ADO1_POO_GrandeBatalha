import java.util.Random;

public class Pistola extends Arma {
    private int municao;

    public Pistola(){
        super("Pistola", 150, 50);
        this.municao = 15;
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "% - Munição: " + this.municao);
    }

    @Override
    public void golpe(Criatura alvo) {
        // Verifica se tem munição
        if (this.municao <= 0) {
            System.out.println("Sem munição! A Pistola não pode ser usada!");
            alvo.tomaDano(0);
            return;
        }

        // Consome munição
        this.municao--;

        // Executa o ataque
        Random rd = new Random();
        int sorteio = rd.nextInt(100);

        if (sorteio < 70) {
            alvo.tomaDano(this.getAtaque());
        } else {
            System.out.println("Ataque Falhou.");
        }
    }

    public int getMunicao() {
        return this.municao;
    }
}
