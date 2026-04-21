import java.util.Random;

public abstract class Arma {
    private String nome;
    private int ataque;
    private int chance;


    public Arma (String nome, int ataque, int chance){
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
    }

    public void descricao (){
        System.out.println(this.nome + " - Dano: " + this.ataque + " - Chance: " + this.chance + "%");
    }

    public void golpe (Criatura alvo) {
        Random rd = new Random();
        int sorteio = rd.nextInt(100);

        if (sorteio  < 70) {
            alvo.tomaDano(this.ataque);
        } else {
            System.out.println("Ataque Falhou.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getChance() {
        return this.chance;
    }

}

