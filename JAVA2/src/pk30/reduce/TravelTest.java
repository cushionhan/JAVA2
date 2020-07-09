package pk30.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee=new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim=new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong=new TravelCustomer("ȫ���", 13, 50);

		List<TravelCustomer> customerList=new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//Stream<TravelCustomer> stream=customerList.stream();
		
		System.out.println("== �� ��� �߰��� ������� ��� ==");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		//stream.forEach(n->System.out.println(n+" "));
		
		System.out.println("== �� ���� ��� ��� ==");
		int totalPrice=customerList.stream().mapToInt(n->n.getPrice()).sum(); //sum�� �Ϸ��� 'mapToInt'�� �������
		System.out.println(totalPrice);
		
		System.out.println("== 20�� �̻� �� ��� ==");
		customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));	
		
	}

}
