package sort.unit_test;

public class CalculateSalary {
	public static void main(String[] args){
		CalculateSalary cc = new CalculateSalary();
		double[] salary = {1400,3800,4000,4200,3600,3400,1200,3600,3400,3925};
		cc.calculateSalary(salary);
	}
	
	public void calculateSalary(double[] salary){
		if(salary == null || salary.length <= 0 ){
			return ;
		}
		double afterTaxTotal = 0 ,totalTax=0;
		double[] afterTaxSalary = new double[salary.length]; 
		for(int i = 0 ; i < salary.length ; i++){
			if(salary[i] < 4000 && salary[i] >= 0){
				afterTaxSalary[i] = salary[i] - ( salary[i] - 800 ) * 0.2;
			}else if(salary[i] >= 4000){
				afterTaxSalary[i] = salary[i] - ( salary[i] * 0.16 );
			}
		}
		
		for(int i = 0 ; i < salary.length ; i++){
			System.out.println("mouth : "+(i+1)+" salary : "+salary[i]+" , "+"afterTaxSalary : "+afterTaxSalary[i]+" ,"+" tax :"+(salary[i]-afterTaxSalary[i]) );
			afterTaxTotal += afterTaxSalary[i];
			totalTax += ( salary[i] - afterTaxSalary[i]); 
		}
		System.out.println("total after tax salary : "+ afterTaxTotal+" ,"+"total tax:"+totalTax);
	}
}
