public class Demonion extends Inimigo {
    public Demonion() {
        super("Demonion", 500, 120, new Escudo(15));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("eu vou te comer !!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("eu sempre irei voltar !!!");
    }

}
