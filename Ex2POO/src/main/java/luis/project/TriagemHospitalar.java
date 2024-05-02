package luis.project;
import java.util.ArrayList;
import java.util.List;

public class TriagemHospitalar {
    public static void main(String[] args) {
        // Criando instâncias de pessoas para triagem
        new ArrayList<>();
        Paciente paciente1 = new Paciente("João", 30, 'M', List.of("Enjoo"));
        Paciente paciente2 = new Paciente("Maria", 40, 'F', List.of("Febre", "Tosse"));
        Paciente paciente3 = new Paciente("José", 50, 'M', List.of("Dor de cabeça"));

        // Criando uma fila de espera
        FilaEspera filaEspera = new FilaEspera();

        // Criando uma instância de Triagem
        Triagem triagem = new Triagem(filaEspera);

        // Realizando a triagem das pessoas
        triagem.triarPessoa(paciente1);
        triagem.triarPessoa(paciente2);
        triagem.triarPessoa(paciente3);

        // Removendo e imprimindo a próxima pessoa na fila de espera
        Paciente proximaPaciente1 = filaEspera.removerProximaPessoa();
        Paciente proximaPaciente2 = filaEspera.removerProximaPessoa();
        Paciente proximaPaciente3 = filaEspera.removerProximaPessoa();

        System.out.println("Próxima pessoa na fila é : " + (proximaPaciente1 != null ? proximaPaciente1.getNome() : "Nenhuma"));
        System.out.println("Próxima pessoa na fila é : " + (proximaPaciente2 != null ? proximaPaciente2.getNome() : "Nenhuma"));
        System.out.println("Próxima pessoa na fila é : " + (proximaPaciente3 != null ? proximaPaciente3.getNome() : "Nenhuma"));
    }
}
