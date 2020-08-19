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
			System.out.println("Salesman �޿�= �⺻�� + �Ǹ� ����");
		}
		public void calcBonus() {
			System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");
		}
	
		}

	class Consultant extends Employee{
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
		}
		public void calcBonus() {
			System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");
		}
	}
	abstract class Manager extends Employee{
		int num_team;
		public void calcSalary() {
			System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
			
		}
	}
	class Director extends Manager{
		public void calcBonus() {
			System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
		}

	}
	public class HRSTest{
		public static void calTax(Employee e) {//������/332p/Employee�� �θ�ϱ� �پ��� ������ �޾Ƶ���
//			System.out.println("�ҵ漼�� ����մϴ�.");
			System.out.println("Saleman��:"+(e instanceof Salesman));
			if (e instanceof Salesman) {
				Salesman s=(Salesman)e;//�ڽ�/����ȯ/e=employee
				s.annual_sales=650000;
				System.out.println("Saleman �Դϴ�"+s.annual_sales);
//				System.out.println("Saleman�Դϴ�");
			}else if (e instanceof Manager) {
//				System.out.println("Saleman�Դϴ�");
				Manager m=(Manager)e;//�ڽ�/����ȯ
				m.num_team=5;
				System.out.println("Manager �Դϴ�"+m.num_team);
			}else if (e instanceof Consultant) {
//				System.out.println("Saleman�Դϴ�");
				Consultant c=(Consultant)e;//�ڽ�/����ȯ
				c.num_project=35;
				System.out.println("Consultant�Դϴ�"+c.num_project);
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
				System.out.println("����");
			}else {
				System.out.println("����");
			}
			calTax(s);
			calTax(c);
			calTax(d);
		}
	}