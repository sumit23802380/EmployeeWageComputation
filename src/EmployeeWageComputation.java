public class EmployeeWageComputation {
    public static void checkAttendance(){
        boolean presentStatus  = (Math.random() < 0.5) ? false : true;
        if(presentStatus){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}
