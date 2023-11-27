public class EmployeeWageComputation {
    private static final int WAGE_PER_HOUR = 20;
    /*
     *@desc : Checks the attendance of employee is present of absent
     *@params :
     *@return : boolean presentStatus
     */
    private static int checkAttendance(){
        int employeeAttendance  = (int)(Math.random() * 3)+1;
        if(employeeAttendance == 1){
            System.out.println("Employee is Absent");
        }
        else if(employeeAttendance == 2){
            System.out.println("Employee is Present and Full Time Employee");
        }
        else{
            System.out.println("Employee is Present and Part Time Employee");
        }
        return employeeAttendance;
    }
    /*
     *@desc : Calculated the daily wage of employee
     *@params : No of hours worked by employee , No of wage per hour
     *@return : int wage
     */
    private static int calculateDailyWage(int hoursWorked){
        return (hoursWorked*WAGE_PER_HOUR);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int hoursWorked;
        int employeeAttendance = checkAttendance();
        if(employeeAttendance==1){
            System.out.println("Daily Employee Wage is : 0");
        }
        else if(employeeAttendance==2){
            hoursWorked = 8;
            System.out.println("Daily Employee Wage of Full time Employee is : " + calculateDailyWage(hoursWorked));
        }
        else{
            hoursWorked = 4;
            System.out.println("Daily Employee Wage of Part time Employee is : " + calculateDailyWage(hoursWorked));
        }
    }
}
