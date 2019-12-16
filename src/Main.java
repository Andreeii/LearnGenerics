public class Main {
    public static void main(String[] args) {

        Glass <Juice> glass = new Glass<>();
        Glass <Lemonade>glass1 = new Glass();


        glass.liquid = new Juice();
        glass1.liquid = new Lemonade();

        Juice j = glass.liquid;



    }
}
