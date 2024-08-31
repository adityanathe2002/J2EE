package com.qsp.view;

import java.util.List;
import java.util.Scanner;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Employee e=new Employee();
//		e.setId(5);
//		e.setName("Pinku");
//		e.setContact(987654l);
//		e.setSal(10000);
//		e.setJob("Tester");
//		EmployeeController.insert(e);
//		System.out.println("inserted");

//		Employee e=EmployeeController.fetchById(1);
//		System.err.println("Employee Name: "+e.getName());

//		boolean b=EmployeeController.updateById(102, "1000000");
//		System.out.println(b);
//		
//		boolean b=EmployeeController.deleteById(102);
//		System.out.println(b);
//
//		List<Employee> li = EmployeeController.fetchByAll();
//		for (Employee e : li) {
//			System.err.println(e);
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("~~~ Welcome ~~~");
		do {
			System.out.println("1. Insert Employee");
			System.out.println("2. Update Employee Name by Id");
			System.out.println("3. Fetch Employee by Id");
			System.out.println("4. Delete Employee b Id ");
			System.out.println("5. FEtch all employee");
			System.out.println("6 .Update Employee Salary by Id");
			System.out.println("Enter Option: ");

			switch (sc.nextInt()) {
			case 1: {
				Employee e = new Employee();
				System.out.println("Enter Id: ");
				e.setId(sc.nextInt());
				System.out.println("Enter Name: ");
				e.setName(sc.next());
				System.out.println("Enter Contact: ");
				e.setContact(sc.nextLong());
				System.out.println("Enter Salary: ");
				e.setSal(sc.nextDouble());
				System.out.println("Enter Job: ");
				e.setJob(sc.next());
				EmployeeController.insert(e);
				System.out.println("inserted......");
			}
				break;
			case 2: {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				System.out.println("Enter New Name: ");
				String newName = sc.next();
				boolean b = EmployeeController.updateById(id, newName);
				if (b) {
					System.out.println("Updated----");
				} else {
					System.out.println("id is not present");
				}
			}
				break;
			case 3: {
				System.out.println("Enter Id: ");
				Employee e = EmployeeController.fetchById(sc.nextInt());
				System.out.println(e);
			}
				break;
			case 4: {
				System.out.println("Enter id: ");
				boolean b = EmployeeController.deleteById(sc.nextInt());
				if (b) {
					System.out.println("deleted.....");
				} else {
					System.out.println("is not in present");
				}
			}
				break;
			case 5: {
				List<Employee> li = EmployeeController.fetchByAll();
				for (Employee e : li) {
					System.out.println(e);
				}
			}
				break;
			case 6: {
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				System.out.println("Enter New Sal: ");
				String newSal = sc.next();
				boolean b = EmployeeController.updateById(id, newSal);
				if (b) {
					System.out.println("Updated----");
				} else {
					System.out.println("id is not present");
				}
			}
				break;
			default:
				System.out.println("Wrong Info");
			}
			System.out.println("Enter Y to Continue");
		} while ("Y".equalsIgnoreCase(sc.next()));
	}
}
