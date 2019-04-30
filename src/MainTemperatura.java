
public class MainTemperatura {

    public static void main(String[] args) {
        Temperatura T1 = new Temperatura();
        System.out.println("Conversao de Fahrenheit para Celsius: " + T1.converterParaCelsius(572));
        System.out.println("Conversao de Celsius para Fahrenheit: " + T1.converterParaFahrenheit(300));

        //Formula achada na conversao do google ---> ( 0ºC * 9/5 ) + 32 = 32ºF
    }

}
