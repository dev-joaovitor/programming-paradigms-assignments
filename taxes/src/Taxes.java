import java.util.Scanner;

class Taxes {
	private double annualSalaryIncome;
	private double annualServiceProvisioningIncome;
	private double annualCapitalGain;
	private double medicalSpending;
	private double educationalSpending;
	private static double SERVICE_PROVISIONING_TAX_RATE = (double) 15/100;
	private static double CAPITAL_GAIN_TAX_RATE = (double) 20/100;
	private static double MAX_DEDUCTIBLE_RATE = (double) 30/100;

	public void setAnnualSalaryIncome(double income) {
		this.annualSalaryIncome = income;
	}
	
	public void setAnnualServiceProvisioningIncome(double income) {
		this.annualServiceProvisioningIncome = income;
	}
	
	public void setAnnualCapitalGain(double income) {
		this.annualCapitalGain = income;
	}
	
	public void setMedicalSpending (double amount) {
		this.medicalSpending = amount;
	}
	
	public void setEducationalSpending (double amount) {
		this.educationalSpending = amount;
	}
	
	public void printReport() {
		System.out.println();
		System.out.println("-----------------------------");
		
		double monthlySalaryIncome = annualSalaryIncome / 12;
		double salaryTax = 0;
		
		if (monthlySalaryIncome >= 3000 && monthlySalaryIncome < 5000) {
			salaryTax = (double) 10/100;
		} else if (monthlySalaryIncome >= 5000) {
			salaryTax = (double) 20/100;
		} else {			
			salaryTax = 0;
		}
		
		System.out.println("### INCOME TAX REPORT ###");
		System.out.println();
		System.out.println("* INCOME ESTABLISHED");
		
		double salaryIncomeTax = annualSalaryIncome * salaryTax;
		System.out.println("Salary income tax: " + salaryIncomeTax);
		
		double serviceProvisioningIncomeTax =
			annualServiceProvisioningIncome * SERVICE_PROVISIONING_TAX_RATE;
		System.out.println(
			"Service provisioning income tax: "
			+ serviceProvisioningIncomeTax
		);
		
		double capitalGainTax = annualCapitalGain * CAPITAL_GAIN_TAX_RATE;
		System.out.println("Capital gain tax: " + capitalGainTax);
		System.out.println();
		System.out.println("* DEDUCTIONS");
		double dueTaxes = salaryIncomeTax + serviceProvisioningIncomeTax + capitalGainTax;
		System.out.println("Due taxes: " + dueTaxes);
		System.out.println("MAX_DEDUCTIBLE_RATE: " + MAX_DEDUCTIBLE_RATE);
		System.out.println("maxDeductible: " + (dueTaxes * MAX_DEDUCTIBLE_RATE));
		double maxDeductible = dueTaxes * MAX_DEDUCTIBLE_RATE;
		System.out.println("Maximum deductible: " + maxDeductible);
		
		double deductibleExpenses = educationalSpending + medicalSpending;
		double deduction = 0;
		
		if (deductibleExpenses > maxDeductible) {
			deduction = maxDeductible;
		} else {
			deduction = deductibleExpenses;
		}
	
		System.out.println("Deductible expenses: " + deductibleExpenses);
		System.out.println();
		System.out.println("* SUMMARY");
		System.out.println("Gross taxes: " + dueTaxes);
		System.out.println("Deduction: " + deduction);
		dueTaxes -= deduction;
		
		System.out.println("Due taxes: " + dueTaxes);
		System.out.println("-----------------------------");
	}

	public static void main(String args[]) {
		Taxes t = new Taxes();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your annual salary income: ");
		t.setAnnualSalaryIncome(sc.nextDouble());
		
		System.out.println("Enter your annual service provisioning income: ");
		t.setAnnualServiceProvisioningIncome(sc.nextDouble());
		
		System.out.println("Enter your annual capital gain: ");
		t.setAnnualCapitalGain(sc.nextDouble());
		
		System.out.println("Enter your medical spending: ");
		t.setMedicalSpending(sc.nextDouble());
		
		System.out.println("Enter your education spending: ");
		t.setEducationalSpending(sc.nextDouble());
		
		t.printReport();
	}
}