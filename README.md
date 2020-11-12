# netflix
NETFLIX CLONE

Spring Boot, Data JPA, in-memory H2 db

Application Requires/Java Dependencies: Java JDK 1.8 Maven Spring Boot Spring Web Spring Data JPA H2 database(embedded)

Front end UI: Html,CSS

Build + Run: $ mvn install $ mvn clean spring-boot:run

Run the -war / -jar from target:

$ java -jar target/name-of-SNAPSHOT.jar Make sure to use java 1.8

java -version $ export JAVA_HOME="$(/usr/libexec/java_home -v 1.8)"

In-Browser : http://localhost:8080/

![Screenshot (7)](https://user-images.githubusercontent.com/51832145/98940103-7b1af200-2510-11eb-98f0-5daf717c19e3.png)
![Screenshot (8)](https://user-images.githubusercontent.com/51832145/98940107-7d7d4c00-2510-11eb-99f9-9f16551b6c4b.png)
![Screenshot (9)](https://user-images.githubusercontent.com/51832145/98940110-7d7d4c00-2510-11eb-84c7-5c6f9efebe1b.png)
![Screenshot (10)](https://user-images.githubusercontent.com/51832145/98940112-7eae7900-2510-11eb-9085-980dfc3a6ac8.png)

Requirements:
 	*Authenticate subscribers and admin
  
	*Have a page with admin-only access to upload the content.
		- No need of the video.
		- A general thumbnail and other details required list to content is enough
    
	*Design and implement the listing page for your OTT platform.
  
	*User should be able to filter the content with Genre, Language
  
	*User should also able to sort the content with rating, recently added
  
	*The user should be able to rate the content
  
	*Save all data offline (In Android/ web localstorage)

REQ 1: The authentications of subcribers and admin is done using h2 db.
	The admin username is "admin@gmail.com" and password is "root".{FINISHED}

REQ 2: admin can only upload content using upload button he can add title and URL for movie image{FINISHED}

REQ 3: Home page for the OTT platform is done.{FINISHED}

REQ 4: filter using the genre & lang is done.{FINISHED}

REQ 5: Due to time constraint not able to finish sorting by rating.{NOT FINISHED}

REQ 6:	Rating the content is done using a cookie,the key and value is stored for rating a content and is displayed in the next page from the cookie .{FINISHED}

REQ 7:	data is stored offline using a cookie.{FINISHED}

