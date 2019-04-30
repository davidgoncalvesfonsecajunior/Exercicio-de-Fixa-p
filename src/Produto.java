
public class Produto {

    double preco;
    String nome;

    double Diminuir10() {
        double valorComDesc = 0;
        valorComDesc = this.preco - (this.preco * .1);
        return valorComDesc;
    }

    double Aumenta25() {
        double valorComAum = 0;
        valorComAum = this.preco + (this.preco * .25);
        return valorComAum;

    }
}
