public class Main {
    public static void main(String[] args) {

        // Exercício 01: Agregação
        Motor motor = new Motor(1, "V8");
        Carro carro = new Carro(1, "Fusca", motor);

        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Motor: " + carro.getMotor().getModelo());

        // Exercício 02: Composição
        Autor autor = new Autor(1, "Machado de Assis");
        autor.adicionarLivro(1, "Dom Casmurro");

        System.out.println("Autor: " + autor.getNome());
        System.out.println("Livro: " + autor.getLivros().get(0).getNome());

        // Exercício 03: Herança
        PessoaFisica pf = new PessoaFisica(
                "João", "Angicos", "12345678900"
        );

        PessoaJuridica pj = new PessoaJuridica(
                "Empresa ABC", "Mossoró", "12345678000199"
        );

        System.out.println("Pessoa física: " + pf.getNome());
        System.out.println("CPF: " + pf.getCpf());

        System.out.println("Pessoa jurídica: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}