import java.util.Random;

public class ArcoEFlecha extends Arma {
    private int municao;

    public ArcoEFlecha(){
        super("Arco e Flecha", 30, 40);
        this.municao = 20;
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "% - Munição: " + this.municao);
    }

    @Override
    public void golpe(Criatura alvo) {
        // Verifica se tem munição
        if (this.municao <= 0) {
            System.out.println("Sem munição! O Arco e Flecha não pode ser usado!");
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

