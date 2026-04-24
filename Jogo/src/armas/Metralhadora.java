import java.util.Random;

public class Metralhadora extends Arma {
    private int municao;

    public Metralhadora(){
        super("Metralhadora", 200, 55);
        this.municao = 10;
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "% - Munição: " + this.municao);
    }

    @Override
    public void golpe(Criatura alvo) {
        // Verifica se tem munição
        if (this.municao <= 0) {
            System.out.println("Sem munição! A Metralhadora não pode ser usada!");
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
