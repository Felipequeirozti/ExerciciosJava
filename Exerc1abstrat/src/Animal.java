public abstract class Animal {
    // Interface para animais que podem emitir sons
    public abstract void fazerSom();

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}
