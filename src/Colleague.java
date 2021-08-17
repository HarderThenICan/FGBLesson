public class Colleague {String fcs;
    String post;
    String email;
    long telephone;
    int salary;
    int age;

    Colleague(String newFcs, String newPost, String newEmail, long newTelephone, int newSalary, int newAge) {
        fcs = newFcs;
        post = newPost;
        email = newEmail;
        telephone = newTelephone;
        salary = newSalary;
        age = newAge;

    }
    void info (){
        System.out.println(fcs + " " + post + " " + email + " " +  telephone + " " +  salary + " " +  age);
    }

}

