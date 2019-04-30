
public class TestaFuncionarioV3 {

    public static void main(String[] args) {
        Data D1 = new Data();
        D1.dia = 14;
        D1.mes = 04;
        D1.ano = 2019;
        FuncionarioV3 F3 = new FuncionarioV3();
        F3.nome = "david";
        F3.departamento = "TI";
        F3.salario = 1000;
        F3.rg = "12345678";
        F3.ativo = true;
        F3.admicao = D1;

        F3.bonifica(10);
        F3.mostrar();
    }
}
