package bloodbankmanagementsystem;
import java.util.Scanner;
public class BloodBankManagementSystem {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] personArray = new Person[20];
        int count=0;
        while(true)
        {
            startExecution();
            int n=scanner.nextInt();
            switch(n)
            {
                case 1:
                    addDonar(personArray,count);
                    count++;
                    break;
                case 2:
                    searchDonar(personArray,count);
                    break;
                case 3:
                    searchDonarBasedOnAge(personArray,count);
                    break;
                case 4:
                    searchDonarBasedOnAddress(personArray,count);
                    break;
                case 5:
                    searchDonarBasedOnBloodGroup(personArray,count);
                    break;
                default:
                    System.out.println("Select correct option");
            }
            System.out.println("Do you want to continue enter 1 otherwise 0");
            int v=scanner.nextInt();
            if(v==0)
                break;
        }
    }
    public static void startExecution()
    {
        System.out.println("Enter your choice(1-5)");
        System.out.println("1. Add Donar");
        System.out.println("2.Search donar");
        System.out.println("3.Search donar based on age");
        System.out.println("4.Search donar based on address");
        System.out.println("5.Search donar based on Blood Group");
    }
    public static void addDonar(Person[] array,int count)
    {
        scanner.nextLine();
        System.out.println("Enter your name");
        String name=scanner.nextLine().toLowerCase();
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your blood Group");
        String bg=scanner.nextLine();
        System.out.println("Enter your mobile number");
        String mno=scanner.nextLine();
        System.out.println("Enter your address");
        String address=scanner.nextLine().toLowerCase();
        array[count]=new Person();
        array[count].addDonar(name, bg, age, address, mno);
    }
    public static void searchDonar(Person[] array,int count)
    {
        System.out.printf("%-30s%-10s%-5s%-50s%-15s","Name","Blood Group","Age","Address","Mobile Number");
        System.out.println();
        for(int i=0;i<count;i++)
        {
            System.out.printf("%-30s%-10s%-5d%-50s%-15s",array[i].getName(),array[i].getBloodGroup(),array[i].getAge(),array[i].getAddress(),array[i].getMobileNumber());
            System.out.println();
        }
    }
    public static void searchDonarBasedOnAge(Person[] array,int count)
    {
        System.out.println("Enter The age");
        int a = scanner.nextInt();
        System.out.printf("%-30s%-10s%-5s%-50s%-15s","Name","Blood Group","Age","Address","Mobile Number");
        System.out.println();
        for(int i = 0;i < count;i++)
        {
            if(array[i].getAge() >= (a-3) && array[i].getAge() <= (a+3))
            {
                System.out.printf("%-30s%-10s%-5d%-50s%-15s",array[i].getName(),array[i].getBloodGroup(),array[i].getAge(),array[i].getAddress(),array[i].getMobileNumber());
                System.out.println();
            }
        }
    }
    public static void searchDonarBasedOnAddress(Person[] array,int count)
    {
        scanner.nextLine();
        System.out.println("Enter The address");
        String a = scanner.nextLine().toLowerCase();
        System.out.printf("%-30s%-10s%-5s%-50s%-15s","Name","Blood Group","Age","Address","Mobile Number");
        System.out.println();
        int flag=1;
        for(int i = 0;i < count;i++)
        {
            if(array[i].getAddress().indexOf(a) != -1)
            {
                System.out.printf("%-30s%-10s%-5d%-50s%-15s",array[i].getName(),array[i].getBloodGroup(),array[i].getAge(),array[i].getAddress(),array[i].getMobileNumber());
                System.out.println();
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("No match");
        }
    }
    public static void searchDonarBasedOnBloodGroup(Person[] array,int count)
    {
        scanner.nextLine();
        System.out.println("Enter The blood group");
        String a = scanner.nextLine();
        System.out.printf("%-30s%-10s%-5s%-50s%-15s","Name","Blood Group","Age","Address","Mobile Number");
        System.out.println();
        int flag=1;
        for(int i = 0;i < count;i++)
        {
            if(array[i].getBloodGroup().equalsIgnoreCase(a))
            {
                System.out.printf("%-30s%-10s%-5d%-50s%-15s",array[i].getName(),array[i].getBloodGroup(),array[i].getAge(),array[i].getAddress(),array[i].getMobileNumber());
                System.out.println();
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("No match");
        }
    }
}
