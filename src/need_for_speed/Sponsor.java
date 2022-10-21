package need_for_speed;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return sumSponsor == sponsor.sumSponsor && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sumSponsor);
    }
}
