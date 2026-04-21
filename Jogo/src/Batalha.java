public class Batalha {
    private Criatura jogador;
    private Criatura inimigo;
    private Criatura vencedor;

    public Batalha(Criatura jogador, Criatura inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.vencedor = null;
    }

    public void iniciar() {
        System.out.println("\n" + this.jogador.getNome() + " vs " + this.inimigo.getNome() + "\n");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        int cont = 0;
        while (true) {
            cont++;
            System.out.println("\nRodada " + cont);
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu!");
                this.vencedor = inimigo;
                break;
            } else if (!inimigo.estaVivo()) {
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu!");
                this.vencedor = jogador;
                break;
            }
        }
    }

    public Criatura getVencedor() {
        return this.vencedor;
    }

    public String getNomeVencedor() {
        if (this.vencedor != null) {
            return this.vencedor.getNome();
        }
        return "Nenhum vencedor";
    }

    public Criatura getJogador() {
        return this.jogador;
    }

    public Criatura getInimigo() {
        return this.inimigo;
    }
}
