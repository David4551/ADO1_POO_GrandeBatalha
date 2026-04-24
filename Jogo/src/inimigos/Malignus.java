public  class Malignus extends Inimigo{
    public Malignus() {
        super("Malignus", 1000,50 );
    }

    @Override
    public void fraseApresentacao() {
        System.out.println("vou te comer");
    }

    @Override
    public void fraseMorte() {
 System.out.println("aaaain ouuuh to morrendo" );
    }
}
