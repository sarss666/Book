package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书");
        System.out.println("请输入所要查找的书的名字");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("查到了这本书");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有找到这本书");
    }
}
