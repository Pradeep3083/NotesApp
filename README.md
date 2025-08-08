# 📒 NotesApp - Java File I/O Project

A simple **text-based Notes Manager** built in Java using **FileWriter**, **BufferedWriter**, **FileReader**, and **BufferedReader**.  
This program allows you to **add notes** and **view saved notes** directly from a text file.

## 🚀 Features
- Add a new note (saved in `notes.txt`)
- View all saved notes
- Data persists even after the program is closed
- Uses **try-with-resources** for automatic file closing
- Handles exceptions like `IOException` and `FileNotFoundException`

## 🛠 Technologies Used
- Java
- File I/O (`FileWriter`, `BufferedWriter`, `FileReader`, `BufferedReader`)
- Exception Handling

## 📂 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/NotesApp.git
2. Open a terminal inside the project folder.
3. Compile and Run the code
   ```bash
   javac NotesApp.java
   java NotesApp

## 📸 Example Output
```text
===== Notes Manager =====
1. Add a Note
2. View Notes
3. Exit
Enter choice: 1
Enter your note: Learn Java File I/O
Note saved successfully!

===== Notes Manager =====
1. Add a Note
2. View Notes
3. Exit
Enter choice: 2

--- Your Notes ---
- Learn Java File I/O
```
## Concepts learned
- File writing with append mode
- Reading files line-by-line
- Using try-with-resources
- Exception handling in Java
