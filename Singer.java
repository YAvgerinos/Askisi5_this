/*Οικονομικό Πανεπιστήμιο Αθηνών
  Μεταπτυχιακό στη Διοικητική Επιστήμη και Τεχνολογία
  Full time - 2017-18
  Συστήματα Λογισμικού: ’σκηση 5ης εβδομάδας

  Αυγερινός Ιωάννης
  MSTFT1702 */

public class Singer //Δημιουργία κλάσης Singer
{
	static Singer singer[] = new Singer [10];
	//Δημιουργία ιδιωτικών μεταβλητών στιγμιοτύπου
	private String name;
	private int id;
	//Δημιουργία στατικής ακέραιας μεταβλητής
	static int counter = 0;
	//Μέθοδος δημιουργίας και αρχικοποίησης τιμών
	public Singer(String name1)
	{
		name = name1;
		singer[counter]=this;
		id = ++counter; //Η αρχική τιμή ορίζεται ίση με 0 και έκτοτε αυξάνεται κατά 1 μετά την προσθήκη νέου αντικειμένου
	}
	//Μέθοδος getName
	public String getName()
	{
		return name;
	}
	//Μέθοδος setName
	public void setName(String name1)
	{
		name = name1;
	}
	//Μέθοδος getId
	public int getId()
	{
		return id;
	}
	//Μέθοδος setId
	public void setId(int id1)
	{
		id = id1;
	}
	//Μέθοδος toString
	public String toString()
	{
		return "Singer: [name="+name+", id="+id+"]";
	}


} //Τέλος κλάσης Singer