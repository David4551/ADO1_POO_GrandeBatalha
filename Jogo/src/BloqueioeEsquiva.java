import java.util.Random;

public class BloqueioeEsquiva extends Defesa {
    private int chancesEsquiva;
    private int reducaoBloqueio;

    public BloqueioeEsquiva(int chancesEsquiva, int reducaoBloqueio) {
        this.chancesEsquiva = chancesEsquiva;
        this.reducaoBloqueio = reducaoBloqueio;
    }

    @Override
    public int danoReduzido(int danoOriginal) {
        Random rd = new Random();
        int sorteio = rd.nextInt(100);

        // Tenta esquivar primeiro (chance de evitar todo o dano)
        if (sorteio < this.chancesEsquiva) {
            System.out.println("*** Esquiva bem-sucedida! Nenhum dano recebido! ***");
            return 0;
        }

        // Se não conseguir esquivar, aplica o bloqueio
        if (this.reducaoBloqueio > danoOriginal) {
            System.out.println("Bloqueio total! Dano completamente reduzido!");
            return 0;
        }

        int danoReduzido = danoOriginal - this.reducaoBloqueio;
        System.out.println("Bloqueio parcial! Dano reduzido em " + this.reducaoBloqueio + "! ");
        return danoReduzido;
    }
}
