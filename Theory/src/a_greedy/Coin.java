package a_greedy;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay = 1250;
		int[] coins = {500,100,50,10};
		
		System.out.println(solution(pay, coins));
	}
	
	public static int solution(int pay, int[] coins) {
		int result = 0;
		for (int i=0; i<coins.length; i++) {
			result += pay  / coins[i];
			pay %= coins[i];
		}	
		return result;
	}
}
