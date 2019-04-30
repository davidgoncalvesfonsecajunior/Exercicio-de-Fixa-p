
public class TestaFuncionarioV2 {

    public static void main(String[] args) {
        FuncionarioV2 F2 = new FuncionarioV2();
        F2.nome = "david";
        F2.departamento = "TI";
        F2.salario = 1000;
        F2.data = "15/04/2019";
        F2.rg = "12345678";
        F2.ativo = true;

        F2.bonifica(10);
        F2.mostrar();
    }
}

