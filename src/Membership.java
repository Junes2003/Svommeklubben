import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Membership extends Member {
    private String membership;
    private int membershipPrice;

    public Membership(int memberID, String name, LocalDate dateOfBirth, String memberType, String swimmerType, int age, int teamID, String parentsNumber, String parentsName, String membership, int membershipPrice) {
        super(memberID, name, dateOfBirth, memberType, swimmerType, age, teamID, parentsNumber, parentsName);
        // Initialisering af medlems-relaterede felter
        this.membership = membership;
        this.membershipPrice = membershipPrice;
    }

    public String getMembership() {
        return membership;
    }

    public int getMembershipPrice() {
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
