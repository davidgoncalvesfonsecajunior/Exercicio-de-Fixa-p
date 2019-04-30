
public class Casa {

    String cor;
    boolean porta1;
    boolean porta2;
    boolean porta3;

    void pinta(String s) {
        this.cor = s;
    }

    int PortasAbertas() {
        int PortaAberta = 0;
        if (this.porta1) {
            PortaAberta++;
        }
        if (this.porta2) {
            PortaAberta++;
        }
        if (this.porta3) {
            PortaAberta++;
        }
        return PortaAberta;
    }
}
