public abstract class Animal {

    private String color;
    private String sex;
    private int age;
    private boolean senseOfSmellFlair = true;
    private boolean senseOfSight = true;
    private String basicInfo;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getSex() {
        return sex;
    }

    protected void setSex(String sex) {
        this.sex = sex;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public boolean isSenseOfSmellFlair() {
        return senseOfSmellFlair;
    }

    public void setSenseOfSmellFlair(boolean senseOfSmellFlair) {
        this.senseOfSmellFlair = senseOfSmellFlair;
    }

    public boolean isSenseOfSight() {
        return senseOfSight;
    }

    public void setSenseOfSight(boolean senseOfSight) {
        this.senseOfSight = senseOfSight;
    }

    protected void speak() {
        System.out.println("I am an animal!");
    }

    protected abstract void cuddle();

    protected String getBasicInfo() {
        System.out.println("Sex is: " + getSex());
        System.out.println("Age is: " + getAge());
        System.out.println("Color is: " + getColor());
        return basicInfo;
    }
}
