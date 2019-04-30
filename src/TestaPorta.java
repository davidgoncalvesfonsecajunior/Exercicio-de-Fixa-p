
public class TestaPorta {

    public static void main(String[] args) {

        Porta PT1 = new Porta();
        PT1.cor = "marron";
        PT1.dimensaoX = 2.10;
        PT1.dimensaoY = 0.90;
        PT1.dimensaoZ = 0.10;
        PT1.aberta = false;
        PT1.fecha();
        PT1.abre();
        PT1.fecha();
        if (PT1.estaAberta()) {
            System.out.println("Porta aberta");
        } else {
            System.out.println("Porta Fechada");
        }
        System.out.println("porta: " + PT1.cor);
        System.out.println("altura: " + PT1.dimensaoX);
        System.out.println("largura: " + PT1.dimensaoY);
        System.out.println("espessura: " + PT1.dimensaoZ);
        PT1.abre();
        PT1.pinta("azul");
        if (PT1.estaAberta()) {
            System.out.println("Porta aberta");
        } else {
            System.out.println(" Porta Fechada");
        }
        PT1.dimensaoX = 1.90;
        PT1.dimensaoY = 0.80;
        PT1.dimensaoZ = 0.07;
        System.out.println("porta: " + PT1.cor);
        System.out.println("altura: " + PT1.dimensaoX);
        System.out.println("largura: " + PT1.dimensaoY);
        System.out.println("espessura: " + PT1.dimensaoZ);
    }
}
