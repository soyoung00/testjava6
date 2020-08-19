package com.tech2.poly;//328p

abstract class Employee {
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}
	class Salesman extends Employee{
		int annual_sales;
		public void calcSalary() {
			System.out.println("Salesman 급여= 기본급 + 판매 수당");
		}
		public void calcBonus() {
			System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
		}
	
		}

	class Consultant extends Employee{
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		}
		public void calcBonus() {
			System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
		}
	}
	abstract class Manager extends Employee{
		int num_team;
		public void calcSalary() {
			System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
			
		}
	}
	class Director extends Manager{
		public void calcBonus() {
			System.out.println("Director 보너스 = 기본급 * 12 * 6");
		}

	}
	public class HRSTest{
		public static void calTax(Employee e) {//다형성/332p/Employee가 부모니까 다양한 형식을 받아들임
//			System.out.println("소득세를 계산합니다.");
			System.out.println("Saleman비교:"+(e instanceof Salesman));
			if (e instanceof Salesman) {
				Salesman s=(Salesman)e;//자식/형변환/e=employee
				s.annual_sales=650000;
				System.out.println("Saleman 입니다"+s.annual_sales);
//				System.out.println("Saleman입니다");
			}else if (e instanceof Manager) {
//				System.out.println("Saleman입니다");
				Manager m=(Manager)e;//자식/형변환
				m.num_team=5;
				System.out.println("Manager 입니다"+m.num_team);
			}else if (e instanceof Consultant) {
//				System.out.println("Saleman입니다");
				Consultant c=(Consultant)e;//자식/형변환
				c.num_project=35;
				System.out.println("Consultant입니다"+c.num_project);
				}
		}
		
		public static void main(String[] args) {
			Salesman s=new Salesman();
			Consultant c= new Consultant();
			Director d=new Director();
			
			Object arr[]=new Object[3];
			arr[0]=s;
			arr[1]=c;
			arr[2]=d;
			calTax(s);
			
//			for (Object object : arr) {
//				calTax(object);
//			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
//				calTax(arr[0]);
			}
			
//			s.calcBonus();
//			c.calcBonus();
//			d.calcBonus();
			System.out.println(s.toString());
			System.out.println(c.toString());
			System.out.println(d.toString());
			Salesman s2=s;
			if (s.equals(s2)) {//340p
				System.out.println("동일");
			}else {
				System.out.println("에해");
			}
			calTax(s);
			calTax(c);
			calTax(d);
		}
	}