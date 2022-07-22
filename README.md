# Quadwave-Backend


# Tech Used
1. Spring Boot (version 2.7.1)
2. Spring Data JPA
3. Hibernate 5.5
4. MySQL Database
5. Maven(version 3.8.5)
6. Lombok (version 1.18.24)
7. IDE : Spring Tool Suite 
8. Java Version : 17.0.3
9. Postman (version 9.4)

# Architecture
1. Controller layer
2. Service layer
3. Repository layer
4. Model layer

# Steps 
1. Created 3 controllers 
2. Created get, post, and delete mapping for the endpoints.
3. From Controller the program flow goes to the service class.
4. Created a service class.
5. Now from service class, the program flow goes to the repository class.
6. Created a repository interface that implements CrudRepository.
7. Created a entity class(pojo)
8. Table creation are done using hibernate.
9. Getter, Setter and Constructors are provided using lombok annotations.



# Logging 
1. Injected the logging framework Log4j2 in this project.
2. In resources, created Log4j2.properties file that contains all the information for the logging.
3. The logging level is info.
4. Destination is console and external log file in the drive.
5. For all the endpoints, loggings will be done.

#ER 
<img src = "https://github.com/Siddhanttimeline/Quadwave-Backend/blob/main/ER%202.png ">
