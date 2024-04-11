public class Gato extends Animal implements Executavel{

    @Override
    public void fazerSom() {
        System.out.println(nome + " gato: Mia!");
    }

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        System.out.println(nome + " Está correndo!");
    }
}
