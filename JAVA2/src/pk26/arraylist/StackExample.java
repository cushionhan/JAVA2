package pk26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();		
		//4¹ר ÀÌ»ף push
		if(coinBox.empty()) {
			for(int i=0;i<5;i++) {
				coinBox.push(new Coin(100*i));	
			}
		}
		
		while(!coinBox.isEmpty()) {
		Coin coin = coinBox.pop();
		System.out.println(coin.getValue());
		}
		
	}

}
