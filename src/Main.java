public class Main {
    public static void main(String[] args) {

        Glass <Juice> glass = new Glass<>();
        Glass <Lemonade>glass1 = new Glass();

        Glass<String> glass2 = new Glass<>();


        glass2.liquid = "Tomato juice";//this glass if of a type string

        glass.liquid = new Juice();
        glass1.liquid = new Lemonade();

        Juice juice = glass.liquid; //i can make a Juice object and give him value from glass.liquid , becouse glass.liquid is of type Juice.
        Lemonade lemonade = glass1.liquid;//i can make a Lemonade object and give him value from glass1.liquid , becouse glass.liquid is of type Lemonade.

        System.out.println(glass2.liquid);

    }
}
