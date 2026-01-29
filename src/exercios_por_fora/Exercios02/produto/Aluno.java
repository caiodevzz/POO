package exercios_por_fora.Exercios02.produto;

public class Aluno {
    public String nome;
    public Integer idade;
    public Double nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome , Integer idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public Aluno(String nome, Integer idade, Double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nota: " + this.nota);
    }

    public boolean aprovado() {
        System.out.println("Nome: " + getNome());
        if (nota >= 6) {
            System.out.println("Aprovado");
            return true;
        }else {
            System.out.println("Reprovou");
            return false;
        }

    }
}
