package CH01;

import java.util.Scanner;

public class C_원민코드 {

	
		

		   public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        int size;
		        int n;

		        do {
		            System.out.print("크기 ? ");
		            size = sc.nextInt();
		        } while (size < 1 || size > 50 || size % 2 == 0);

		        n = size / 2;
		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < (size - n); j++) {
		                System.out.print((j >= n) ? "*" : " ");
		            }
		            n = i < (size / 2) ? n - 1 : n + 1;
		            System.out.println();
		        }

		        sc.close();

		    }
		
	}


