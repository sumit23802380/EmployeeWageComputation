public class EmployeeWageComputation {
    private static final int EMPLOYEE_ABSENT = 0;
    private static final int FULL_TIME_EMPLOYEE = 1;
    private static final int PART_TIME_EMPLOYEE = 2;
    private static final int WAGE_PER_HOUR = 20;
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
     *@params : No of hours worked by employee , No of wage per hour
     *@return : int wage
     */
    private static int calculateDailyWage(int hoursWorked){
        return (hoursWorked*WAGE_PER_HOUR);
    }

    private static void calculateMonthlyWage(){
        int monthlyWage = 0;
        for(int dayNumber = 1;dayNumber<=20;dayNumber++){
            int particularDayAttendance = checkAttendance();
            int hoursWorked;
            int dailyWage = 0;
            switch (particularDayAttendance){
                case EMPLOYEE_ABSENT :
                    System.out.println("Employee is Absent");
                    System.out.println("Daily Wage on day "+ dayNumber+ " is : 0");
                    break;
                case FULL_TIME_EMPLOYEE:
                    hoursWorked = 8;
                    System.out.println("Employee is Present and Full Time Employee");
                    dailyWage = calculateDailyWage(hoursWorked);
                    System.out.println("Daily Wage on day " + dayNumber +" is : " + dailyWage);
                    break;
                case PART_TIME_EMPLOYEE:
                    hoursWorked = 4;
                    System.out.println("Employee is Present and Part Time Employee");
                    dailyWage = calculateDailyWage(hoursWorked);
                    System.out.println("Daily Wage on day " + dayNumber +" is : " + dailyWage);
                default:
                    System.out.println("No Category Defined");
            }
            monthlyWage += dailyWage;
        }
        System.out.println("Monthly Wage for Employee is :" + monthlyWage);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculateMonthlyWage();
    }
}