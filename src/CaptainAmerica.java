import com.company.CaptainAmericA;

public class CaptainAmerica extends com.company.MarvelCinematicUniverse implements CaptainAmericA {
    private String mainActor;

    public CaptainAmerica(String mainActor, String name, String power, int age) {
        super(name, power, age);
        this.mainActor = mainActor;
    }

    public String getMainActor() {
        return mainActor;
    }

    @Override
    public void print() {
        super.print();

        System.out.println("mainActor" + "-" + getMainActor() + "\n" + "name " + "-" + getName() + "\n" + "power" + "-" + getPower() + "\n" + "age" + "-" + getAge());

    }

    private String getPower() {
        return null;
    }
}