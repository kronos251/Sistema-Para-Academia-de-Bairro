import java.util.ArrayList;

public class AcademiaSystem {

    ArrayList<Instrutor> instrutores = new ArrayList<>();
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    void adicionarInstrutores(Instrutor instrutor){
        instrutores.add(instrutor);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
