class Books
{
	public static void main(String[] args)
	{
        int totalBooks = 1800;
        double mathsPercent = 40;
        double englishPercent = 20;
        double sciencePercent = 30;
        double socialPercent = 10;
        double mathsBooks = (mathsPercent / 100) * totalBooks;
        double englishBooks = (englishPercent / 100) * totalBooks;
        double scienceBooks = (sciencePercent / 100) * totalBooks;
        double socialBooks = (socialPercent / 100) * totalBooks;
		// Display results
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Maths Books: " + mathsBooks);
        System.out.println("English Books: " + englishBooks);
        System.out.println("Science Books: " + scienceBooks);
        System.out.println("Social Books: " + socialBooks);
		
		
	}
}