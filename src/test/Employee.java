package test;



public class Employee {
	

		void work() {

		System.out.println("Employee is working");

		}
		}

		class Manager extends Employee {

		@Override

		void work() {

		System.out.println("Manager is managing the team");

		}


		public static void main(String[] args) {


		Employee emp = new Employee();

		emp.work();

		Manager mgr = new Manager();

		mgr.work();

		}

		}

	
