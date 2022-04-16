package SpringBoot.annotationExample2;

public class Kisi {
	@Override
	public String toString() {
		return "Kisi [Name=" + Name + ", Surname=" + Surname + "]";
	}
	public String Name;
	public String Surname;
	public Kisi(String Name, String Surname)
	{
		this.Name = Name;
		this.Surname = Surname;
	}

}
