public class Main {
    public static void main(String[] args) {
        double [] harmonic = {10,20};
        double tplm = 0;
        for (int a = 0; a < harmonic.length; a++){
            tplm += 1 / (harmonic[a]);
        }
        double tplm2 = harmonic.length / tplm;
        System.out.println(tplm2);
    }
}