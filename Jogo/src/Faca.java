public class Faca extends Arma{
    public Faca (){
        super("Faca", 40, 100);
    }

    @Override
    public void descricao() {
        System.out.println(this.getNome() + " - Dano: " + this.getAtaque() + " - Chance: " + this.getChance() + "%");
    }
}

