package com.bridgelabz.employeewagecomputation;

public class EmployeeWageComputation {
    private static final int EMPLOYEE_ABSENT = 0;
    private static final int FULL_TIME_EMPLOYEE = 1;
    private static final int PART_TIME_EMPLOYEE = 2;
    private static final int WAGE_PER_HOUR = 20;
    private static final int MAX_WORKING_HOURS = 100;
    private static final int MAX_WORKING_DAYS = 20;

    public EmployeeWageComputation(){

    }
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
    private static Pair calculateDailyWage(){
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
        return new Pair(hoursWorked,dailyWage);
    }
    private static Pair calculateDailyWage(int wagePerHour){
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
        int dailyWage = hoursWorked*wagePerHour;
        System.out.println("Daily Wage is " + dailyWage);
        return new Pair(hoursWorked,dailyWage);
    }
    /*
     *@desc : Calculated the monthly wage of employee
     *@params :
     *@return : int wage
     */
    private static void calculateMonthlyWage(){
        int monthlyWage = 0;
        for(int dayNumber = 1;dayNumber<=20;dayNumber++){
            monthlyWage += calculateDailyWage().second;
        }
        System.out.println("Monthly Wage for Employee is :" + monthlyWage);
    }
    /*
     *@desc : Calculated the wages till max working hours and days of employee
     *@params :
     *@return :
     */
    public static void calculateTillMaxWorkingHoursAndDays(){
        int totalDays = 0;
        int totalHours = 0;
        int totalWageTillMaxWorkingHoursAndDays = 0;
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS){
            Pair p = calculateDailyWage();
            totalHours += p.first;
            totalDays++;
            totalWageTillMaxWorkingHoursAndDays += p.second;
        }
        System.out.println("Total working hours : " + totalHours);
        System.out.println("Total working days : " + totalDays);
        System.out.println("Total Wage till max working hours and days is : " + totalWageTillMaxWorkingHoursAndDays);
    }
    public static void calculateMonthlyWageForCompany(int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int monthlyWage = 0;
        int totalHours = 0;
        for (int dayNumber = 1;  dayNumber<= maxWorkingDays; dayNumber++) {
            Pair dailyWage = calculateDailyWage(wagePerHour);
            if(totalHours + dailyWage.first < maxWorkingHours){
                monthlyWage += dailyWage.second;
                totalHours += dailyWage.first;
            }
        }
        System.out.println("Monthly Wage for Employee is :" + monthlyWage);
    }
    public static void calculateTillMaxWorkingHoursAndDaysForCompany(int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        int totalDays = 0;
        int totalHours = 0;
        int totalWageTillMaxWorkingHoursAndDays = 0;
        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            Pair p = calculateDailyWage(wagePerHour);
            totalHours += p.first;
            totalDays++;
            totalWageTillMaxWorkingHoursAndDays += p.second;
        }
        System.out.println("Total working hours : " + totalHours);
        System.out.println("Total working days : " + totalDays);
        System.out.println("Total Wage till max working hours and days is : " + totalWageTillMaxWorkingHoursAndDays);
    }
}