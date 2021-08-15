package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements  IOperation{
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除图书");
        System.out.println("请输入要删除的图书的名字");
        String name = scanner.next();
        int pos = -1;
        int i = 0;
        for (; i < bookList.getUsedSize() ; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("查到了这本书");
                pos = i;
                break;
            }
        }
        int curSize = bookList.getUsedSize();
        if (i >= bookList.getUsedSize()){
            System.out.println("没有要删的书籍");
            return;
        }
      for(int j = 0; j <= bookList.getUsedSize()-1; j++){
          Book book = bookList.getBook(i+1);
          bookList.setBook(i,book);
      }
      bookList.setUsedSize(curSize-1);
        System.out.println("删除成功");
    }

}
