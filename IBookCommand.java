package review.interfacee;

public interface IBookCommand {
	void addBook ( Book newBook); // th�m s�ch
	Book findBookByID(int bookID); // t�m s�ch
	void updateBook(Book editBook);
}
