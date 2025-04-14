package WhereAliensComeFrom;


public class AlienTwo {
    public AlienTwo() {
    }

    public void angry() {
        System.out.println("Angry from AlienTwo");
    }

    public void eat(Integer i) {
        System.out.println("Eat from AlienTwo");
    }

    public void greet(String s) throws InterruptedException {
        System.out.println("Greet from AlienTwo");

        for(int i = 0; i < 50; ++i) {
            Thread.sleep(200L);
            System.out.print(".");
        }

        System.out.println("...");
    }

    public void special(Integer i1, String s1, Integer i2, String s2) {
        System.out.println("Special from AlienTwo");
        System.out.println("******** " + s1 + " " + i1 + " " + s2 + " " + i2);
    }
}
