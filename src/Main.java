import java.util.ArrayList;

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

    //here i created two different ArrayList , one is composed from integers and another is composed from strings
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String>  list2 = new ArrayList<>();

        list1.add(2);//adding element in list1 of type int
        list2.add("Hello");//adding element in list 2 of type String

        //display list1
        for(String i:list2){
            System.out.println(i);
        }

        //display list2
        for(int i:list1){
            System.out.println(i);
        }

        Bartender bartender= new Bartender();
        bartender.mix(juice,lemonade);


    }
}
