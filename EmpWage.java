public class EmpWage {

	static final int IS_FULL_TIME =1;
	static final int IS_PART_TIME =2;
	static final int EMP_RATE_PER_HRS=20;
	public static void main(String[] args) {
	System.out.println("Hello guys, Welcome to wage computation ");
	int empHrs = 0;
	int empWage = 0;
	double empCheck = Math.floor(Math.random() * 10)% 2;
	switch (empCheck){
    		case IS_PART_TIME:
    		empHrs=8;
    		break;
    		case IS_FULL_TIME:
    		empHrs=8;
    		break;
    		default:
    		empHrs=0;
	    }
	empWage=empHrs * EMP_RATE_PER_HRS;
	System.out.println("Emp Wage: " + empWage );
	 }
}
