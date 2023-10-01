package Model;

public class Book {
    private String bookName;
    private double bookPrice;
    private int publishingYear;
    private Writer writer;

    public Book() {
    }

    public Book(String bookName, double bookPrice, int publishingYear, Writer writer) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.publishingYear = publishingYear;
        this.writer = writer;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    public boolean comPare(Book book){

        return this.getPublishingYear() == book.getPublishingYear();
    }
    public double priceAfterdown(double x){
        return this.bookPrice*(1-x/100);
    }
}
