// question: 4
// Write an abstract class named Person and its two subclasses named Student and Employee.
// A person has a name, address, phone number, and email address. A student has enrollment, 
// course. An employee has an office, salary, and designation. Define constructors and methods for input 
// and display for both classes. Write a main program to give demonstration of all.


abstract class person {
    private String name;
    private String address;
    private long phoneNo;
    String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public abstract void display();
}

class student extends person {
    long enrollmentNo;
    String course;

    public student(long enrollmentNo, String course) {
        this.enrollmentNo = enrollmentNo;
        this.course = course;
    }

    public void display() {
        System.out.println(this.enrollmentNo + "\n" + this.course + "\n" + getName() + "\n" + getAddress() + "\n" + getEmailAddress() + "\n" + getPhoneNo());
    }

}

class employee extends person {
    String office;
    double salary;
    String designation;

    public employee(String office, double salary, String designation) {
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }
    

    @Override
    public void display() {
        System.out.println(this.designation + this.office + "\n" + this.salary + "\n" + getName() + "\n" + getAddress() + "\n" + getEmailAddress() + "\n" + getPhoneNo());
    }
}


public class que4 {
    public static void main(String[] args) {

//        for student
        student s1 = new student(123, "english");
        s1.setName("Amit Kumar Bhagat");
        s1.setPhoneNo(7232914933l);
        s1.setEmailAddress("amitkumarbhagat2506@gmail.com");
        s1.setAddress("Sector 63, block no - 34, room no - d3, cleo county, Greater noida");

        s1.display();

        System.out.println("\n"+"\n");
        
//        for employee
        employee e1 = new employee("Walmart pvt ltd", 1200000l,"DevOps Engineer");
        e1.setName("xyz Bhagat");
        e1.setPhoneNo(7232914933l);
        e1.setEmailAddress("amitkumarbhagat2506@gmail.com");
        e1.setAddress("Sector 63, block no - 34, room no - d3, cleo county, Greater noida");

        e1.display();
    }
}
