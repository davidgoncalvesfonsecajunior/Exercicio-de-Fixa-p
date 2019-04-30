
public class TestaFuncionarioV1 {

    public static void main(String[] args) {
        FuncionarioV1 F1 = new FuncionarioV1();
        F1.nome = "david";
        F1.departamento = "TI";
        F1.salario = 1000;
        F1.data = "15/04/2019";
        F1.rg = "12345678";
        F1.ativo = true;

        F1.bonifica(10);
        System.out.println("funcionario: " + F1.nome + " do departamento: "
                + F1.departamento + " contem o salario: " + F1.salario);
    }
}
