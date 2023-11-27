import javax.sound.midi.Soundbank;

public class EmployeeWageComputation {
    private static final int EMPLOYEE_ABSENT = 0;
    private static final int FULL_TIME_EMPLOYEE = 1;
    private static final int PART_TIME_EMPLOYEE = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_WORKING_HOURS = 100;
    /*
     *@desc : Checks the attendance of employee is full time , part-time or absent
     *@params :
     *@return : int status
     */
    private static int checkAttendance(){
        return (int)(Math.random() * 3);
    }
    /*
     *@desc : Calculated the daily wage of employee
     *@params :
     *@return : int wage
     */
    private static int calculateDailyWage(){
        int particularDayAttendance = checkAttendance();
        int hoursWorked = 0;
        switch (particularDayAttendance){
            case EMPLOYEE_ABSENT :
                break;
            case FULL_TIME_EMPLOYEE:
                hoursWorked = 8;
                break;
            case PART_TIME_EMPLOYEE:
                hoursWorked = 4;
                break;
            default:
                System.out.println("No Category Defined");
        }
        int dailyWage = hoursWorked*WAGE_PER_HOUR;
        System.out.println("Daily Wage is " + dailyWage);
        return dailyWage;
    }
    /*
     *@desc : Calculated the monthly wage of employee
     *@params :
     *@return : int wage
     */
    private static void calculateMonthlyWage(){
        int monthlyWage = 0;
        for(int dayNumber = 1;dayNumber<=20;dayNumber++){
            monthlyWage += calculateDailyWage();
        }
        System.out.println("Monthly Wage for Employee is :" + monthlyWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculateMonthlyWage();
    }
}