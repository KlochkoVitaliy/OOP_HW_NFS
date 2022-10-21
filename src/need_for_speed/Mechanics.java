package need_for_speed;

import java.util.Objects;

public class Mechanics<T extends Transport> {

    private final String firstName;
    private final String secondName;
    private final String company;

    public Mechanics(String firstName, String secondName, String company) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(T transport) {
        return transport.checkDiagnostic();
    }

    public void repairCar(T transport) {
        transport.repairCar();
    }

    @Override
    public String toString() {
        return firstName + " "+ secondName + " из кампании - " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics<?> mechanics = (Mechanics<?>) o;
        return Objects.equals(firstName, mechanics.firstName) && Objects.equals(secondName, mechanics.secondName) && Objects.equals(company, mechanics.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, company);
    }
}
