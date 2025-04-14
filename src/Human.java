public class Human extends Being{
    String givenName;
    String familyName;
    public Human(int lifeTime,String StyleOfLife,String givenName, String familyName) {
        super(lifeTime,StyleOfLife);
        this.lifeTime=lifeTime;
        this.StyleOfLife=StyleOfLife;
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Human"+" givenName="+givenName+" familyName="+familyName+" "+super.toString();
    }
}
