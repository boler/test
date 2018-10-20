import java.util.Scanner;

class Solution2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 1
		// int year = sc.nextInt();
		// int month = sc.nextInt();
		// int day = sc.nextInt();

		// if(year<0 || month<=0 || day<=0 || month> 12)
		// 	System.out.print(0);

		// int[][] dray = {{0,31,28,31,30,31,30,31,31,30,31,30,31},
		// 				{0,31,29,31,30,31,30,31,31,30,31,30,31}};

		// int i = year%4==0&&year%100!=0 || year%400==0 ? 1 : 0;

		// if(day > dray[i][month] )
		// 	System.out.print(0);
		// System.out.print(1);
		
		// 2
		
		// String equation = sc.nextLine();
		// int a = 0, b = 0, c = 0;

		// boolean is_nagative = equation.charAt(0) == '-' ? true: false;

		// int index = is_nagative ? 1 : 0;

		// while (index < equation.length() && equation.charAt(index) >= '0' && equation.charAt(index) <= '9') {
		// 	a = a * 10 + (equation.charAt(index) - '0');
		// 	index++;
		// }

		// if (is_nagative) a *= -1;

		// char op = equation.charAt(index++);

		// while (index < equation.length() && equation.charAt(index) >= '0' && equation.charAt(index) <= '9') {
		// 	b = b * 10 + (equation.charAt(index) - '0');
		// 	index++;
		// }

		// char op2 = equation.charAt(index++);

		// is_nagative = equation.charAt(index) == '-' ? true: false;

		// if(is_nagative) index++;

		// while (index < equation.length() && equation.charAt(index) >= '0' && equation.charAt(index) <= '9') {
		// 	c = c * 10 + (equation.charAt(index) - '0');
		// 	index++;
		// }

		// if(is_nagative) c*=-1;

		// if (op == '+')
		// 	System.out.println(a + b == c ? 'Y' : 'N');
		// else if (op == '-')
		// 	System.out.println(a - b == c ? 'Y' : 'N');
		// else if (op == '*')
		// 	System.out.println(a * b == c ? 'Y' : 'N');
		// else if (op == '/')
		// 	System.out.println(a / b == c ? 'Y' : 'N');
		// else
		// 	System.out.println('N');

		//

		// //3

		// int n = sc.nextInt();
		// while(n-->0){
		// 	String name = sc.next();
		// 	int breath = sc.nextInt();
		// 	int pulse = sc.nextInt();
		// 	if( braeth < 15 || breath > 20 || pulse < 50 || pulse > 70)
		// 		System.out.println(name);
		// }

		//4
		// String str = sc.nextLine();
		// int count=0;
		// for(int i=0; i<str.length(); i++){
		// 	if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
		// 		str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
		// 		count ++;
		// }
		// System.out.println(count);

		// //5
		// int n = sc.nextInt();
		// int t,i=1,j=1;

		// for(int k=1; k<=n; k++){
		// 	if(k==1 || k==2)
		// 		t=1;
		// 	else
		// 		t = i+j;
		// 	i = j;
		// 	j = t;
		// 	System.out.print(t+ " ");
		// }

		// //6
		// int max = sc.nextInt();

		// while((n=sc.nextInt())!=-1){
		// 	if(n>max)
		// 		max = n;
		// }

		// if(max != -1)
		// 	System.out.println(max);

		//7
		// int n = sc.nextInt();
		// while(n-->0){
		// 	int a = sc.nextInt();
		// 	int b = sc.nextInt();
		// 	int row = a + (a-1)*(b-1);
		// 	for(int i=0; i<row; i++){
		// 		for(int j=0; j<a; j++){
		// 			if(i%(a-1)==j || i%(a-1)+j==a-1)
		// 				System.out.print('X');
		// 			else
		// 				System.out.print(' ');
		// 		}
		// 		System.out.println();
		// 	}
		// }

		// //8
		// int n = sc.nextInt();
		// while(n-->0){
		// 	int position=0;
		// 	int[] cmds;
		// 	int m = sc.nextInt();
		// 	sc.nextLine();	// to next line
		// 	cmds = new int[m];
		// 	for(int i=0;i<m;i++){
		// 		int move = 0;
		// 		String cmd = sc.nextLine();
		// 		if(cmd.equals("LEFT"))
		// 			move = -1;
		// 		else if(cmd.equals("RIGHT"))
		// 			move = 1;
		// 		else if(cmd.substring(0,8).equals("SAME AS ")){
		// 			String num_str = cmd.substring(8).trim();
		// 			int num = 0;
		// 			for(int j=0;j<num_str.length();j++){
		// 				char c = num_str.charAt(j);
		// 				if(c>='0' && c<='9')
		// 					num = num*10 + (c-'0');
		// 				else
		// 					break;
		// 			}
		// 			if(num < 1 || num > i)	// may cause dead loop
		// 				return;
		// 			move = cmds[num-1];	// same as 1 means cmds[0]
		// 		}
		// 		position += move;
		// 		cmds[i] = move;
		// 	}
		// 	System.out.println(position);
		// }
	}
}