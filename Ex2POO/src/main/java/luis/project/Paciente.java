package luis.project;
import java.util.List;
import java.util.Objects;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private char sexo;
    private List<String> sintomas;

    public Paciente(String nome, int idade, char sexo, List<String> sintomas) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.sintomas = sintomas;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    @Override
    public int compareTo(Paciente outraPaciente) {
        return this.nome.compareTo(outraPaciente.getNome());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return idade == paciente.idade &&
                sexo == paciente.sexo &&
                Objects.equals(nome, paciente.nome) &&
                Objects.equals(sintomas, paciente.sintomas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, sexo, sintomas);
    }
}
