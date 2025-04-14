import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.lang.Math.*;

public class Universe {
    public static void main(String[] args) {


        Animal a=new Animal(10,"Jungle","Nomad");
        Human h1=new Human(10,"Urban","Bob","BobName");
        Human h2=new Human(15,"Suburban","Marco","Polo");



        System.out.println("----------------PRODUCING BIG BANG---------------");
        while(true)
        {
            System.out.println("Checking for new entities...");
            File f=new File("src/WhereAliensComeFrom");
            File[] matchingFiles=f.listFiles();

            ArrayList<String> names=new ArrayList<>();

            if(matchingFiles==null)
            {
                System.out.println("Could not find folder where to get aliens from");
                return;
            }

            //adding file names of aliens to the arrayList
            for (File matchingFile : matchingFiles)
            {
                //remove the .class extension to only have the class name.
                String modified=matchingFile.getName().replace(".class","");
                modified=modified.replace(".java","");
                names.add(modified);
            }

            ArrayList<Class<?>> classArray=new ArrayList<>();
            System.out.println("Trying to get the classes.");
            for (String name : names)
            {
                try{
                    System.out.println("Trying to instantiate "+name);
                    Class<?> cString=Class.forName("WhereAliensComeFrom."+name);
                    classArray.add(cString);
//                    String nameClass=cString.getName();
//                    System.out.println("Name of class:"+nameClass);
                }
                catch(ClassNotFoundException e)
                {
                    System.out.println(e.getMessage());
                }

            }

            //Getting constructors and instantiating them
            for(Class<?> c:classArray)
            {
                try {
                    Object o = c.newInstance();
                    System.out.println("Instantiated "+c.getName());

                    Method[] methods=c.getDeclaredMethods();
                    for(Method m:methods)
                    {

                        Class<?>[] params=m.getParameterTypes();
                        Object[] argsMethod=new Object[params.length];
                        for (int k = 0; k < params.length; ++k)
                        {
                            String paramType = params[k].getName();
//                            System.out.print(paramType + " ");

                            if(paramType.equals("java.lang.Integer"))
                            {
                                //generate a random integer type.
                                Integer randInt=new Integer((int)(Math.random()*101));
                                argsMethod[k]=randInt;
                            }
                            else if(paramType.equals("java.lang.String"))
                            {
                                Integer randInt=new Integer((int)(Math.random()*101));
                                String randString = "bla bla"+randInt;
                                argsMethod[k]=randString;
                            }
                            else
                            {
                                System.out.println("Unknown parameter type");
                               argsMethod=null;
                               break;
                            }


                        }
                        //invoke the method using the ints/strings randomised

                        if(argsMethod!=null)
                        {
                            System.out.println("Invoking method:"+m.getName());
                            Object res=m.invoke(o,argsMethod);
                            System.out.println("Result:"+res);
                        }
                    }

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }


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