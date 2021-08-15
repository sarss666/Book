package user;

import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;
    IOperation[] iOperations;//存储当前对象里所对应的所有的方法;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList){
     this.iOperations[choice].work(bookList);


    }
}
