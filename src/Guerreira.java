public class Guerreira extends Personagem {
    private int escudo;


    public Guerreira(String nome) {
        super(nome);
        this.escudo = 3;
    }

    public void defender () {
        this.escudo -= 1;

    }
}
