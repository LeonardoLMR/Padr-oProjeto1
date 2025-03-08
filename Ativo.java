package classes;

public class Ativo implements EstadoAluno{

    public void imprimirEstado(AlunoTurma alunoTurma) {
        System.out.println("Estudante: " + alunoTurma.getAluno().getNome() + " (Aprovado)");
    }
    
}
