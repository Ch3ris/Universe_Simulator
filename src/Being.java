public abstract class Being {
    int lifeTime;
    String StyleOfLife;
    public Being(int lifeTime, String StyleOfLife) {
        this.lifeTime = lifeTime;
        this.StyleOfLife = StyleOfLife;
    }
    @Override
    public String toString() {
        return "lifeTime " + lifeTime + " StyleOfLife " + StyleOfLife;
    }
}
