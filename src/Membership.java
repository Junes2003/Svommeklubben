import java.time.LocalDateTime;

public class Membership extends Member {
    private String membership;
    private double membershipPrice;

    public Membership(String name, String memberType, String swimmerType, int memberID, int ageGroup, int teamId, LocalDateTime dateOfBirth, String membership, double membershipPrice) {
        super(name, memberType, swimmerType, memberID, ageGroup, teamId, dateOfBirth);
        this.membership = membership;
        this.membershipPrice = membershipPrice;
    }

    public String getMembership(){
        return membership;
    }

    public double getMembershipPrice(){
        return membershipPrice;
    }

    public String toString(){
        return "membership: " + membership + "Price: " + membershipPrice;
    }

}
