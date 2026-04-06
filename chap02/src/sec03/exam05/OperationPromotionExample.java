package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; 이렇게 하면 정수 연산이 되어 에러 발생
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intValue2);
		System.out.println("출력문자: " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수형이기에 2.5가 아닌 2만 저장됨
		System.out.println(intValue4);
		double doubleValue = intValue3 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double doubleValue2 = (double)x / y;
		/* = x / (double)y;
		 * = (double)x / (double) y;
		 */
		System.out.println(doubleValue2);
	}

}
