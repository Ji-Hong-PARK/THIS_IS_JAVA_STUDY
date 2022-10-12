package Ch07반복문;

import java.util.Scanner;

public class C00_별만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문의 규칙을 찾으라!!
		
		//문제!
		
		//1
		//*****
		//*****
		//*****
		//*****
		
	// 1번문제에 대해서   ***** 이 행마다 연속적으로 4번을 반복함
	// i	j
	// 0	0-4
	// 1	0-4
	// 2	0-4
	// 3	0-4
	//-----------------
	// i = 0 (i의 초기값은 0)								/	j = 0
	// i++	 (i는 4번 반복으로 초기값에서 증가를 한다)				/	j = ++
	// i < 4 (i는 총 4번의 출력을 하므로 4보다 < 작다고 표현한다.)	/	j < 5 (0,1,2,3,4 총 다섯번.) 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print(" \'*\' 만들기높이 : ");
//		int n = sc.nextInt();
//		int i = 0 ,j = 0;
//		
//		while (i < n) 
//		{
//			j=0;	
//			while (j <= n-1) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		

		
//		int i =0, j =0;
//		while (i<4)
//		{
//			System.out.println("*");
//			i++;
//		}
		
//		while(i<4)
//		{
//			j=0;
//			while (j<4)
//			{
//			 System.out.print("*");
//				j++;
//			}
//			System.out.println("^");
//			i++;
//		}
		
		
//		while(i<4)
//		{
//			System.out.println("^");
//			i++;
//		}
		
		
		
		
		//2
		//*
		//**
		//***
		//****
		//*****

		//2번 문제에대해서 별이 몇개인지 확인을 해라
		
		//	i					j
		//	0					0-0
		//	1					0-1
		//	2					0-2
		//	3					0-3
		//-----------------------------
		//	i=0					j=0
		//	i++					j++
		//	i < 4				j <= i (j는 i와 같은 반복된 숫자를 증가하니깐)
		
		// 코드 풀이
		
//		int i = 0;
//		int j = 0;
//		while (i<4) 
//		{
//			j = 0;
//			while(j<=i)
//			{	
//			System.out.print("*");
//			j++;
//			}
//			System.out.println();
//			i++;		
//		}
	
		
		
		//3
		//*****
		//****
		//***
		//**
		//*
		
		//3번문제의 규칙을 보자.
		
		//	i					j(공백횟수)
		//	0					0-3
		//	1					0-2
		//	2					0-1
		//	3					0-0
		//-----------------------------
		//	i=0					j=0
		//	i++					j++
		//	i < 4				j >= ?? (역 삼각형이 나올려면 어떻게 해야하나?) 최대값-i를 하면 역순이다.
		
		// 높이 입력받을때 
		//		i					j
		//		0					0-(n-1) - 0
		//		1					0-(n-1) - 1
		//		2					0-(n-1) - 2
		//		n-1					0-0		
		
		//		i=0					j=n
		//		i++					j++
		//		i < n(n-1)			j <= (n-1)-i
		
		//코드 풀이
		
//		int i = 0;
//		int j = 0;
//		
//		while (i<4)
//		{
//			j=3;	
//			while (j >= i) 
//			{
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
			//or
		
//		int i = 0;
//		int j = 0;
//		
//		while (i<4)
//		{
//			j=0;	
//			while (j <= 3-i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 높이 입력 받아서 적을때......
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while (i<n)
//		{
//			j=0;	
//			while (j <=(n-1)-i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}				
		
		
		
	

		
		
		
		
		
//		// 별첨!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		//----------높이 입력 받아서 적기
//		//		n번째의 정수를 받아서 높이를 찍는거
//		//	i				j
//		//	0				0-4
//		//	1				0-4
//		//	2				0-4
//		// 	3				0-4
//		//	4
//		//	.
//		//	.
//		//	n-1번째 높이
//		//------------------------
//		//	i = 0			j = 0
//		//	i++				j++
//		//	i < n			j < 5
//		// 정사각형 모양으로 만들려면  i<n, j<n으로 값이 똑같으면 정사각형이된다.
//		// 
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while (i<n)
//		{
//			j=0;	
//			while (j < n) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}		
		
		
		
		
		
		
		//문제 4번 높이를 입력받아서 적어라.
		
		//4
		// 		   *
		//		  ***
		//		 *****
		//		*******
		
		//----------높이 입력 받아서 적기
		//		n번째의 정수를 받아서 높이를 찍는거
		//	i				j
		
		//	0				0-0
		//	1				0-1
		//	2				0-2
		// 	3				0-3
		//	4
		//	.
		//	.
		//	n-1번째 높이
		//----------- 조건식 --------
		//	i = 0			j = 0
		//	i++				j++
		//	i < n			j < i
		// 정 사각형 모양으로 만들려면  i<n, j<n으로 값이 똑같으면 정사각형이된다.
		// 정 삼각형 모양으로 만들려면 어떻게 해야할까??
		// n = 4  i = 4
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while (i<n)
//		{
//			j=0;	
//			while (j <= i) 
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}				
		
		// 높이 4의 피라미드 별을 만들어라.
		
				
				// 		   *		0행
				//		  ***		1행
				//		 *****		2행
				//		*******		3행
		
		
				// i	행		j	공백 횟수				k	별 갯수
				
				// i = 0		j = 1 -2  3칸공백 		k = 1-1
				// i = 1		j = 2 -3  2칸공백		k = 2-3
				// i = 2		j = 3 -4  1칸공백		k = 3-5개의 별
				// i = 3		j = 4 -5  0칸공백		k = 4-7개의 별
				//------------------------------------------
				// i <= 4		j <= 2-i			k <= 2*i 	/	조건식!
				// i  = 0		j	=  0			k  =  0		/ 처음 초기화 식  
		
		
				// i <= 1		j <= 2-1			k <= 2*1
				// i <= 2		j <= 2-2			k <= 2*2
				// i <= 3		j <= 2-3			k <= 2*3
		
		
//		 		int i = 0, j = 0, k = 0; // i=행,j=공백,k=별
//		 
//		 		while(i<4)	//행을 4번 반복한다 0,1,2,3
//		 		{	
//					//공백은 항상 0으로 초기화
//					j=0;
//					while(j<=2-i)
//						{
//							System.out.print(" ");
//							j++;	// 공백 j역시 while문 돌때마다 증가를 시킨다.
//						}
//							//별 역시 초기화를 시켜서 0으로 적어준다,
//							k=0;
//							while(k<=2*i)
//						{
//							 System.out.print("*");
//							 k++;	// 별을 while문을 돌떄마다 증가시켜준다.
//						}
//					System.out.println();
//					i++;
//		 		}		
		
		
		
		
		
		
		// 동하가 만든 코드!!!!!!!
//		  int i = 0;
//        int j = 0;
//        int k = 0;
//	      
//	      while (i <= 4) {
//	         j = 0;
//	         k = 0;
//	         while(k <= 3-i ) {
//	            System.out.print(" ");
//	            k++;
//	         }
//	         
//	         while(j <= 2 * i + 1 ) {
//	            System.out.print("*");
//	            j++;
//	         }
//	         System.out.println();
//	         i++;
//	      }
		
		
		
		
		

		//5
		//	  	*******
		//	  	 *****
		//	   	  ***
		//	 	   *		
		
		
		
		
//		int i = 1;
//		while (i<=10)
//		{
//			int j = 1;
//			while(j<=10)
//			{
//				if(j==i || j==11-i)
//					System.out.print("*");
//				else
//					System.out.print(" ");	
//				j++;
//			}
//			
//			i++;
//			System.out.println();
//		}

	
   
		
		
		
		
		
	}

}
