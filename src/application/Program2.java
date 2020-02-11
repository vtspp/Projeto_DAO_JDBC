package application;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("**** Test 1: Department insert ****");
		Department obj = new Department(null, "Smartphone");
		departmentDao.insert(obj);
		System.out.println(obj);
		
		System.out.println("\n**** Test 2: Department update ****");
		Department obj2 = new Department(12, "Automoveis");
		departmentDao.update(obj2);
		System.out.println(obj2);
		
		System.out.println("\n**** Test 3: Department Delete ****");
		System.out.print("Enter id for delete: ");
		Integer id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Id " + id + " deleted!");
		
		System.out.println("\n**** Test 4: Department findById ****");
		System.out.print("Enter id for find: ");
		id = sc.nextInt();
		Department department = departmentDao.findById(id);
		System.out.println(department);
		
		System.out.println("\n**** Test 5: Department findAll ****");
		List<Department> dep = departmentDao.findAll();
		
		for(Department d : dep) {
			System.out.println(d);
		}
		
      sc.close();
	}

}
