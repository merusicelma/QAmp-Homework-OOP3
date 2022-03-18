public class SiameseCat extends Cat {

    private boolean blueEyes = true;
    private boolean shortHair = true;
    private String basicInfo;

    public SiameseCat(String color, String sex, int age, boolean senseOfSmellFlair, boolean senseOfSight, boolean blueEyes, boolean shortHair) {
        super(color, sex, age, senseOfSmellFlair, senseOfSight);
        this.setColor(color);
        this.setSex(sex);
        this.setAge(age);
        this.setSenseOfSmellFlair(senseOfSmellFlair);
        this.setSenseOfSight(senseOfSight);
        this.blueEyes = blueEyes;
        this.shortHair = shortHair;
    }

    public boolean isBlueEyes() {
        return blueEyes;
    }

    public void setBlueEyes(boolean blueEyes) {
        this.blueEyes = blueEyes;
    }

    public boolean isShortHair() {
        return shortHair;
    }

    public void setShortHair(boolean shortHair) {
        this.shortHair = shortHair;
    }

    @Override
    public void speak() {
        System.out.println("My name is siamese cat, and my greeting is meow meow.");
    }

    private void cuddleSiameseCat() {
        System.out.println("If a cat yarn it wants to be cuddled.");
    }


    public void cuddle() {
        cuddleSiameseCat();

    }


    @Override
    protected String getBasicInfo() {
        super.getBasicInfo();
        System.out.println(this.blueEyes);
        System.out.println(this.shortHair);
        return basicInfo;
    }
}
