package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		long var3 = 20000000000L; /* 200억까지는 범위에 속하여 가능하지만 오류? -> int 타입이라 생각하기 때문
									그래서 대문자 L를 붙여서 long 타입인 것을 알려줌*/
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

	}

}
