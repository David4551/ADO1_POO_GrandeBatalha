public class Darius extends Inimigo {
    public Darius() {
        super("Darius", 600, 100, new Escudo(20));
    }

    @Override
    public void fazAtaque(Criatura alvo) {
        // com isso o darius tem 30% de chance de ataque crítico (dobra o dano)
        if (Math.random() < 0.3) {
            alvo.tomaDano(this.getAtaque() * 2);
            System.out.println("ATAQUE CRÍTICO de Darius! Dano dobrado!");
        } else {
            super.fazAtaque(alvo);
        }
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("Eu sou Darius, o destruidor de reinos!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println("Isto não é o fim... apenas o começo!");
    }
}
