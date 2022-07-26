package data;

import java.text.SimpleDateFormat;
import java.util.Date;
import util.MyToyDate;
import util.MyToys;

public class Fresher extends Candidate {

    //graduated time (Graduation_date), Rank of Graduation (Graduation_rank)
    //and university where student graduated (Education)
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
    private Date graduation_Date;
    private String graduation_Rank, education;

    public Fresher() {
    }

    public Fresher(Date graduation_Date, String graduation_Rank, String education, String candidateID, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidateType) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + date.format(graduation_Date) + " | " + graduation_Rank + " | " + education;
    }

    @Override
    public void input(int type) {
        super.input(1);
        System.out.println("FORMAT: dd-MM-yy");
        graduation_Date = MyToyDate.getDate("Input Graduationn Date: ", "Must in format please!!");
        while (true) {
            graduation_Rank = MyToys.getString("Input Graduation Rank: ", "Excellence\\Good\\Fair\\Poor");
            if (graduation_Rank.equalsIgnoreCase("Excellence") || graduation_Rank.equalsIgnoreCase("Good")
                    || graduation_Rank.equalsIgnoreCase("Fair") || graduation_Rank.equalsIgnoreCase("Poor")) {
                break;
            }
        }
        graduation_Rank = MyToys.toUpperFirstLetter(graduation_Rank);

        education = MyToys.getString("Input university where student graduated: ", "EMPTY!!");

    }

}
