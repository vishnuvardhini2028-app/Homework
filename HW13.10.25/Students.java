class Students
{
	public static void main(String[] args)
	{
	int student=50;
	double girls=40;
	double percent=(girls/100)*student;//20
	double noofboys=student-percent;
	System.out.println("total num of girls:"+percent);
	System.out.println("total num of boys:"+noofboys);
	}
}