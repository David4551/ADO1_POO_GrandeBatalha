public class Duth extends Inimigo {
    public Duth() {
        super("Duth", 800, 80, new BloqueioeEsquiva(25, 15));
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Duth, a sombra da perdição!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Meu poder transcende a morte...");
    }
}
