package bloodbankmanagementsystem;
public class Person {
    private String name;
    private String bloodGroup;
    private int age;
    private String address;
    private String mobileNumber;
    void addDonar(String name,String bg,int age,String address,String mno)
    {
        this.name=name;
        this.bloodGroup=bg;
        this.address=address;
        this.age=age;
        this.mobileNumber=mno;
    }
    String getName()
    {
        return this.name;
    }
    String getBloodGroup()
    {
        return this.bloodGroup;
    }
    int getAge()
    {
        return this.age;
    }
    String getAddress()
    {
        return this.address;
    }
    String getMobileNumber()
    {
        return this.mobileNumber;
    }
}
