package classes;

public class AlunoTurma {
    private Aluno aluno;
    private Nota nota;
    private EstadoAluno estado;

    public AlunoTurma(){
        this.estado = new Ativo();
    }
    
    public AlunoTurma(Aluno aluno){
        this();
        this.aluno = aluno;
        this.nota = new Nota();
    }

    public AlunoTurma(Aluno aluno, Nota nota){
        this.aluno = aluno;
        this.nota =nota;
    }

    public Nota getNota(){
        return nota;
    }

    public void setNota(Nota nota){
        this.nota = nota;
        if (nota.calcularMedia() >= 7) {
            setEstadoAluno(new Ativo() {});
        } else if(nota.calcularMedia() >= 2.5){
            setEstadoAluno(new Recuperacao());
        } else{
            setEstadoAluno(new Reprovado());
        }
    }

    public Aluno getAluno(){
        return aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public void setEstadoAluno(EstadoAluno estado) {
        this.estado = estado;
    }

    public void imprimirEstado() {
        estado.imprimirEstado(this);
    }
    
}
