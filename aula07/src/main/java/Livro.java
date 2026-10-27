public class Livro {
    private Autor autor;
    private int id;
    private String nome;

    public Livro(Autor autor, int id, String nome) {
        this.autor = autor;
        this.id = id;
        this.nome = nome;
    }

    public Autor getAutor() { return autor; }
    public int getId() { return id; }
    public String getNome() { return nome; }
}