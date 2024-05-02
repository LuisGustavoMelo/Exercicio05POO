package luis.project;
import java.util.List;

public class Triagem {
    private FilaEspera filaEspera;

    public Triagem(FilaEspera filaEspera) {
        this.filaEspera = filaEspera;
    }

    public void triarPessoa(Paciente paciente) {
        Prioridade prioridade = classificarPrioridade(paciente.getSintomas());
        filaEspera.adicionarPessoa(paciente, prioridade);
        System.out.println("Paciente " + paciente.getNome() + " triada com prioridade " + prioridade);
    }

    private Prioridade classificarPrioridade(List<String> sintomas) {
        // Lógica para classificar a prioridade com base nos sintomas
        // Se a pessoa tiver algum sintoma, sua prioridade é VERMELHO, caso contrário, VERDE
        return sintomas.isEmpty() ? Prioridade.VERDE : Prioridade.VERMELHO;
    }
}




