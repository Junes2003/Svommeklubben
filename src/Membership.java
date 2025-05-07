import java.time.LocalDateTime;

public class Membership extends Member {
    private String membership;
    private double membershipPrice;


    public Membership(String name, String memberType, String swimmerType, int memberID, int ageGroup, int teamID, LocalDateTime dateOfBirth, String membership, double membershipPrice, int parentsNumber, String parentsName) {
        super(name, memberType, swimmerType, memberID, ageGroup, teamID, dateOfBirth, parentsNumber, parentsName);
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
