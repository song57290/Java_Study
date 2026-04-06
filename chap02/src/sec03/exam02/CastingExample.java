package sec03.exam02;

public class CastingExample {
	public static void main(String[] args) {
		
		/* 강제 형변환
		작은 허용 범위 타입 =  (작은 허용 범위 타입) 큰 허용 범위 타입
		byte < short < int < long < float < double */
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println("charValue = " + charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println("intValue = " + intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println("intValue = " + intValue);
	}
}
