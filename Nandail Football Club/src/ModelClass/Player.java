package ModelClass;

public class Player {

    String name;
    int ID;
    String Age;
    String phone;

    String address;
    public Player(String name, int ID, String age, String phone,String address) {
        this.name = name;
        this.ID = ID;
        Age = age;
        this.phone = phone;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress (String address) {
        this.phone = address;
    }

    public void DisplayPlayer()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
        System.out.println("Age : "+Age);
        System.out.println("Phone : "+phone);
        System.out.println("Address : "+address);
    }

}
