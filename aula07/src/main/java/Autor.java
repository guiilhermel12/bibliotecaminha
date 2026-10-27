import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int id;
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarLivro(int id, String nome) {
        livros.add(new Livro(this, id, nome));
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
}