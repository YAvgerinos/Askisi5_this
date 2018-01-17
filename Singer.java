/*���������� ������������ ������
  ������������ ��� ���������� �������� ��� ����������
  Full time - 2017-18
  ��������� ����������: ������ 5�� ���������

  ��������� �������
  MSTFT1702 */

public class Singer //���������� ������ Singer
{
	static Singer singer[] = new Singer [10];
	//���������� ��������� ���������� ������������
	private String name;
	private int id;
	//���������� �������� �������� ����������
	static int counter = 0;
	//������� ����������� ��� ������������� �����
	public Singer(String name1)
	{
		name = name1;
		singer[counter]=this;
		id = ++counter; //� ������ ���� �������� ��� �� 0 ��� ������ ��������� ���� 1 ���� ��� �������� ���� ������������
	}
	//������� getName
	public String getName()
	{
		return name;
	}
	//������� setName
	public void setName(String name1)
	{
		name = name1;
	}
	//������� getId
	public int getId()
	{
		return id;
	}
	//������� setId
	public void setId(int id1)
	{
		id = id1;
	}
	//������� toString
	public String toString()
	{
		return "Singer: [name="+name+", id="+id+"]";
	}


} //����� ������ Singer