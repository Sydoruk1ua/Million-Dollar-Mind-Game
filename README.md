"Million Dollar Mind Game" (What? Where? When?)
-------------------------------
## Sydoruk Oleksandr. 

### Used technologies and frameworks:
Spring Boot, MVC, Security, JPA <br>
Hibernate <br>
MySQL <br>

### Description of the project.
 System "What? Where? When?". The system consists of Experts and Judge. 
 Experts answer different types of questions (with and without answers). 
 The judge accepts the answers from the Experts, determines the correctness of the answer,
 and counts the point to the team of Experts (in the case of the correct answer) 
 or to the team of Viewers (if time is up, or to the answer is not correct). The judge may also,
 when requested from experts, give prompts of various types. <br>
 Services: <br>
 Time - marks the time between the beginning and the end of the question in accordance with configuration. <br>
 Prompts:<br>
• can deduce the probability of a correct answer (when choosing from several options),<br>
• or remove a few wrong options (when choosing from several options),<br>
• either give a text prompt (pre-attached to the question)<br>
• either give extra time, etc.<br>
 Statistics - displays statistics after the game. The format is determined by the configuration.<br>
 Configuration - controls the system settings: time, number of players, type of prompts, number of questions, etc.
 
 ### Install and run instructions
It is an interesting question, I will figure it out later. But you definitely should do the next: 
1. Install and run MysqlServer
2. Download the project
3. Run script ScriptToCreateAndFillDB from folder src/main/resources/dbscripts to create DB (database "mdmg", user "root" and password "password")
 
 Users for tests: <br>
 **User name**: `admin@gmail.com` **password**: `admin1pasS1!` <br>
 **User name:**  `judge@gmail.com` **password**: `judge1pasS1!` <br>
 **User name:**  `user1@gmail.com` **password**: `user1pasS1!` <br>
 **User name:**  `user2@yandex.ru` **password**: `user2pasS1!` <br>
 