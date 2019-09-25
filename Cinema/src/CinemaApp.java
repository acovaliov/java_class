 import java.util.Scanner;
  public class CinemaApp{
    /**
     * @param args
     */
    public static void main(String[] args){
        // карта расположения сидений в кинозале
        // -1 -> место занято
        // 0  -> место свободно
        // 1  -> место зарезервировано
        int[][] room = {
          {-1, 0, 0, 0, 0, 0, 0,-1 },
          { 0, 0, 0, 1, 1, 1, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        // цены для каждого ряда в зале
        int[]   price = {
          100,
          100,
          75,
          75,
          50
        };

		Scanner scan = new Scanner(System.in);
		System.out.print("Ваше имя: ");
		String username = scan.nextLine();
		
		while(true)
		{
		int freeplaces = 0;
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<8; j++)
			{
				if (room[i][j] == 0)
				{
					freeplaces+=1;
				}	
				System.out.print(room[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("В зале " + freeplaces + " свободных мест");
		
        System.out.print("Ведите ряд: ");
		int row = scan.nextInt();
        System.out.print("Ведите место: ");
		int place = scan.nextInt();
		System.out.println ("Вы выбрали: " + row + " ряд, " + place + " место"); 
		
		if (room[row][place] == 0)
		{
			System.out.println("Место свободно. Цена билета: " + price[row] + " лей.");
			System.out.print("Желаете зарезервировать? (y/n)");
			String reserv = scan.next();
			System.out.println(reserv);
			if (reserv.equals("y"))
			{
				room[row][place] = 1;
				System.out.println("Место " + place + " в " + row + " ряду зарезервировано.");
			}
		}
		else
		{
			System.out.println("Место зарезервировано. Выберите другое."); 
		}
		System.out.print("Желаете продолжить?(y/n)"); 
		String next = scan.next();
		
		if (next.equals("n"))
		{
				break;
		}
		
		System.out.println("..."); 
		}
		scan.close();
    }
  }