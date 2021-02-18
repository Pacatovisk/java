package poo;

public class AppFuncionario {

    private Funcionario funcionario;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.setFuncao("Administrador");
        funcionario.setNome("Marcelo Viana Dias");
        funcionario.setIdade(21);

        System.out.println("Nome:"+ funcionario.getNome()+ " Função:" + funcionario.getFuncao() + " Idade:" + funcionario.getIdade());
    }
}
