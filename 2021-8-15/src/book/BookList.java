package book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList(){
        books[0] = new Book("三国演义","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",32,"小说");
        books[2] = new Book("水浒传","施耐庵",6,"小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public void setBook(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

}
