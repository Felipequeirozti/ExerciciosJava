public class Passarinho extends Animal implements Voavel{


    @Override
    public void fazerSom() {
        System.out.println(nome + " passarinho: Assobia");
    }

    public Passarinho(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        System.out.println(nome + " passarinho está voando");
    }
}
