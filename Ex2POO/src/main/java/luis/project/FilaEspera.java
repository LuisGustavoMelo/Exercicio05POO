package luis.project;
import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private Queue<Paciente> filaVermelha;
    private Queue<Paciente> filaAmarela;
    private Queue<Paciente> filaVerde;

    public FilaEspera() {
        filaVermelha = new LinkedList<>();
        filaAmarela = new LinkedList<>();
        filaVerde = new LinkedList<>();
    }

    public void adicionarPessoa(Paciente paciente, Prioridade prioridade) {
        switch (prioridade) {
            case VERMELHO:
                filaVermelha.offer(paciente);
                break;
            case AMARELO:
                filaAmarela.offer(paciente);
                break;
            case VERDE:
                filaVerde.offer(paciente);
                break;
        }
    }

    public Paciente removerProximaPessoa() {
        // Remover a próxima pessoa de acordo com a prioridade
        if (!filaVermelha.isEmpty()) {
            return filaVermelha.poll();
        } else if (!filaAmarela.isEmpty()) {
            return filaAmarela.poll();
        } else if (!filaVerde.isEmpty()) {
            return filaVerde.poll();
        } else {
            throw new IllegalStateException("Não há pessoas na fila de espera.");
        }
    }
}
