import java.util.concurrent.TimeUnit;

public class Universe {
    public static void main(String[] args) {


        Animal a=new Animal(10,"Jungle","Nomad");
        Human h1=new Human(10,"Urban","Bob","BobName");
        Human h2=new Human(15,"Suburban","Marco","Polo");

//        System.out.println(a);
//        System.out.println(h1);
//        System.out.println(h2);

        System.out.println("----------------PRODUCING BIG BANG---------------");
        while(true)
        {
            System.out.println("Checking for new entities...");
            try
            {
                TimeUnit.SECONDS.sleep(5);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted from source control");
            }
            System.out.println("Finished checking for new entities...");
            try
            {
                TimeUnit.SECONDS.sleep(5);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted from source control");
            }
        }
    }
}