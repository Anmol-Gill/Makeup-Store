# Makeup-Store
Makeup Store: Spring Boot Web Application
Description
This is a Spring Boot web application for managing a makeup store. It allows users to sign up, log in, browse products, place orders, and manage their account. The backend is powered by MySQL with JPA and Hibernate ORM, and the frontend uses HTML, CSS, and JavaScript.

Features
User Authentication: Secure login and sign-up with BCrypt password hashing.
Product Management: Create, read, update, and delete makeup products.
Order Management: Users can place and view orders.
Database Integration: Uses MySQL for data storage.
Unit Testing: Repository and service methods tested with JUnit 5 and Mockito.
Project Structure
scss
Copy code
src
├── main
│   ├── java/com/anmolgill/myapp
│   │   ├── config
│   │   ├── controller
│   │   ├── model
│   │   ├── repository
│   │   ├── service
│   │   └── util
│   └── resources
│       ├── static (for CSS, JS)
│       └── templates (for HTML pages)
└── test (for unit tests)
