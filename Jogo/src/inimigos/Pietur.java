public class Pietur extends Inimigo {
    public Pietur() {
        super("Pietur", 550, 110, new Escudo(10));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Prepare-se para encontrar seu fim, mortal!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Nãããããããããããããoooooo!");
    }
}
