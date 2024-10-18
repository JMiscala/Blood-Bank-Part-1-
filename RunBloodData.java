import java.util.*;

class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }

    public void display(){
    System.out.print(bloodType + rhFactor + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter blood type of patient: ");
            String bt = in.nextLine();

        System.out.print("Enter the Rhesus factor (+ or -): ");
            String rh = in.nextLine();

                if (bt.equals("") && rh.equals("")) {
                    BloodData bd = new BloodData();
                    bd.display();
                }

                else {
                    BloodData bd = new BloodData(bt, rh);
                    bd.display();
                }
    }
}
