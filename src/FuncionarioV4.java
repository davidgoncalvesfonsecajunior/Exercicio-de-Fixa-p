
public class FuncionarioV4 {

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
        admicao.mostrar();
    }

    void equals(FuncionarioV4 func1) {

        if (this.nome == func1.nome) {
            if (this.departamento == func1.departamento) {
                if (this.salario == func1.salario) {
                    if (this.admicao == func1.admicao) {
                        if (this.rg == func1.rg) {
                            if (this.ativo == func1.ativo) {
                                System.out.println("iguais");
                            } else {
                                System.out.println("Nao iguais");
                            }
                        } else {
                            System.out.println("Nao iguais");
                        }
                    } else {
                        System.out.println("Nao iguais");
                    }
                } else {
                    System.out.println("Nao iguais");
                }

            } else {
                System.out.println("Nao iguais");
            }

        } else {
            System.out.println("Nao iguais");
        }
    }
}
