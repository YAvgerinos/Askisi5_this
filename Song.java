/*Οικονομικό Πανεπιστήμιο Αθηνών
  Μεταπτυχιακό στη Διοικητική Επιστήμη και Τεχνολογία
  Full time - 2017-18
  Συστήματα Λογισμικού: ’σκηση 5ης εβδομάδας

  Αυγερινός Ιωάννης
  MSTFT1702 */

public class Song //Δημιουργία κλάσης Song
{
	static Song song[] = new Song [10];
	//Δημιουργία ιδιωτικών μεταβλητών στιγμιοτύπου
	private int id;
	private String title;
	private Singer singer;
	private String url;
	static int counter = 0;
	//Μέθοδος δημιουργίας και αρχικοποίησης τιμών
	public Song(String title, Singer singer, String url)
	{
		this.title = title;
		this.singer = singer;
		this.url = url;
		song[counter]=this;
		id=counter++;
	}
	//Μέθοδος getTitle
	public String getTitle()
	{
		System.out.println(this.toString());
		return title;
	}
	//Μέθοδος setTitle
	public void setTitle(String title)
	{
		this.title = title;
	}
	//Μέθοδος getSinger
	public Singer getSinger()
		{
			return singer;
	}
	//Μέθοδος setSinger
	public void setSinger(Singer singer)
		{
			this.singer = singer;
	}
	//Μέθοδος getUrl
	public String getUrl()
		{
			return url;
	}
	//Μέθοδος setUrl
	public void setUrl(String url)
		{
			this.url = url;
	}
	//Μέθοδος toString
	public String toString()
	{
		return "Title: "+title+" -  Listen here: "+url;
	}
} //Τέλος κλάσης Song