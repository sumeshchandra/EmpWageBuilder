	public class EmpWage {

		static final int IS_FULL_TIME = 1;
		static final int IS_PART_TIME = 2;
		
	    private final String company;
	    private final int empRatePerHour;
	    private final int maxHoursPerMonth;
	    private final int numOfWorkingDays;


	    public EmpWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays)
	    {

	        this.company = company;
	        this.empRatePerHour = empRatePerHour;
	        this.maxHoursPerMonth = maxHoursPerMonth;
	        this.numOfWorkingDays = numOfWorkingDays;
	    }

	    private int computeEmpWage()

	    {
	        int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;


	        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
	        {
	            totalWorkingDays++;
	            int attendance=(int)(Math.random()*3);
	            switch(attendance)
	            {
	                case IS_FULL_TIME:empHrs=8;
	                    break;
	                case IS_PART_TIME:empHrs=8;
	                    break;
	                default:empHrs=0;
	                    break;
	            }
	            totalEmpHrs=(totalEmpHrs+empHrs);
	            System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
	        }


	        return totalEmpHrs*empRatePerHour;

	    }

	    public static void main(String[] args)
	    {
	        System.out.println("Welcome to the Employee Wage Computation program");
	        //created object for company dmart
	        EmpWage  dmart=new EmpWage("Dmart",20,20,10);
	        System.out.println("Total Employee Wage for Company "+ dmart.company+" is: "+dmart.computeEmpWage());
	        //created object for company realince
	        EmpWage  reliance=new EmpWage("Reliance",10,2,20);
	        System.out.println("Total Employee Wage for Company "+ reliance.company+" is: "+reliance.computeEmpWage());
	    }
}
