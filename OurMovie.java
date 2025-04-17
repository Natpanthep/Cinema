import java.util.*;
class OurMovie
{
	public static void main(String[] args)
	{
		products pd = new products(); //??? class ??? products ????????
		Scanner in = new Scanner(System.in); //??????
		int ch;
		int sht;
		int a;
		int seat=0;
		int go=0;
		int row=0;
		int col=0;
		int line=0;
		int people=0;
		int i=0;
		int j=0;
		int t=0;
		int z =0;
		double total=0;
		double temptotal=0;
		int choice=0;
		String getcode = " ";

		String[] Mvnumber = new String[6]; // ??????????????? ???? products
		String[] ShTime = new String[5]; // ?????????????? ???? products

		//   How Many People
		System.out.println("\t\t\t   *** WELCOME TO CINEPLEX ***\n");

		//   Movie List
		System.out.println();
		System.out.println("\t\t\t MOVIE");
		System.out.println("\t\t\t 1) Little Mermaid");
		System.out.println("\t\t\t 2) Super Mario Brother");
		System.out.println("\t\t\t 3) John Wick 4");
		System.out.println("\t\t\t 4) Avatar 3");
		System.out.println("\t\t\t 5) Evil Dead Rise");
		System.out.println("\t\t\t 6) Black Adam");
		System.out.print("\t\t\t Select Movie : "); // ?????????????????
		ch = in.nextInt(); // ??????????????????????? ch
		switch(ch)
		{
			case 1 : pd.mv1(); // pd -> class products ???????????? main
				break;
			case 2 : pd.mv2();
				break;
			case 3 : pd.mv3();
				break;
			case 4 : pd.mv4();
				break;
			case 5 : pd.mv5();
				break;
			case 6 : pd.mv6();
				break;
			default : System.out.println("\t\t\t Please Select Movie (1-6 only)"); break;
		}
		//   Time
		System.out.println("");
		System.out.println("\t\t\t 1) 10.00 a.m. \n");
		System.out.println("\t\t\t 2) 12.00 a.m. \n");
		System.out.println("\t\t\t 3) 14.00 p.m. \n");
		System.out.println("\t\t\t 4) 16.00 p.m. \n");
		System.out.println("\t\t\t 5) 20.00 p.m. \n");
		System.out.println("\t\t\t Select the Time"); // ?????????????????????????
		sht = in.nextInt();
		switch(sht)
		{
			case 1 : pd.tm1();
				break;
			case 2 : pd.tm2();
				break;
			case 3 : pd.tm3();
				break;
			case 4 : pd.tm4();
				break;
			case 5 : pd.tm5();
				break;
			default : System.out.println("\t\t\t Please select a specific time"); break;

		}

		//   Seat
		System.out.println();
		char [][] board = new char [][]{ //??????????????????
			{'1','2','3'},
			{'4','5','6'},
			{'7','8','9'}
		};
			do{
			for(i=0;i<1;i++){ // ?????????????????????
				System.out.println("\t\t---------Monitor----------\t\t\n");
				System.out.println("\t   |" +board[0][0]+"  |" +board[0][1]+"  |" +board[0][2]+" \n");
				System.out.println("\n");
				System.out.println("\t   |" +board[1][0]+"  |" +board[1][1]+"  |" +board[1][2]+" \n");
				System.out.println("\n");
				System.out.println("\t   |" +board[2][0]+"  |" +board[2][1]+"  |" +board[2][2]+" \n");
			
				seat += i%2 +1;
				System.out.printf("\n\t\t Enter the seat number : ",seat,"X");
				go = in.nextInt();
				row = --go/3; 
				col = go%3;
				board[row][col] = 'X';
			}
			System.out.println();
			System.out.println("\t\t\t     ---------   Monitor   ----------     \t\t\n");
			System.out.println("\t\t\t Seat Select\n");
			System.out.println("\t\t  |" +board[0][0]+"  |" +board[0][1]+"  |" +board[0][2]+" \n"); // ?????????????????? ??? ???????????????????
			System.out.println("\n");
			System.out.println("\t\t  |" +board[1][0]+"  |" +board[1][1]+"  |" +board[1][2]+" \n");
			System.out.println("\n");
			System.out.println("\t\t  |" +board[2][0]+"  |" +board[2][1]+"  |" +board[2][2]+" \n");
			System.out.println("*************************************************************");
			
			if(seat == 9){
				//			code & bill 	
		System.out.println("\n\t\t\t Do you want to enter a discount code?\n");
		System.out.println("\t\t\t1) Yes \n");
		System.out.println("\t\t\t2) No \n");
		System.out.print("\t\t\tChoose 1 or 2 :");
		choice = in.nextInt();
		if(choice ==1 ){ // ???????????
			System.out.print("\t\t\t Enter discount code :");
			getcode = in.next();
			if(getcode.equalsIgnoreCase("JavaSoHard")){ // ??????????
			pd.movielist(); // ??????? class products ??????????????????????????
			total = seat*150;
			temptotal = total*0.8;
			System.out.println("\t\t ******************************");
			System.out.println("\t\t\t Total money");
			System.out.println("\t\t\t You use a 20% discount code");
			System.out.println("\t\t\t" +temptotal+" B.");
			System.out.println("\t\t ******************************");
			}
		else{
			System.out.println("\t\t\t Invalid discount code");
		}
		}
		if(choice ==2 ){ // ???????????
			pd.movielist();
			temptotal = seat*150;
			System.out.println("\t\t\t ******************************");
			System.out.println("\t\t\t Total money");
			System.out.println("\t\t\t" +temptotal+" B.");
			System.out.println("\t\t\t ******************************");
		}
			}
			System.out.print("\t\t\t Would you like to select more seats? (1(Yes) or 2(NO)) : "); // ?????????????????????????????????????
			a=in.nextInt();
		}while(a == 1 ); // ?????????? y ???? Y ????????????????????????????
			

		//			code & bill 	
		System.out.println("\n\t\t\t Do you want to enter a discount code?\n");
		System.out.println("\t\t\t1) Yes \n");
		System.out.println("\t\t\t2) No \n");
		System.out.print("\t\t\tChoose 1 or 2 :");
		choice = in.nextInt();
		if(choice ==1 ){ // ???????????
			System.out.print("\t\t\t Enter discount code :");
			getcode = in.next();
			if(getcode.equalsIgnoreCase("JavaSoHard")){ // ??????????
			pd.movielist(); // ??????? class products ??????????????????????????
			total = seat*150;
			temptotal = total*0.8;
			System.out.println("\t\t ******************************");
			System.out.println("\t\t\t Total money");
			System.out.println("\t\t\t You use a 20% discount code");
			System.out.println("\t\t\t" +temptotal+" B.");
			System.out.println("\t\t ******************************");
			}
		else{
			System.out.println("\t\t\t Invalid discount code");
		}
		}
		if(choice ==2 ){ // ???????????
			pd.movielist();
			temptotal = seat*150;
			System.out.println("\t\t\t ******************************");
			System.out.println("\t\t\t Total money");
			System.out.println("\t\t\t" +temptotal+" B.");
			System.out.println("\t\t\t ******************************");
		}
	}

}
