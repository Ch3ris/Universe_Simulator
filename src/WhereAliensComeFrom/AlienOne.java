package WhereAliensComeFrom;

// Source code is decompiled from a .class file using FernFlower decompiler.
public class AlienOne {
   public AlienOne() {
   }

   public void angry() {
      System.out.println("yaaaawwwwnnn");
   }

   public void eat(Integer i) {
      System.out.println("I will eat " + i + " hamburgers!");
   }

   public void greet(String s) throws InterruptedException {
      System.out.println("I don't like your name! Now formatting your harddisk ... ");

      for(int i = 0; i < 50; ++i) {
         Thread.sleep(200L);
         System.out.print(".");
      }

      System.out.println("...");
   }

   public void special(Integer i1, String s1, Integer i2, String s2) {
      System.out.println("******** " + s1 + " " + i1 + " " + s2 + " " + i2);
   }
}
