package EmpWageBuilder;

public class UC1 {
    static void CheckAttendence(){

            int IS_FULL_TIME = 1;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == IS_FULL_TIME){
                System.out.println("Employee is Present");
            }
            else{
                System.out.println("Employee is Absent");
            }
    }
    static void DailyWage(){

            int IS_FULL_TIME = 1;
            int EMP_RATE_PER_HOUR = 20;

            int empHours = 0;
            int empWage  = 0;

            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == IS_FULL_TIME){
                empHours = 8;
            }
            else {
                empHours = 0;
            }
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.println("EmpWage: " + empWage);
    }

    public static void main(String[] args) {
        UC1.CheckAttendence();
        UC1.DailyWage();
    }
}
