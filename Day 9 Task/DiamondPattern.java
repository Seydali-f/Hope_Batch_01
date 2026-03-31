interface Person {
    void role();
}

interface Student extends Person {
    void  study();
}

interface Teacher extends Person {
    void teach();
}

class CollegeMember implements Student, Teacher {

    public void role() {
        System.out.println("Person can be both Student and Teacher in the college");
    }
    public void study()
    {
        System.out.println("Student studies subject");
    }
    public void teach(){
        System.out.println("Teacher teaches subject");
    }
}

public class DiamondPattern {
    public static void main(String[] args) {

        CollegeMember c = new CollegeMember();
        c.role();
        c.study();
        c.teach();

    }
}