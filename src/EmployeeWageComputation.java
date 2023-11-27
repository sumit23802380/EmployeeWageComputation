public class EmployeeWageComputation {
    /*
        *@desc : Checks the attendance of employee is present of absent
        *@params :
        *@return : boolean presentStatus
     */
    public static boolean checkAttendance(){
        boolean presentStatus  = (Math.random() < 0.5) ? false : true;
        if(presentStatus){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
        return presentStatus;
    }
    /*
     *@desc : Calculated the daily wage of employee
     *@params : No of hours worked by employee , No of wage per hour
     *@return : int wage
     */
    public static int calculateDailyWage(int hoursWorked , int wagePerHour){
        return (hoursWorked*wagePerHour);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        if(checkAttendance()){
            int wagePerHour = 20;
            int hoursWorked = 8;
            System.out.println("Daily Employee Wage is : " + calculateDailyWage(hoursWorked , wagePerHour));
        }
        else{
            System.out.println("Daily Employee Wage is : 0");
        }
    }
}
