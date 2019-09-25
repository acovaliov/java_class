 import java.util.Scanner;
  public class CinemaApp{
    /**
     * @param args
     */
    public static void main(String[] args){
        // ����� ������������ ������� � ��������
        // -1 -> ����� ������
        // 0  -> ����� ��������
        // 1  -> ����� ���������������
        int[][] room = {
          {-1, 0, 0, 0, 0, 0, 0,-1 },
          { 0, 0, 0, 1, 1, 1, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 },
          { 0, 0, 0, 0, 0, 0, 0, 0 }
        };
        // ���� ��� ������� ���� � ����
        int[]   price = {
          100,
          100,
          75,
          75,
          50
        };

		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���: ");
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
		System.out.println("� ���� " + freeplaces + " ��������� ����");
		
        System.out.print("������ ���: ");
		int row = scan.nextInt();
        System.out.print("������ �����: ");
		int place = scan.nextInt();
		System.out.println ("�� �������: " + row + " ���, " + place + " �����"); 
		
		if (room[row][place] == 0)
		{
			System.out.println("����� ��������. ���� ������: " + price[row] + " ���.");
			System.out.print("������� ���������������? (y/n)");
			String reserv = scan.next();
			System.out.println(reserv);
			if (reserv.equals("y"))
			{
				room[row][place] = 1;
				System.out.println("����� " + place + " � " + row + " ���� ���������������.");
			}
		}
		else
		{
			System.out.println("����� ���������������. �������� ������."); 
		}
		System.out.print("������� ����������?(y/n)"); 
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