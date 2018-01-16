package edu.fju.exam;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employeea =new ArrayList<>();
		employeea.add(new Employee("Jack",25000));
		employeea.add(new Employee("Mary",28000));
		employeea.add(new Manager("Eddie",40000));
		employeea.add(new Director("Teddy",50000,3000));
		employeea.add(new Employee("Jack",31000));
		employeea.add(new Manager("Jack",47000));
		employeea.add(new Director("Jack",70000,9000));
		for(int i=0; i<employeea.size();i++){
			employeea.get(i).print();
		}
	}

}
