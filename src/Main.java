import Model.Book;
import Model.Bookdate;
import Model.Writer;
import Service.Test;

public class Main {
    public static void main(String[] args) {

        Bookdate bookdate1 = new Bookdate(15,8,2005);
        Bookdate bookdate2 = new Bookdate(25,9,2005);
        Bookdate bookdate3 = new Bookdate(15,10,2005);
        Writer writer1 = new Writer("Bùi Đăng Công",bookdate1);
        Writer writer2 = new Writer("Lê Hùng Anh",bookdate1);
        Writer writer3 = new Writer("Trương Việt Hoàng",bookdate1);
        Book book1 = new Book("học java1",500,2021,writer1);
        Book book2 = new Book("học java2",600,2022,writer2);
        Book book3 = new Book("học java3",700,2023,writer3);
        Test test = new Test();
        // in ra tên sách:
        test.printBookname(book1);
        test.printBookname(book2);
        test.printBookname(book3);
        // So sánh năm xuất bản giữa các quyển sách :
        System.out.println(book1.comPare(book2));
        System.out.println(book1.comPare(book3));
        System.out.println(book2.comPare(book3));
        // giá từng quuê sách sau khi giảm
        System.out.println(book1.priceAfterdown(3));
        System.out.println(book2.priceAfterdown(3));
        System.out.println(book3.priceAfterdown(3));






    }
}