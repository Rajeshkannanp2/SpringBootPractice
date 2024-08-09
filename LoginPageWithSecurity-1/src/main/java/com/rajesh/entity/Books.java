package com.rajesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="books")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int book_id;
	@Column(name="book_name")
	private String bookName;
	@Column(name="isbn")
	private String isbn;
	@Column(name="author")
	private String author;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Books() {
		super();
	}
	public Books(int book_id, String bookName, String isbn, String author) {
		super();
		this.book_id = book_id;
		this.bookName = bookName;
		this.isbn = isbn;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", bookName=" + bookName + ", isbn=" + isbn + ", author=" + author + "]";
	}

}
