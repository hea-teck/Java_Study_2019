package org.opentutorials.javatutorials.datatype;

public class DatatypeConversionDemo {

	// 자동(암시적) 형 변환 (Implicit Conversion)
	// 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용.
	// byte -> short, char -> int -> long -> float -> double
	// -------------정수--------------------> ------실수-------
	// 실수를 정수로 형변환 하지 않는다!!
	
	//------------------------------------------------------------//
	
    // float형을 double형으로 형 변환을 해도 데이터 손실이 전혀 없다.
	// 용량이 작은 것에서 큰것으로 변환하기 떄문. 반대 경우는 손실 발생.
	// float형의 데이터를 double형의 변수에 넣는다? -> 자동 형 변환 발생. float < double
	double a = 3.0F; 
	
	//------------------------------------------------------------//
	
	// double형을 데이터를 float형의 변수에 넣는다? -> 자동 형 변환 발생하지 않음.
	//float b = 3.0;
	
	//------------------------------------------------------------//
	
	int c = 3;
	float d = 1.0F;
	
	// int + float => float + float = float
	// 3.0F + 1.0F = 4.0F => float형이 double형으로 자동 형 변환.
	// 최종적으로 4.0 double형 데이터 타입.
	
	double e = c + d; 
	
	//------------------------------------------------------------//

	// 수동(명시적) 형 변환 (Explicit Conversion)
	
	// double형에서 float형으로 명시적 형 변환 발생.
	float f = (float)100.0; 
	
	// float형에서 int형으로 명시적 형 변환 발생.
	int b = (int)100.0F; // 100.0 -> 100 , 100.1 -> 100 (데이터 손실 발생)

	
}
