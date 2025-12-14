public class App {
    public static void main(String[] args) throws Exception {
        
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

