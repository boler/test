import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] argvs) {
		// 1. a+b
		// while(sc.hasNext()){
		// 	int a = sc.nextInt();
		// 	int b = sc.nextInt();
		// 	System.out.println(a+b);
		// }

		//2. n a+b
		// int n = sc.nextInt();
		// while(n-->0){
		// 	int a = sc.nextInt();
		// 	int b = sc.nextInt();
		// 	System.out.println(a+b);
		// }

		//3. a+b 00
		// while(true){
		// 	int a = sc.nextInt();
		// 	int b = sc.nextInt();
		// 	if(a==0 && b==0)
		// 		break;
		// 	System.out.println(a+b);
		// }

		// for(int i,j;(i=sc.nextInt())!=0&&(j=sc.nextInt())!=0;System.out.println(i+j));

		//4 a+b
		// int n;
		// while( (n=sc.nextInt())!=0){
		// 	int sum=0;
		// 	while(n-->0)
		// 		sum += sc.nextInt();
		// 	System.out.println(sum);
		// }

		//5 n sum()
		// int n = sc.nextInt();
		// while(n-->0){
		// 	int m = sc.nextInt();
		// 	int sum=0;
		// 	while(m-->0)
		// 		sum += sc.nextInt();
		// 	System.out.println(sum);
		// }

		//6 n sum()
		// while(true){
		// 	int n = sc.nextInt();
		// 	int sum = 0;
		// 	while(n-->0)
		// 		sum += sc.nextInt();
		// 	System.out.println(sum);
		// }

		//7  homework

		//8  homework

		//9
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i+=2)
			System.out.print(s.charAt(i));

		//10
		int n;
		while((n=sc.nextInt())!=0){
			int cur=0;
			int time=0;
			while(n-->0){
				int next = sc.nextInt();
				if(next>cur)
					time += (next-cur)*6 + 5;
				else
					time += (cur-next)*4 +5;
				cur = next;
			}
			System.out.println(time);
		}
	}
}
