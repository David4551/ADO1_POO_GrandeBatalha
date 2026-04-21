public class Katana extends Arma {
    public Katana(){
        super("Katana", 70, 75);
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "%");
    }
}

