# movie-rating-api
A simple Spring Boot API to manage movies with in-memory storage. Supports GET, POST, PUT, DELETE endpoints and fully integrated with Swagger UI for testing.It has these languages in itJava, Spring Boot, Maven

## 1️⃣ Project Overview
**Objective:**  
Build a simple Movie Rating API that allows users to create, view, update, and delete movies along with their ratings. This project helps beginners understand how backend APIs work, how data is sent and received over HTTP, and how Spring Boot simplifies backend development.

**Key Technologies:**
- **Java** – Programming language
- **Spring Boot** – Backend framework
- **Spring Web** – For building RESTful APIs
- **Maven** – Dependency and project management
- **Swagger UI** – For testing API endpoints
- **Git & GitHub** – Version control and code hosting

**Why These Tools?**
- **Java:** Widely used in enterprise backend systems; stable and high-performance  
- **Spring Boot:** Reduces boilerplate, auto-configures servers, simplifies REST APIs  
- **Maven:** Manages dependencies and project structure  
- **Swagger UI:** Test and document APIs easily  
- **Git & GitHub:** Version control and collaboration

The API uses **in-memory storage**, so no database setup is required.

---

## 2️⃣ Technology Stack

| Layer                 | Technology             |
|----------------------|----------------------|
| Programming Language  | Java                  |
| Framework             | Spring Boot           |
| Build Tool            | Maven                 |
| API Documentation     | Swagger UI            |
| Version Control       | Git & GitHub          |

---

## 3️⃣ System Requirements
- **OS:** Windows, MacOS, or Linux  
- **Java:** JDK 17+  
- **Maven:** 3.x+  
- **Browser:** Any modern browser for Swagger UI  
- **Optional Tools:** IDE (Eclipse, IntelliJ, VS Code), Postman  

---

## 4️⃣ Prerequisites
- **Java JDK 17+** → Run the Spring Boot API  
- **Maven** → Build project & manage dependencies  
- **Git** → Version control  
- **IDE (Optional)** → Eclipse, IntelliJ, VS Code  
- **Browser** → Access Swagger UI  
- **Postman (Optional)** → Test APIs outside Swagger  

---

## 5️⃣ Clone the Project
```bash
git clone https://github.com/purity-stack/movie-api.git
cd movie-api
6️⃣ Project Structure
css
Copy code
docs/                → Guides and troubleshooting
src/main/java        → Controllers, models, services
src/main/resources   → Configuration files (application.properties)
.gitignore           → Ignore unnecessary files
pom.xml              → Maven dependencies
README.md            → Project description
7️⃣ Build & Run the Project
bash
Copy code
cd "C:\path\to\movie-api"
mvn clean install
mvn spring-boot:run
OR using jar:

bash
Copy code
java -jar target/movie-rating-api-0.0.1-SNAPSHOT.jar
You should see:

css
Copy code
Started MovieRatingApiApplication in X seconds
8️⃣ Access Swagger UI
Open your browser:

bash
Copy code
http://localhost:8080/swagger-ui/index.html
Endpoints:

GET /movies → Fetch all movies

POST /movies → Add a movie
Example JSON for POST:

json
Copy code
{
  "title": "Inception",
  "rating": 9
}
9️⃣ Testing via Postman (Optional)
GET all movies: GET http://localhost:8080/movies

POST a movie: POST http://localhost:8080/movies
Body → raw → JSON:

json
Copy code
{
  "title": "Avatar",
  "rating": 5
}
🔟 Common Tasks
Task	Endpoint
Add new movie	POST /movies
Get all movies	GET /movies
Get movie by ID	GET /movies/{id}
Update movie	PUT /movies/{id}
Delete movie	DELETE /movies/{id}

11️⃣ Common Issues & Fixes
Maven not recognized: Set JAVA_HOME and install Maven

Swagger UI not loading: Make sure server is running

Port 8080 in use: Stop other apps or change server.port

Git push rejected / merge conflicts: Pull with --allow-unrelated-histories, resolve conflicts, commit, push

JSON POST fails: Check format, include title & rating

LF/CRLF warnings: Safe to ignore on Windows

12️⃣ Git Commands for Beginners
bash
Copy code
git status           # See changes
git add .            # Stage files
git commit -m "msg"  # Commit changes
git push origin main # Push to GitHub
git pull origin main # Pull updates from GitHub
13️⃣ C++ → Java Comparison
Feature	C++	Java
Paradigm	Multi-paradigm	Object-oriented (some functional features)
Type System	Statically typed, value/reference types	Statically typed, everything is object
Memory Management	Manual / smart pointers	Automatic GC
Compilation	Native	Bytecode → JVM
Platform	Platform-dependent	Platform-independent (JVM)
Threads	OS dependent	Built-in via java.util.concurrent
Popularity (2025)	Games, finance, OS	Enterprise, Android, web backends

14️⃣ References
Spring Boot Guide

Swagger UI Docs

Postman Tutorials

Java 17 Documentation






