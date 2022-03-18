public class Dog extends Animal {


    private boolean sharpTeeth = true;
    private boolean dogTraining = true;
    private String basicInfo;


    public Dog(String color, String sex, int age, boolean senseOfSmellFlair, boolean senseOfSight, boolean sharpTeeth, boolean dogTraining) {
        this.setColor(color);
        this.setSex(sex);
        this.setAge(age);
        this.setSenseOfSmellFlair(senseOfSmellFlair);
        this.setSenseOfSight(senseOfSight);
        this.sharpTeeth = sharpTeeth;
        this.dogTraining = dogTraining;
    }

    public boolean getSharpTeeth() {
        return sharpTeeth;
    }

    public void setSharpTeeth(boolean sharpTeeth) {
        this.sharpTeeth = sharpTeeth;
    }

    public boolean isDogTraining() {
        return dogTraining;
    }

    public void setDogTraining(boolean dogTraining) {
        this.dogTraining = dogTraining;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("My name is dog, and my greeting is av av.");
    }

    private void cuddleDog() {
        System.out.println("When the dog turns on his back he shows trust and wants to be cuddled.");
    }


    public void cuddle() {
        cuddleDog();
    }

    @Override
    protected String getBasicInfo() {
        super.getBasicInfo();
        System.out.println(this.sharpTeeth);
        System.out.println(this.dogTraining);
        return basicInfo;
    }
}
