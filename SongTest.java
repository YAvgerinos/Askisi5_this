/*Οικονομικό Πανεπιστήμιο Αθηνών
  Μεταπτυχιακό στη Διοικητική Επιστήμη και Τεχνολογία
  Full time - 2017-18
  Συστήματα Λογισμικού: ’σκηση 5ης εβδομάδας

  Αυγερινός Ιωάννης
  MSTFT1702 */

import java.util.Scanner; //Εισαγωγή κλάσης Scanner για επιλογή στο Menu

public class SongTest //Δημιουργία κλάσης SongTest
{
	public static void main (String[] args) //Εισαγωγή κύριας συνάρτησης
	{
		Scanner number = new Scanner (System.in); //Ορισμός αριθμού που εισάγεται από το χρήστη
		int menu = 0; //Ορισμός αριθμού που αντιστοιχεί σε μία από τις δύο επιλογές του Menu και αρχικοποίησή του
		int franksinatrasongs = 0; //Ορισμός αριθμού τραγουδιών του Frank Sinatra
		//Singer sing[] = new Singer [10]; //Δημιουργία πίνακα για τα αντικείμενα της κλάσης Singer
		//Song song[] = new Song [10]; //ημιουργία πίνακα για τα αντικείμενα της κλάσης Song

		//Δημιουργία αντικειμένων κλάσης Singer
		Singer franksinatra = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariahcarey = new Singer ("Mariah Carey");
		Singer chrisrea = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");
		//Εισαγωγή των αντικειμένων στα κελιά του πίνακα
		/*singer[0]=franksinatra;
		singer[1]=wham;
		singer[2]=mariahcarey;
		singer[3]=chrisrea;
		singer[4]=sia; */
		//Δημιουργία αντικειμένων κλάσης Song
		Song song1 = new Song ("All I Want For Christmas Is You", mariahcarey, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		Song song2 = new Song ("White Christmas", franksinatra, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		Song song3 = new Song ("Last Christmas", wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
		Song song4 = new Song ("Driving Home For Christmas", chrisrea, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		Song song5 = new Song ("Santa's Coming For Us", sia, "https://www.youtube.com/watch?v=V3EYjVPRClU");
		Song song6 = new Song ("Let It Snow! Let It Snow! Let It Snow!", franksinatra, "https://www.youtube.com/watch?v=vGRC2LYmHfU");
		//Εισαγωγή των αντικειμένων στα κελιά του πίνακα
		/*song[0]=song1;
		song[1]=song2;
		song[2]=song3;
		song[3]=song4;
		song[4]=song5;
		song[5]=song6;*/

		//Εκτύπωση αρχικής οθόνης και επιλογών του Menu
		System.out.print("************* Welcome to DMST Christmas Music Application *************");
		while (true) //Εκτέλεση όσο η συνθήκη είναι αληθής
		{
			do //Το Menu εκτυπώνεται επαναλαμβανόμενα μέχρις ότου δοθεί έγκυρη επιλογή (1 ή 2) - Έναρξη βρόγχου
			{
				System.out.println("\nMenu: ");
				System.out.println("Type 1 to display singers' list");
				System.out.println("Type 2 to display Frank Sinatra's available songs");
				System.out.print("Type here: ");
				menu = number.nextInt(); //Ο αριθμός που εισάγει ο χρήστης είναι η επιλογή του από το Menu.
				System.out.print("\n");
				if (menu!=1 && menu!=2)                                       //Αν δοθεί μη έγκυρη τιμή
				{
					{
						System.out.print("Invalid input. Choose 1 or 2: ");   //τότε εκτυπώνεται μήνυμα σφάλματος.
					}
				}
			} //Το Menu εκτυπώνεται επαναλαμβανόμενα μέχρις ότου δοθεί έγκυρη επιλογή (1 ή 2) - Τερματισμός βρόγχου
			while (menu!=1 && menu!=2);

			if (menu==1) //Εκτέλεση πρώτης επιλογής από το Menu
			{
				System.out.println("**************************** Singers' list ****************************");
				for(int i=0;i<Singer.singer.length;i++)
				{
					if (Singer.singer[i]!=null) //Εκτύπωση μόνο για τα πέντε κελιά που έχουν λάβει τιμές
					{
						System.out.println(Singer.singer[i]);
					}
				} //Ανάγνωση του πίνακα τραγουδιστών και εκτύπωση των στοιχείων του, δηλαδή των αντικειμένων της τάξης Singer
				System.out.println("***********************************************************************");
			} //Λήξη πρώτης επιλογής από το Menu

			if (menu==2) //Εκτέλεση δεύτερης επιλογής από το Menu
			{
				System.out.println("********************** Frank Sinatra Songs List ***********************");
				for (int i=0;i<Song.song.length;i++)
				{
					if (Song.song[i]!=null) //Ανάγνωση μόνο για τα έξι κελιά που έχουν λάβει τιμές
					{
						if (Singer.singer[0].equals(Song.song[i].getSinger())) //Αν ο τραγουδιστής του τραγουδιού του εκάστοτε κελιού είναι ο Frank Sinatra
						{
							franksinatrasongs++;				 //τότε ο μετρητής αυξάνεται κατά 1
						}
					}

				} //Ανάγνωση του πίνακα τραγουδιών και μέτρηση εκείνων του Frank Sinatra

				System.out.println(franksinatrasongs+" songs available:"); //Εκτύπωση αριθμού τραγουδιών του Frank Sinatra

				for (int i=0;i<Song.song.length;i++)
				{
					if (Song.song[i]!=null) //Εκτύπωση μόνο για τα έξι κελιά που έχουν λάβει τιμές
					{
						if (Singer.singer[0].equals(Song.song[i].getSinger())) //Αν ο τραγουδιστής του τραγουδιού του εκάστοτε κελιού είναι ο Frank Sinatra
						{
							System.out.println(Song.song[i]);		 //τότε το τραγούδι εκτυπώνεται σύμφωνα με τη μέθοδο toString της κλάσης Song
						}
					}
				}
				System.out.println("***********************************************************************");
			} //Λήξη δεύτερης επιλογής από το Menu
		} //Λήξη αληθούς συνθήκης
	} //Κλείσιμο κύριας συνάρτησης
} //Τέλος κλάσης SongTest