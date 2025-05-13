import java.time.LocalDate;

public class Membership extends Member {
    private String membership;
    private double membershipPrice;


    public Membership(String name, String memberType, String swimmerType, int memberID, int age, int teamID, LocalDate dateOfBirth, String membership, double membershipPrice, String parentsNumber, String parentsName) {
        super(name, memberType, swimmerType, memberID, age, teamID, dateOfBirth, parentsNumber, parentsName);
        this.membership = membership;
        this.membershipPrice = membershipPrice;
    }

    public String getMembership(){
        return membership;
    }

    public double getMembershipPrice(){
        return membershipPrice;
    }

    public void membersWithOutstandingPayment() {

    }

    public String toString(){
        return "membership: " + membership + "Price: " + membershipPrice;
    }

}
