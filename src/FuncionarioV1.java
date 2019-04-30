
public class FuncionarioV1 {

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

}
