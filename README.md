🎯  Project Title: Quiz Application

A fully functional Quiz API built using Spring Boot and MySQL. It provides endpoints to create, manage, and attempt quizzes. Designed with modular structure and RESTful principles.

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🧰  Tech Stack Used

• Java 17  
• Spring Boot  
• Spring Data JPA  
• MySQL  
• Maven  
• RESTful APIs  

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

📁  Folder Structure

• controller → REST controllers for managing quizzes and questions  
• dao → Interfaces for database operations  
• model → Entity and wrapper classes  
• service → Business logic  
• resources → Configuration files  
• QuizApplication.java → Main class to run the Spring Boot app  

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🔧  Setup Instructions

➊  Clone the repository  
  git clone https://github.com/shahabaj101299/quiz-api  
  

➋  Create the database in MySQL  
  Database name: questiondb

➌  Update application.properties with your DB credentials  
  spring.datasource.username=your_username  
  spring.datasource.password=your_password

➍  Run the application  
  mvn spring-boot:run

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🌐  REST Endpoints

📌  Question Controller (`/question`)

• GET  /allQuestions → Fetch all questions  
• GET  /byCategory/{category} → Filter questions by category  
• POST /addQuestion → Add a new question  
• PUT  /updateQuestion → Update an existing question  
• DELETE /deleteById/{id} → Delete question by ID  

📌  Quiz Controller (`/quiz`)

• POST /create?category=Java&title=JavaQuiz → Create a quiz by category  
• GET  /getQuiz/{id} → Fetch questions of a quiz  
• POST /submit/{id} → Submit quiz and get score  

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

✨  Features

• Randomized question selection per quiz  
• Score evaluation on submission  
• Clean separation of data and logic  
• RESTful design for easy integration  
• Devtools enabled for hot reloads  
• Scalable structure for future enhancements  

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

🚀  Future Enhancements

• Integrate Swagger UI for API documentation  
• Add front-end using React/Angular  
• Add user login and authentication  
• Timer and negative marking  
• Track scores and history  

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

👤  Developer Info

• Name: Shahbaz Shaikh  
• GitHub: https://github.com/shahbaz101299  
• LinkedIn: https://www.linkedin.com/in/shahbaz101299/

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━


