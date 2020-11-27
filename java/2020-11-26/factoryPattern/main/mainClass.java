package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factorypattern.AnimalFactory;

public class mainClass {
	public static void main(String[] args) {
		/*
		 	Singleton Pattern
		 		중심이 되는 데이터 관리 형태(template(list, map))을 중심으로
		 		어느 클래스에서나 접근이 용이하게 하기 위한 패턴,
		 		instance(object)가 한개임을 의미.
		 		
		 	Factory(공장) Pattern
		 		원하는 형태(template)의 object 생성하기 위한 패턴
		 	
		 	interface 동물
		 	
		 	class	  고양이, 개, 소
		 	
		 	Animal animal1 = new Cat();
		 	Animal animal2 = new Dog();
		 	Animal animal3 = new Cow();
		 */
		
//		Animal ani1 = AnimalFactory.create("개");
//		Animal ani2 = AnimalFactory.create("고양이");
//		Animal ani3 = AnimalFactory.create("소");
//		
//		ani1.printDescript();
//		ani2.printDescript();
//		ani3.printDescript();
//		((Dog)ani1).dogMethod();
//		((Cat)ani2).catMethod();
//		((Cow)ani3).cowMethod();
		List<Animal> list = new ArrayList<Animal>();
		
		String arrStr[] = {"소", "고양이", "소", "개", "개", "개"};
		for (int i = 0; i < arrStr.length; i++) {
			Animal a = AnimalFactory.create(arrStr[i]);
			list.add(a);
		}
		
		for (int i = 0; i < list.size(); i++) {
			Animal an = list.get(i);
			an.printDescript();
			
			if(an instanceof Cat) {
				Cat c = (Cat)an;
				c.catMethod();
				System.out.println("----------------------------");
			}else if(an instanceof Dog) {
				Dog d = (Dog)an;
				d.dogMethod();
				System.out.println("----------------------------");
			}else if(an instanceof Cow) {
				Cow c = (Cow)an;
				c.cowMethod();
				System.out.println("----------------------------");
			}
		}
	}
}
