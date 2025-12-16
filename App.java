public class App {
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto();

        //antaa arvo autolle
        auto1.merkki = "VW";
        auto1.malli = "Golf";
        auto1.bensanMaara = 50;

        //tulostaa tiedot jos bensa on yli 0, muuten jarruttaa
        if(auto1.bensanMaara > 0) {
            auto1.tulostaTiedot();
        } else {
            auto1.jarruta();
        }
    }
} // Appin loppu

//Luodaan Auto-luokka
class Auto {

   //Attributes
    String merkki; 
    String malli;
    int bensanMaara;

    //Metodit
        public void jarruta() {
            System.out.println("Auto jarruttaa.");
        }
        public void tulostaTiedot() {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }
}
