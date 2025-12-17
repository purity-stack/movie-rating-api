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
for example:
PS C:\Users\hp> mvn -v
Apache Maven 3.9.12 (848fbb4bf2d427b72bdb2471c22fced7ebd9a7a1)
Maven home: C:\Users\hp\Documents\apache-maven-3.9.12
Java version: 21.0.9, vendor: Eclipse Adoptium, runtime: C:\Program Files\Eclipse Adoptium\jdk-21.0.9.10-hotspot
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
PS C:\Users\hp>

mvn spring-boot:run
for example:
cd C:\Users\hp\Document\movie-rating-api
mvn clean install -DskipTests
mvn spring-boot:run
PS C:\Users\hp> cd C:\Users\hp\Documents\movie-rating-api
PS C:\Users\hp\Documents\movie-rating-api> mvn clean install -DskipTests
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< com.movierating:movie-rating-api >------------------
[INFO] Building movie-rating-api 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- clean:3.3.2:clean (default-clean) @ movie-rating-api ---
[INFO] Deleting C:\Users\hp\Documents\movie-rating-api\target
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ movie-rating-api ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ movie-rating-api ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 7 source files with javac [debug release 17] to target\classes
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ movie-rating-api ---
[INFO] Copying 0 resource from src\test\resources to target\test-classes
[INFO]
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ movie-rating-api ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO]
[INFO] --- surefire:3.1.2:test (default-test) @ movie-rating-api ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- jar:3.3.0:jar (default-jar) @ movie-rating-api ---
[INFO] Building jar: C:\Users\hp\Documents\movie-rating-api\target\movie-rating-api-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot:3.2.0:repackage (repackage) @ movie-rating-api ---
[INFO] Replacing main artifact C:\Users\hp\Documents\movie-rating-api\target\movie-rating-api-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to C:\Users\hp\Documents\movie-rating-api\target\movie-rating-api-0.0.1-SNAPSHOT.jar.original
[INFO]
[INFO] --- install:3.1.1:install (default-install) @ movie-rating-api ---
[INFO] Installing C:\Users\hp\Documents\movie-rating-api\pom.xml to C:\Users\hp\.m2\repository\com\movierating\movie-rating-api\0.0.1-SNAPSHOT\movie-rating-api-0.0.1-SNAPSHOT.pom
[INFO] Installing C:\Users\hp\Documents\movie-rating-api\target\movie-rating-api-0.0.1-SNAPSHOT.jar to C:\Users\hp\.m2\repository\com\movierating\movie-rating-api\0.0.1-SNAPSHOT\movie-rating-api-0.0.1-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.706 s
[INFO] Finished at: 2025-12-17T04:17:21+03:00
[INFO] ------------------------------------------------------------------------
PS C:\Users\hp\Documents\movie-rating-api> mvn spring-boot:run
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------< com.movierating:movie-rating-api >------------------
[INFO] Building movie-rating-api 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> spring-boot:3.2.0:run (default-cli) > test-compile @ movie-rating-api >>>
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ movie-rating-api ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 0 resource from src\main\resources to target\classes
[INFO]
[INFO] --- compiler:3.11.0:compile (default-compile) @ movie-rating-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ movie-rating-api ---
[INFO] Copying 0 resource from src\test\resources to target\test-classes
[INFO]
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ movie-rating-api ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] <<< spring-boot:3.2.0:run (default-cli) < test-compile @ movie-rating-api <<<
[INFO]
[INFO]
[INFO] --- spring-boot:3.2.0:run (default-cli) @ movie-rating-api ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

2025-12-17T04:17:32.310+03:00  INFO 19440 --- [           main] c.movierating.MovieRatingApiApplication  : Starting MovieRatingApiApplication using Java 21.0.9 with PID 19440 (C:\Users\hp\Documents\movie-rating-api\target\classes started by hp in C:\Users\hp\Documents\movie-rating-api)
2025-12-17T04:17:32.316+03:00  INFO 19440 --- [           main] c.movierating.MovieRatingApiApplication  : No active profile set, falling back to 1 default profile: "default"
2025-12-17T04:17:33.838+03:00  INFO 19440 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-12-17T04:17:33.960+03:00  INFO 19440 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 102 ms. Found 1 JPA repository interface.
2025-12-17T04:17:35.116+03:00  INFO 19440 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2025-12-17T04:17:35.138+03:00  INFO 19440 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-12-17T04:17:35.139+03:00  INFO 19440 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.16]
2025-12-17T04:17:35.282+03:00  INFO 19440 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-12-17T04:17:35.286+03:00  INFO 19440 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2837 ms
2025-12-17T04:17:35.353+03:00  INFO 19440 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-17T04:17:35.750+03:00  INFO 19440 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:moviedb user=SA
2025-12-17T04:17:35.754+03:00  INFO 19440 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-17T04:17:35.779+03:00  INFO 19440 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:moviedb'
2025-12-17T04:17:36.042+03:00  INFO 19440 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-12-17T04:17:36.172+03:00  INFO 19440 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.3.1.Final
2025-12-17T04:17:36.259+03:00  INFO 19440 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2025-12-17T04:17:36.757+03:00  INFO 19440 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-12-17T04:17:36.857+03:00  WARN 19440 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2025-12-17T04:17:38.491+03:00  INFO 19440 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: create table movie (id bigint generated by default as identity, rating integer not null, title varchar(255), primary key (id))
2025-12-17T04:17:38.613+03:00  INFO 19440 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-12-17T04:17:39.365+03:00  WARN 19440 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-12-17T04:17:40.183+03:00  INFO 19440 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
2025-12-17T04:17:40.204+03:00  INFO 19440 --- [           main] c.movierating.MovieRatingApiApplication  : Started MovieRatingApiApplication in 8.922 seconds (process running for 10.023)

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






