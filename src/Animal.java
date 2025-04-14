public class Animal extends Being {
    private String Habitat;
    public Animal(int lifeTime, String Habitat,String StyleOfLife)
    {
        super(lifeTime,StyleOfLife);
        this.lifeTime=lifeTime;
        this.Habitat = Habitat;
    }
    @Override
    public String toString()
    {
        return "Animal [Habitat=" + Habitat + "]"+" "+super.toString();
    }
}
