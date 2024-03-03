/*
 * 포트폴리오 1
 * 키, 몸무게 입력을 받으면 BMI 지수를 알려주고 비만 여부 알려주는 코드
 */
package java_portpolio1;
import java.util.Scanner;
public class BMI_calculator {
	public static void main(String[] args) {
		double height;
		double weight;
		double BMI;
		String state1="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요(cm): ");
		height = sc.nextDouble();
		System.out.println("몸무게를 입력해주세요(kg): ");
		weight = sc.nextDouble();
		
		BMI = (weight/Math.pow((height/100),2));
		
		if(BMI<18.5)
			state1="저체중";
		else if(BMI>=18.5 && BMI<23)
			state1="정상";
		else if(BMI>=23 && BMI<25)
			state1="과체중";
		else if(BMI>=25)
			state1="비만";
		
		System.out.printf("BMI: %.1f\n", BMI);
		System.out.println("체중상태: "+state1);
	}

}
