package classes;

public class Recuperacao implements EstadoAluno {

    public void imprimirEstado(AlunoTurma alunoTurma) {
        System.out.println("Estudante: " + alunoTurma.getAluno().getNome() + " (Em Recuperação)");
    }
    
}
