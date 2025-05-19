package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Membership extends Member {
    private String membershipType;
    private double membershipPrice;
    private boolean hasPaid;

    public Membership(String name, Discipline discipline, Status status, boolean isCompetitive, int memberID, int age, int teamID,
                      LocalDate dateOfBirth, String parentsNumber, String parentsName, String membershipType, double membershipPrice) {
        super(name, discipline, status, isCompetitive, memberID, age, teamID, dateOfBirth, parentsNumber, parentsName);
        this.membershipType = membershipType;
        this.membershipPrice = membershipPrice;
        this.hasPaid = hasPaid();
    }

    public String getMembershipType() { return membershipType; }
    public double getMembershipPrice() { return membershipPrice; }
    public boolean hasPaid() { return hasPaid; }
    public void setHasPaid(boolean hasPaid) { this.hasPaid = hasPaid; }

    public List<Membership> membersWithOutstandingPayment(List<Membership> memberships) {
        List<Membership> outstanding = new ArrayList<>();
        for (Membership member : memberships) {
            if (!member.hasPaid()) {
                outstanding.add(member);
            }
        }
        return outstanding;
    }

    public double calculateTotalMembershipFees(List<Membership> memberships) {
        double total = 0.0;
        for (Membership member : memberships) {
            total += member.getMembershipPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Membership: " + membershipType + ", Price: " + membershipPrice + ", Paid: " + (hasPaid ? "Yes" : "No");
    }
}