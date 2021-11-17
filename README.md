# LibraryApp
RESTful API for a library management application
* A RESTful API for a Library Management Application
* The resources includes Book and Category

## Features
* Add a category
* List Categories
* Add a Book
* List Books
* Edit details of a Book
* Add books to a category
* Delete a book

## Setup Configuration
* Create a new database with the name 'libraryappdb' in your local MySql. 
* You may update the database name, username, and password in the file application via 'application.properties' in the resources folder. 
* Run application locally and ensure succesful connection to the local mysql db

### Action: Add a category
* Adding a category named Programming Languages

<img src="screenshots/programming_category.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a category named Software Architecture

<img src="screenshots/software_architecture.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a category named Fiction

<img src="screenshots/fiction.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a category named Networking

<img src="screenshots/networking.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a category named Research

<img src="screenshots/research.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---


### Action: Display all categories
* Displaying all available categories

<img src="screenshots/display_all_categories.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Add a book
* Adding a book titled Python Language

<img src="screenshots/python_book.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a book titled Go Language
<img src="screenshots/go_book.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

* Adding a book titled Java Language
<img src="screenshots/java_book.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Display all books
* Displaying all available books

<img src="screenshots/display_all_books.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Display a specific book
* Displaying a specific book titled Python Language

<img src="screenshots/specific_python.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---
* Displaying a specific book titled Go Language

<img src="screenshots/specific_go.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Edit a specific book
* Make changes to the details of a specific book titled Python Languages

<img src="screenshots/edit_specific_python.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Display all books 
* Displaying all available books with changes made

<img src="screenshots/display_new_all_books.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Delete a book
* Delete a book titled Java Languages

<img src="screenshots/delete_book_java.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Display all books 
* Displaying all available books with changes made

<img src="screenshots/display_deleted_all.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Add a book to a category
* Adding a book titled Python Language Deep Dive to a category named Programming Languages

<img src="screenshots/python_to_category.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

### Action: Display all books 
* Displaying all available books with changes made

<img src="screenshots/display_category_added_all.png"
     alt="Initial GET request"
     style="float: left; margin-right: 10px;" />

---

## Used
* Spring Boot
* Spring Data JPA
* Maven
* Mysql
* Mysql Workbench
* Postman

