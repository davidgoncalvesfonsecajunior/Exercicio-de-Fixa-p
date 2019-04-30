
public class FuncionarioV3 {

    String nome;
    String departamento;
    double salario;
    Data admicao;
    String rg;
    boolean ativo;

    void bonifica(double aumento) {
        this.salario += (salario * aumento) / 100;

    }

    void demite() {

        this.ativo = false;

    }

    void mostrar() {
        System.out.println("funcionario: \n" + this.nome + "\nRG: \n" + this.rg
                + "\ndepartamento: \n" + this.departamento + "\nsalario: \n"
                + this.salario + " \nadmitido: ");
        this.admicao.mostrar();
    }

}
