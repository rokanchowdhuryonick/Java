
import java.util.Scanner;
public class Ex2{
	
	public static void func1(Scanner sc) {
		System.out.print("Enter the Length : ");
		double l=sc.nextDouble();
		System.out.print("Enter the Width : ");
		double w=sc.nextDouble();
		double area = l*w;
		double peri = 2*(l+w);
		System.out.println("Area : "+area+"\tPerimeter : "+peri);
	}
	
	public static void func2(Scanner sc) {
		System.out.print("Enter the money amount : ");
		double m=sc.nextDouble();
		double vat = (m*15)/100;
		System.out.println("15% Vat is :"+vat);
	}
	
	public static void func3(Scanner sc) {
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}	
	}
	public static void func4(Scanner sc) {
		System.out.print("Enter the first number:");
        int x = sc.nextInt();
        System.out.print("Enter the second number:");
        int y = sc.nextInt();
        System.out.print("Enter the third number:");
        int z = sc.nextInt();
        int large;
        if(x > y && x > z)
        {
            large = x;
        }
        else if(y > z)
        {
            large = y;
        }
        else
        {
            large = z;
        }
        System.out.println("Largest number is: "+large);
			
	}
	public static void func5(Scanner sc) {
		System.out.println("Odd numbers from 10 to 100 : ");
		int n=100, i;
		System.out.print("[ ");
		for(i=10;i<=n; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("]");
			
	}
	public static void func6(Scanner sc, int[] arr) {
	    int n=arr.length, flag=0, i, x=0;
	    
		System.out.print("Enter the element you want to find:");
        x = sc.nextInt();
        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Value found at position:"+(i + 1));
        }
        else
        {
            System.out.println("This value not found!");
        }
			
	}
	public static void func7(Scanner sc) {
		System.out.print("Enter the row number : ");
		int n=sc.nextInt();
		int i, j;
		for(i=1;i<=n;i++){
		   for(j=1;j<=i;j++){
    		   System.out.print("*"); 
    		}
    		System.out.println();
		}	
	}
	public static void func8(Scanner sc) {
		System.out.print("Enter the row number : ");
		int n=sc.nextInt();
		int i, j;
		for( i = n; i >= 1; i--) {
            for( j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }	
	}
	public static void func9(Scanner sc) {
		System.out.print("Enter the rows: ");
		int n=sc.nextInt();
		int i, j;
		char alphabet = 'A';
		for( i = 1; i <= n; i++) {
            for( j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }	
	}
	public static void func10(Scanner sc) {
	    char[][] arr = { { '1', '2', '3', 'A' }, { '1', '2', 'B', 'C' }, { '1', 'D', 'E', 'F' } };
		int n=arr.length;
		int i, j;
		for( i = 0; i < n; i++) {
            for( j = 0; j < n-i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("----------------------------");
        
        for( i = 0; i < n; i++) {
            for( j = n-i; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	
	
	public static void main(String[] args) {
	    int[] arr1 = { 10, 9, 7, 1, 2, 3, 15, 33, 50,11 };
		Scanner sc = new Scanner(System.in);
// 		func6(sc, arr1);
        func10(sc);
		sc.close();
	}

}
