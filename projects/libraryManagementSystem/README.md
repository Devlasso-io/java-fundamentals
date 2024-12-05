# Library Management System

A Java console application that simulates a library management system. This project will help you practice Object-Oriented Programming concepts, collections, file handling, and exception management.

## Project Overview

### Core Features

- Book management (add, remove, search)
- Member management (register, update, remove)
- Borrowing system (checkout, return, reserve)
- Fine calculation for overdue books
- Basic reporting system

### Learning Objectives

- Implementing OOP principles (Inheritance, Encapsulation, Polymorphism, Abstraction)
- Working with Collections Framework
- Exception handling
- File I/O operations
- Date and Time manipulation

## Project Structure

### Classes to Implement

1. **Book Class**

   - Properties:
     - ISBN (unique identifier)
     - Title
     - Author
     - Genre
     - Status (available, borrowed, reserved)
     - Publication year
   - Methods:
     - Getters and setters
     - toString() override
     - equals() and hashCode() override

2. **Member Class**

   - Properties:
     - Member ID (unique identifier)
     - Name
     - Contact information
     - Borrowed books list
     - Fine amount
   - Methods:
     - Borrow book
     - Return book
     - Pay fine
     - Get borrowing history

3. **Library Class**
   - Properties:
     - Books collection
     - Members collection
     - Transaction records
   - Methods:
     - Add/remove books
     - Register/remove members
     - Process borrowing
     - Process returns
     - Search functionality
     - Generate reports

### Bonus Challenges

1. Implement data persistence using file storage
2. Add a basic GUI using JavaFX
3. Implement a reservation system
4. Add email notification system
5. Create unit tests

## Implementation Steps

1. **Setup Project Structure**

   - Create necessary packages
   - Set up main classes
   - Initialize Git repository

2. **Implement Basic Classes**

   - Create Book class with basic attributes
   - Create Member class with basic functionality
   - Implement Library class as the system manager

3. **Add Core Functionality**

   - Implement book management
   - Add member management
   - Create borrowing system
   - Add search functionality

4. **Enhance the System**

   - Add fine calculation
   - Implement reporting
   - Add data validation
   - Handle edge cases

5. **Testing**
   - Create test cases
   - Validate all functionalities
   - Fix bugs and edge cases

## Best Practices to Follow

- Use meaningful variable and method names
- Add proper documentation
- Implement error handling
- Follow Java coding conventions
- Write clean, maintainable code

## Assessment Criteria

- Code organization and structure
- Proper implementation of OOP concepts
- Error handling and input validation
- Code documentation
- Additional features implementation
