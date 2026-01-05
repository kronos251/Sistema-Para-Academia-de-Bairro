import java.util.ArrayList;

public class Instrutor extends Usuario {

    String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();


    void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    void removerAlunos(Aluno aluno){
        alunos.remove(aluno);
    }

    void alterarAlunos(Aluno aluno, int codigo){
        alunos.set(codigo,aluno);
    }

}
