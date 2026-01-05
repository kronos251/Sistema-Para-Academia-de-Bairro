public class Aluno extends Usuario {

    String nome;
    double peso;
    double altura;
    String objetivo;
    Endereco endereco;


    public Aluno(String nome, double peso, double altura, String objetivo, Endereco endereco){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.objetivo = objetivo;
        this.endereco = new Endereco();

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }



}
