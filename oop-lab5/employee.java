import java.util.Scanner;
class employee {
	String Employee_id = new String();
	float[] salary = new float[3];
	// salary[0] = Basic;
	// salary[1] = HRA;
	// salary[2] = TA;
	float total=0, Bonus_total=0;

	float Calc_total(float[] sal){
		return sal[0] + sal[1] + sal[2];
	}

	float Calc_bonus(float tot_sal){
		tot_sal += (float)(0.1*tot_sal);
		return tot_sal;
	}

	static void display(employee emp){
		System.out.println(emp.Employee_id + " has salary " + emp.Bonus_total);
	};

	public static void main(String[] args){

		int num_of_emps;

		System.out.println("Enter number of employees");

		Scanner scan = new Scanner(System.in);
		num_of_emps = scan.nextInt();

		employee[] emps = new employee[num_of_emps];
		System.out.println(emps);
		for(int i =0; i<emps.length; i++){

			emps[i] = new employee();

			System.out.println("Enter id of employee");
			emps[i].Employee_id = scan.next();

			System.out.println("Enter the basic income of " + (i) + "Employee");
			emps[i].salary[0] = scan.nextFloat();
			
			System.out.println("Enter the HRA of " + (i) + "Employee");
			emps[i].salary[1] = scan.nextFloat();
			
			System.out.println("Enter the TA of " + (i) + "Employee");
			emps[i].salary[2] = scan.nextFloat();
			
			emps[i].total = emps[i].Calc_total(emps[i].salary);
			emps[i].Bonus_total = emps[i].Calc_bonus(emps[i].total);
			display(emps[i]);

		}
	}
}
