public class Main {
    public static void main(String[] args) {
        Criatura jogador = new Jogador ("Dadinho");
        Criatura inimigo = new Malignus();


        System.out.println("#############");
        System.out.println("A GRANDE BATALHA");
        System.out.println("#############");

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        int cont = 0;
        while (true){
            cont++;
            System.out.println("Rodada" + cont);
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if(inimigo.estaVivo()){
                inimigo.fazAtaque(jogador);
            }
            if(!jogador.estaVivo()){
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + "venceu!");
                break;
            }else if (!inimigo.estaVivo()){
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + "venceu!");
                break;
            }
        }

    }
}