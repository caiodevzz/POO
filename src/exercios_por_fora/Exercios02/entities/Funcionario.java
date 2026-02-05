package exercios_por_fora.Exercios02.produto;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario(String nome, Double salario, Integer horasTrabalhadas) {
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calcularSalario() {
        System.out.println("Salario calculado: " + " NOME " + this.nome);
        System.out.printf("Media salarial: %.2f" , this.salario + (horasTrabalhadas * 20));
    }

    public void mostrarFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
    }
}
