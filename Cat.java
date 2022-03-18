public class Cat extends Animal {

    private boolean yarn = false;
    private boolean scratches = false;
    private String basicInfo;

    public Cat(String color, String sex, int age, boolean senseOfSmellFlair, boolean senseOfSight) {
        this.setColor(color);
        this.setSex(sex);
        this.setAge(age);
        this.setSenseOfSmellFlair(senseOfSmellFlair);
        this.setSenseOfSight(senseOfSight);
    }

    public boolean isYarn() {
        return yarn;
    }

    public void setYarn(boolean yarn) {
        this.yarn = yarn;
    }

    public boolean isScratches() {
        return scratches;
    }

    public void setScratches(boolean scratches) {
        this.scratches = scratches;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("My name is cat, and my greeting is meow.");
    }

    private void cuddleCat() {
        if (yarn) {
            System.out.println("The cat wants to be cuddle.");
        } else if (scratches) {
            System.out.println("The cat does not want to be cuddle. ");
        }
    }


    public void cuddle() {
        cuddleCat();

    }

    @Override
    protected String getBasicInfo() {
        super.getBasicInfo();
        return basicInfo;
    }

}
