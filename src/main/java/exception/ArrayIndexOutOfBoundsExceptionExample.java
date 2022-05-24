package exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
//		String data3 = args[0];	// 실행 매개값을 주지 않아서 발생
//		String data4 = args[1];
//		
//		System.out.println("args[0]:" + data3);
//		System.out.println("args[1]:" + data4);
		
		if(args.length == 2) {
			String data1 = args[0];	
			String data2 = args[1];
			
			System.out.println("args[0]:" + data1);
			System.out.println("args[1]:" + data2);
			
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}

	}

}
