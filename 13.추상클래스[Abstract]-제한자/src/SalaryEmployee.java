public class SalaryEmployee extends Employee {
	private int annualsalary;//사원연봉
	
	
	public SalaryEmployee() {
		
	}
	
	public SalaryEmployee(int no, String name,int annualsalary) {
		super(no,name);
		this.annualsalary = annualsalary;
	}
	
	public void print() {
		super.print();
		System.out.println(annualsalary);
	}
	@Override
	public void calculatePay() {
		int tempPay = this.annualsalary/12;
		this.setPay(tempPay);
		
	}

	public int getAnnualsalary() {
		return annualsalary;
	}

	public void setAnnualsalary(int annualsalary) {
		this.annualsalary = annualsalary;
	}

}
