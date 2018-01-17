/*���������� ������������ ������
  ������������ ��� ���������� �������� ��� ����������
  Full time - 2017-18
  ��������� ����������: ������ 5�� ���������

  ��������� �������
  MSTFT1702 */

import java.util.Scanner; //�������� ������ Scanner ��� ������� ��� Menu

public class SongTest //���������� ������ SongTest
{
	public static void main (String[] args) //�������� ������ ����������
	{
		Scanner number = new Scanner (System.in); //������� ������� ��� ��������� ��� �� ������
		int menu = 0; //������� ������� ��� ����������� �� ��� ��� ��� ��� �������� ��� Menu ��� ������������ ���
		int franksinatrasongs = 0; //������� ������� ���������� ��� Frank Sinatra
		//Singer sing[] = new Singer [10]; //���������� ������ ��� �� ����������� ��� ������ Singer
		//Song song[] = new Song [10]; //��������� ������ ��� �� ����������� ��� ������ Song

		//���������� ������������ ������ Singer
		Singer franksinatra = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariahcarey = new Singer ("Mariah Carey");
		Singer chrisrea = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");
		//�������� ��� ������������ ��� ����� ��� ������
		/*singer[0]=franksinatra;
		singer[1]=wham;
		singer[2]=mariahcarey;
		singer[3]=chrisrea;
		singer[4]=sia; */
		//���������� ������������ ������ Song
		Song song1 = new Song ("All I Want For Christmas Is You", mariahcarey, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		Song song2 = new Song ("White Christmas", franksinatra, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		Song song3 = new Song ("Last Christmas", wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
		Song song4 = new Song ("Driving Home For Christmas", chrisrea, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		Song song5 = new Song ("Santa's Coming For Us", sia, "https://www.youtube.com/watch?v=V3EYjVPRClU");
		Song song6 = new Song ("Let It Snow! Let It Snow! Let It Snow!", franksinatra, "https://www.youtube.com/watch?v=vGRC2LYmHfU");
		//�������� ��� ������������ ��� ����� ��� ������
		/*song[0]=song1;
		song[1]=song2;
		song[2]=song3;
		song[3]=song4;
		song[4]=song5;
		song[5]=song6;*/

		//�������� ������� ������ ��� �������� ��� Menu
		System.out.print("************* Welcome to DMST Christmas Music Application *************");
		while (true) //�������� ��� � ������� ����� ������
		{
			do //�� Menu ����������� ���������������� ������ ���� ����� ������ ������� (1 � 2) - ������ �������
			{
				System.out.println("\nMenu: ");
				System.out.println("Type 1 to display singers' list");
				System.out.println("Type 2 to display Frank Sinatra's available songs");
				System.out.print("Type here: ");
				menu = number.nextInt(); //� ������� ��� ������� � ������� ����� � ������� ��� ��� �� Menu.
				System.out.print("\n");
				if (menu!=1 && menu!=2)                                       //�� ����� �� ������ ����
				{
					{
						System.out.print("Invalid input. Choose 1 or 2: ");   //���� ����������� ������ ���������.
					}
				}
			} //�� Menu ����������� ���������������� ������ ���� ����� ������ ������� (1 � 2) - ����������� �������
			while (menu!=1 && menu!=2);

			if (menu==1) //�������� ������ �������� ��� �� Menu
			{
				System.out.println("**************************** Singers' list ****************************");
				for(int i=0;i<Singer.singer.length;i++)
				{
					if (Singer.singer[i]!=null) //�������� ���� ��� �� ����� ����� ��� ����� ����� �����
					{
						System.out.println(Singer.singer[i]);
					}
				} //�������� ��� ������ ������������ ��� �������� ��� ��������� ���, ������ ��� ������������ ��� ����� Singer
				System.out.println("***********************************************************************");
			} //���� ������ �������� ��� �� Menu

			if (menu==2) //�������� �������� �������� ��� �� Menu
			{
				System.out.println("********************** Frank Sinatra Songs List ***********************");
				for (int i=0;i<Song.song.length;i++)
				{
					if (Song.song[i]!=null) //�������� ���� ��� �� ��� ����� ��� ����� ����� �����
					{
						if (Singer.singer[0].equals(Song.song[i].getSinger())) //�� � ������������ ��� ���������� ��� �������� ������ ����� � Frank Sinatra
						{
							franksinatrasongs++;				 //���� � �������� ��������� ���� 1
						}
					}

				} //�������� ��� ������ ���������� ��� ������� ������� ��� Frank Sinatra

				System.out.println(franksinatrasongs+" songs available:"); //�������� ������� ���������� ��� Frank Sinatra

				for (int i=0;i<Song.song.length;i++)
				{
					if (Song.song[i]!=null) //�������� ���� ��� �� ��� ����� ��� ����� ����� �����
					{
						if (Singer.singer[0].equals(Song.song[i].getSinger())) //�� � ������������ ��� ���������� ��� �������� ������ ����� � Frank Sinatra
						{
							System.out.println(Song.song[i]);		 //���� �� �������� ����������� ������� �� �� ������ toString ��� ������ Song
						}
					}
				}
				System.out.println("***********************************************************************");
			} //���� �������� �������� ��� �� Menu
		} //���� ������� ��������
	} //�������� ������ ����������
} //����� ������ SongTest