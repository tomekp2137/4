public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private String Data;
  

  public Student(String name, String surname, String data, int age) {
    Name = name;
    Surname = surname;
    Data = data;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public String GetData() {return Data;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Surname + " " + Data + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error","Parse Error", -1);
    return new Student(data[0], data[1], data[2], Integer.parseInt(data[3]));
  }
}