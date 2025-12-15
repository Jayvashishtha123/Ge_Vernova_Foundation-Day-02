package Employee_wage;
import java.util.Random;
public class UC_01 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Generate random value: 0 or 1
        int attendance = rand.nextInt(2);
        if(attendance==0){
            System.out.println("Emloyee is Absent");
        }else {
            System.out.println("Emloyee is Present");
        }
    }
}
