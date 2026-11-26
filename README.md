# Banking & Account Microservices System (`BankAccountUserNoSecurity`)

## Project Description
A modular Spring Boot microservices architecture isolating `Account`, `Bank`, and `User` banking operations into independent deployable services coordinated by a central discovery `Server` and `Connection` configuration module.

## Tech Stack Used
- **Language:** Java 17
- **Frameworks:** Spring Boot, Spring Cloud, Spring Web, Spring Data JPA
- **Database:** MySQL
- **Build & Tools:** Maven, RESTful APIs, Postman

## Key Features & Architecture
- **Service Registry (`Server`):** Central registry (`ServerApplication`) managing service discovery across modules.
- **Connection Layer (`Connection`):** Dedicated `ConnectionConfiguration` standardizing inter-service communication.
- **Domain Microservices (`Account`, `Bank`, `User`):** Isolated controllers, service implementations, JPA repositories (`AccRepo`, `BankRepo`, `UserRepo`), and custom `NotFoundExeption` handling.

## Setup & Installation
1. Clone: `git clone https://github.com/Lrssrrb/BankAccountUserNoSecurity.git && cd BankAccountUserNoSecurity`
2. Update MySQL datasource credentials in `src/main/resources/application.properties` inside `Account`, `Bank`, and `User`.
3. Start `Server`, then `Connection`, then `Account`, `Bank`, and `User` via `./mvnw spring-boot:run`.