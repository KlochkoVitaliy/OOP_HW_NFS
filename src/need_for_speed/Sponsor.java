package need_for_speed;

public class Sponsor {
    private final String name;
    private final int sumSponsor;

    public Sponsor(String name, int sumSponsor) {
        this.name = name;
        this.sumSponsor = sumSponsor;
    }

    public String getName() {
        return name;
    }

    public int getSumSponsor() {
        return sumSponsor;
    }

    public void sponsorRace(){
        System.out.printf("Спонсор \"%s\"  проспонсировал заезд на %d%n", name, sumSponsor);
    }

    @Override
    public String toString() {
        return name + " ,спонсорская помощь: " + sumSponsor +" руб.";
    }
}
