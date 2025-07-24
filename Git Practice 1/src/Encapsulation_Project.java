// Encapsulation Project : And try to Learn upload in GitHub

class Student{
    private String gender;
    private String name;
    private int age;

    // Constructor to initialise the Object
    Student(String gender, String name , int age){
        setGender(gender);
        setName(name);
        setAge(age);
    }

    // Getter
    public String getGender(){
        return gender;
    }

    public String getName(){
        return  name;
    }

    public int getAge(){
        return  age;
    }

    // Setter
    public void setGender(String gender){
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            this.gender = gender;
        }else {
            System.out.println("Invalid Gender! Please Enter 'male' or 'female' !");
        }
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Name cannot be Empty!!");
        }
    }

    public void setAge(int age){
        if (age > 0 && age <= 100){
             this.age = age;
        }else {
            System.out.println("Age must between 1 to 100. ");
        }
    }

    // Method to display Student details
    public void getDetail(){
        System.out.println("Gender : " +getGender());
        System.out.println("Name : " +getName());
        System.out.println("Age : " +getAge());
    }
}

// Main Class
public class Encapsulation_Project {
    public static void main(String[] args) {

        // Create an object of Student Class
        Student student1 = new Student("Male","Rahul singh",20);
        student1.getDetail();

        System.out.println("\n============== 2nd Student Datails");

        // Create an object of 2nd student
        Student student2 = new Student("Female","Anushka kri",22);
        student2.getDetail();

        // Testing to Wrong input
        student2.setGender("Unknown");  // Invalid Gender! Please Enter 'male' or 'female' !
        student2.setName("");  // Name cannot be Empty!!
        student2.setAge(-12);  // Age must between 1 to 100.
    }
}