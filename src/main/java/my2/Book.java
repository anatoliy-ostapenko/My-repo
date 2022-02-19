package my2;

public class Book {
    Title title;
    Author author;
    Content content;

    public Book() {

    }
    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Title getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


    public  void  show (){
        System.out.println("КНИГА :");
        getAuthor().show();
        getContent().show();
        getTitle().show();
    }

}
