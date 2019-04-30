
public class MainProduto {

    public static void main(String[] args) {
        Produto P1 = new Produto();
        P1.nome = "Arroz";
        P1.preco = 12.00;
        System.out.println(P1.nome + "--> preco inicial: " + P1.preco);
        System.out.println(P1.nome + "--> preco com desconto: " + P1.Diminuir10());
        System.out.println(P1.nome + "--> preco com aumento: " + P1.Aumenta25());

        //testes
        Produto P2 = new Produto();
        P2.nome = "Cerveja Litrao";
        P2.preco = 6.50;
        System.out.println(P2.nome + "--> preco inicial: " + P2.preco);
        System.out.println(P2.nome + "--> preco com desconto: " + P2.Diminuir10());
        Produto P3 = new Produto();
        P3.nome = "Refrigerante 2L";
        P3.preco = 5.50;
        System.out.println(P3.nome + "--> preco inicial: " + P3.preco);
        System.out.println(P3.nome + "--> preco com aumento: " + P3.Aumenta25());

    }
}
