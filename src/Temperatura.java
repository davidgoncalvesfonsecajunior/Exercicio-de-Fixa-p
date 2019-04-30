
public class Temperatura {

    double converterParaCelsius(double temperaturaF) {
        double ValorConvertidoC = 0;
        ValorConvertidoC = (temperaturaF - 32) / 1.8;
        return ValorConvertidoC;

    }

    double converterParaFahrenheit(double temperaturaC) {
        double ValorConvertidoF = 0;
        ValorConvertidoF = (temperaturaC * 1.8) + 32;
        return ValorConvertidoF;
    }

}
