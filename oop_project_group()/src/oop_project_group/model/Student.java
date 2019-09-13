
package oop_project_group.model;




public class Student {
    String firstName;
    String lastName;
    String email;
    Courses course;
 
    public Student(){}
    
    public Student(String name, String lastName, String email_address, Courses course){
        this.firstName = name;
        this.lastName = lastName;
        email_address = email;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
       // this.course = course;
    }

    
}


        /*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        BAMATA WA BAMATA Maurice             18/420/BSSE-S
        NDAHURA BASARA Moses                 19/231/BIT-S
        ALLY KALIMA                          18/1097/BIT-S
        NANNYUNJA NOELINA                    19/536/BSCS-S
        */