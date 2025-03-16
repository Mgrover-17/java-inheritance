class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    void displayInfo(){
        System.out.println("title: "+title);
        System.out.println("publication year: "+publicationYear);
    }
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        super(title,publicationYear);
        System.out.println("calling author constructor");
        this.name=name;
        this.bio=bio;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("author: "+name);
        System.out.println("bio: "+bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author=new Author("Harry Potter and the Philosopher's Stone", 1997, "J. K. Rowling", "British author");
        author.displayInfo();
    }
}
