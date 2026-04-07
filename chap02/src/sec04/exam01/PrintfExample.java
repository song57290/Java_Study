package sec04.exam01;

public class PrintfExample {
	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
//		System.out.printf("상품의 가격: %-06d원\n", value); 이건 오류 발생
		
		System.out.println("======================");
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 전체 10자리 중 소숫점은 2자리에서 반올림
		
		System.out.println("======================");
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s \n", 1, name, job );
		
	}
}
