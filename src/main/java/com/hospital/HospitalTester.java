package com.hospital;

import java.awt.Choice;
import java.util.Scanner;

import com.hospital.dao.HospitalDAO;
import com.hospital.dao.HospitalDAOImpl;
import com.hospital.entity.HospitalEntity;

public class HospitalTester {

	public static void main(String[] args)
	{
		HospitalDAOImpl h = new HospitalDAOImpl();
		Scanner scan = new Scanner(System.in);
		
		
		
		do {
			System.out.println("1.Save");
			System.out.println("2.GetAll");
			System.out.println("3.UpdateByID");
			System.out.println("4.DeleteByID");
			System.out.println("Choose Which You want to Do: ");
			int n = scan.nextInt();
			if(n == 1) {
				System.out.println("Enter ID: ");
				int id = scan.nextInt();
				System.out.println("Enter Name: ");
				String name = scan.next();
				System.out.println("Enter age: ");
				int age = scan.nextInt();
				System.out.println("Enter disease Name: ");
				String disease = scan.next();
				System.out.println("Enter Bill: ");
				int bill = scan.nextInt();
				HospitalEntity entity = new HospitalEntity(id, name, age, disease, bill);
				h.save(entity);
				
			}
			else if(n == 2){
				h.getAll();
			}
			else if(n == 3) {
				System.out.println("Updating id:");
				int id1 = scan.nextInt();
				System.out.println("Enter details to UPDATE diseaseName or Bill or age or Name");
				String str = scan.next();
				if(str.equalsIgnoreCase("diseaseName")) {
					System.out.println("Enter disease Name: ");
					String desease = scan.next();
					h.updateByIDDiseaseName(id1,desease);
					h.getData(id1);
				}
				else if(str.equalsIgnoreCase("Bill")){
					System.out.println("Enter Bill:");
					int bill = scan.nextInt();
					h.updateByIDBill(id1, bill);
					h.getData(id1);
				}
				else if(str.equalsIgnoreCase("age")) {
					System.out.println("Enter Age: ");
					int age = scan.nextInt();
					h.updateByIDage(id1, age);
					h.getData(id1);
				}
				else if(str.equalsIgnoreCase("Name")) {
					System.out.println("Enter Patient Name: ");
					String name = scan.next();
					h.updateByIDName(id1, name);
					h.getData(id1);
				}
				else if(n == 4) {
					System.out.println("Enter ID: ");
					int id = scan.nextInt();
					h.deleteByID(id);
					System.out.println("Deleted SuccessFully...!!!");
				}
				else {
					System.out.println("Invalid Operation");
				}
			}
			else if(n == 4) {
				System.out.println("Deleting id:");
				int id2 = scan.nextInt();
				h.deleteByID(id2);
			}
			else {
				System.out.println("Enter Valid Operation Number: ");
			}
				System.out.println("You want to be Continue this Operations (Yes/No): ");
			
		}
		while(scan.next().equalsIgnoreCase("yes"));
		System.out.println("Exit CRUD Operations...!!!");

	}

}
