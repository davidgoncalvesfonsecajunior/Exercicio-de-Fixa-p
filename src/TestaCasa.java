
public class TestaCasa {

    public static void main(String[] args) {
        Casa C1 = new Casa();
        C1.cor = "azul";
        C1.porta1 = true;
        C1.porta2 = true;
        C1.porta3 = true;
        System.out.println("Cor da casa: " + C1.cor);
        System.out.println("Portas abertas na casa: " + C1.PortasAbertas());
        C1.pinta("Laranja Fluorecente");
        C1.porta1 = false;
        C1.porta2 = false;
        C1.porta3 = true;
        System.out.println("Cor da casa: " + C1.cor);
        System.out.println("Portas abertas na casa: " + C1.PortasAbertas());

    }
}
