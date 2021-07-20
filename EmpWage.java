	public class EmpWage {

		static final int IS_FULL_TIME = 1;
		static final int IS_PART_TIME = 2;

		// instance constants
		final String COMPANY_NAME;
		final int WAGE_PER_HR;
		final int MAX_WORKING_DAYS;
		final int MAX_WORKING_HRS;
		// instance variable
		int totalWage;

		EmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
		{
			COMPANY_NAME = companyName;
			WAGE_PER_HR = wagePerHr;
			MAX_WORKING_DAYS = maxWorkingDays;
			MAX_WORKING_HRS = maxWorkingHrs;
			totalWage = 0;
		}

		int getEmpType()
		{
			return (int) (Math.random() * 100) % 3;
		}

		int getWorkingHrs(int empType)
		{
			switch (empType)
			{
				case IS_FULL_TIME:
					return 8;
				case IS_PART_TIME:
					return 4;
				default:
					return 0;
			}
		}

		void calculateTotalWage()
		{
			System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");
			System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
			int workingHrs;
			for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
					&& totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
			{
				int empType = getEmpType();
				workingHrs = getWorkingHrs(empType);
				int wage = workingHrs * WAGE_PER_HR;
				totalWage += wage;
				System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
			}

		}

		public String toString()
		{
			System.out.println("Details of " + COMPANY_NAME + " employee");
			System.err.println("Wage per hour:" + WAGE_PER_HR);
			System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
			System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
			return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
		}

		public static void main(String args[])
		{
			EmpWage dmart = new EmpWage("Dmart", 8, 20, 100);
			EmpWage reliance = new EmpWage("Reliance", 4, 30, 150);

			dmart.calculateTotalWage();
			System.out.println(dmart);

			reliance.calculateTotalWage();
			System.out.println(reliance);
		}
}
