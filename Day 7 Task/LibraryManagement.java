class Book {
    String name;

    
    Book(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Book Name: " + name);
    }
}

class TextBook extends Book {
    TextBook(String name) {
        super(name);
    }
}

class Magazine extends Book {
    Magazine(String name) {
        super(name);
    }
}

class Journal extends Book {
    Journal(String name) {
        super(name);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        TextBook t = new TextBook("Data Structures");
        Magazine m = new Magazine("Science Monthly");
        Journal j = new Journal("Computer Research");

        t.display();
        m.display();
        j.display();
    }
}
