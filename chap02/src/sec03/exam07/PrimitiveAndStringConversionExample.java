package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		String str1 = "10";
		int value1 = Integer.parseInt(str1); // 문자열을 정수 int 타입으로 변환
		double value2 = Double.parseDouble("3.14"); // 문자열을 실수 double 타입으로 변환
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		int value4 = 10;
		String str2 = String.valueOf(value4); // 정수형을 문자열 타입으로 변환
		String str3 = String.valueOf("3.14");
		String str4 = String.valueOf(true);
		
		System.out.println("value4: " + str2);
		System.out.println("value5: " + str3);
		System.out.println("value6: " + str4);
		
	}

}
