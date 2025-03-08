package classes;

public class Reprovado implements EstadoAluno{

    public void imprimirEstado(AlunoTurma alunoTurma) {
        System.out.println("Estudante: " + alunoTurma.getAluno().getNome() + " (Reprovado)");
    }
    
}
