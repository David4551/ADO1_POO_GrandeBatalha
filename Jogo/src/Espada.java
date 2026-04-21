public class Espada extends Arma {
    public Espada(){
        super("Espada", 50, 60);
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "%");
    }
}

