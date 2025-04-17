class products
{
    String[] Mvnumber = new String[6]; // ???????????????
	String[] ShTime = new String[5]; // ??????????????
	int j = 0;
	int t = 0;
	//   Method Movie
	public void mv1()
	{
		System.out.println("\n\t\t\t You Select : Little Mermaid");
			Mvnumber[0] = "Little Mermaid\t";
	}
	public void mv2()
	{
		System.out.println("\n\t\t\t You Select : Super Mario Brother");
			Mvnumber[1] = "Super Mario Brother\t";
	}
	public void mv3()
	{
		System.out.println("\n\t\t\t You Select : John Wick 4");
			Mvnumber[2] = "John Wick 4\t";
	}
	public void mv4()
	{
		System.out.println("\n\t\t\t You Select : Avatar 3");
			Mvnumber[3] = "Avatar 3\t";
	}
	public void mv5()
	{
		System.out.println("\n\t\t\t You Select : Evil Dead Rise");
			Mvnumber[4] = "Evil Dead Rise\t";
	}
	public void mv6()
	{
		System.out.println("\n\t\t\t You Select : Black Adam");
			Mvnumber[5] = "Black Adam\t";
	}
	//   Method Time
	public void tm1()
	{
		System.out.println("\n\t\t\t ) You select showtime at : 10.00 a.m");
		ShTime[0]="10.00 a.m.";
	}
	public void tm2()
	{
		System.out.println("\n\t\t\t ) You select showtime at : 12.00 a.m");
		ShTime[1]="12.00 a.m.";
	}
	public void tm3()
	{
		System.out.println("\n\t\t\t ) You select showtime at : 14.00 p.m.");
		ShTime[2]="14.00 p.m..";
	}
	public void tm4()
	{
		System.out.println("\n\t\t\t ) You select showtime at : 16.00 p.m.");
		ShTime[3]="16.00 p.m.";
	}
	public void tm5()
	{
		System.out.println("\n\t\t\t ) You select showtime at : 20.00 p.m.");
		ShTime[4]="20.00 p.m.";
	}
	public void movielist() // ?????????
	{
		System.out.println();
		System.out.println("\t\t\t********************* BILL *********************");
		System.out.println("\t\t\t**** List ****\t               **** Showtime****");
		for(j = 0 ; j < 6 ; j++){ // ??????????????????????
			if(Mvnumber[j]!=null) // ??????????????????????????
			{
			System.out.println("\t\t\t"+Mvnumber[j]);
			}
		}
		for(t = 0 ; t < 5 ; t++){
			if(ShTime[t]!=null)
			{
			System.out.println("\t\t\t"+ShTime[t]);
			}
		}
	}

}