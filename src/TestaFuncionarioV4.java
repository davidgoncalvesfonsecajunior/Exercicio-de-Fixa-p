
public class TestaFuncionarioV4 {

    public static void main(String[] args) {
        Data D1 = new Data();
        D1.dia = 14;
        D1.mes = 04;
        D1.ano = 2019;
        FuncionarioV4 F3 = new FuncionarioV4();
        F3.nome = "david";
        F3.departamento = "TI";
        F3.salario = 1000;
        F3.rg = "12345678";
        F3.ativo = true;
        F3.admicao = D1;

        F3.bonifica(10);
        F3.mostrar();
        //novo funcionario para o teste
        Data D2 = new Data();
        D2.dia = 14;
        D2.mes = 04;
        D2.ano = 2019;
        FuncionarioV4 F4 = new FuncionarioV4();
        F4.nome = "david";
        F4.departamento = "TI";
        F4.salario = 1000;
        F4.rg = "12345678";
        F4.ativo = true;
        F4.admicao = D1;

        F4.bonifica(10);
        F4.mostrar();

        F3.equals(F4);
    }

}
