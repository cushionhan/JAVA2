package pk30.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee=new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim=new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong=new TravelCustomer("홍길신", 13, 50);

		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//Stream<TravelCustomer> stream=customerList.stream();
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		//stream.forEach(n->System.out.println(n+" "));
		
		System.out.println("== 총 여행 비용 출력 ==");
		int totalPrice=customerList.stream().mapToInt(n->n.getPrice()).sum(); //sum을 하려면 'mapToInt'를 해줘야함
		System.out.println(totalPrice);
		
		System.out.println("== 20세 이상 고객 출력 ==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));	
		
	}

}
