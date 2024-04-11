public class Cachorro extends Animal implements Executavel{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " Cachorro: Late!");
    }

    @Override
    public void correr() {
        System.out.println(nome+ " Está correndo!");
    }
}
