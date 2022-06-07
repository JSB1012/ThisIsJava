package generic;

public class BoundTypeParameterExampple {

	public static void main(String[] args) {
		//String str = Util3.compare("a","b"); (x) String은 Number 타입이 아님
		
		int result1 = Util3.compare(10, 20); //int -> Integer 자동 Boxing
		System.out.println(result1);
		
		int result2 = Util3.compare(4.5, 3); //double -> Double 자동 Boxing
		System.out.println(result1);
		
		//Util3의 Double.compare() 메소드는 첫 번째 매개값이 작으면 -1을, 같으면 0을, 크면 1을 리턴한다.
	}

}
