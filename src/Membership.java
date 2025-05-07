import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Membership extends Member {
    private String membership;
    private double membershipPrice;

    public Membership(int memberID, String name, LocalDateTime birthDate, String memberType, String swimmerType,
                      int ageGroup, String parentsNumber, String parentsName, String membership, double membershipPrice) {
        super(memberID, name, String.valueOf(birthDate), memberType, swimmerType, ageGroup, parentsNumber, parentsName);

        // Initialisering af medlems-relaterede felter
        this.membership = membership;
        this.membershipPrice = membershipPrice;
    }

    public String getMembership() {
        return membership;
    }

    public double getMembershipPrice() {
        return membershipPrice;
    }

    // ToString metode til at udskrive Membership information
    @Override
    public String toString() {
        return super.toString() + ", Membership{" +
                "membership='" + membership + '\'' +
                ", membershipPrice=" + membershipPrice +
                '}';
    }
}
