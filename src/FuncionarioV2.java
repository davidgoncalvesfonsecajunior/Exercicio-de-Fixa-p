
public class FuncionarioV2 {

    String nome;
    String departamento;
    double salario;
    String data;
    String rg;
    boolean ativo;

    void bonifica(double aumento) {
        this.salario += (this.salario * aumento) / 100;

    }

    void demite() {

        this.ativo = false;

    }

    void mostrar() {
        System.out.println("funcionario: " + this.nome + "\nRG: " + this.rg
                + "\ndepartamento: " + this.departamento + "\nsalario: "
                + this.salario + " \nadmitido: " + this.data);

    }

}
