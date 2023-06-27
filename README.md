# homefy
Java project for tenant business

Welcome to Homefy app. 

Steps to install -> 

1. You need MySQL WorkBench and a Java IDE. 
2. Open up your MySQL WorkBench app and import the "homefyDB.sql" script. 
3. Run the script to create the login database. 
4. Go to the folder "projectProgra" and open it with your IDE.
5. Inside the IDE, open up the "Projects" section, from here find the "projectProgra" application. 
6. Open the "Source Packages" -> "Clases" -> "ConectionDB.java" class. 
7. In here you need to change the following variables for Homefy to work in your local computer.

   String usuario = "root"; //This is the MySQL username. 
   String contrasena = "1234"; //This is the MySQL password. 
   String bd = "homefy"; //The name of the Database that you created, in the script its already set, so only change it if necessary.  
   String ip = "localhost"; //This is from the ip MySQL uses for the localhost. 
   String puerto = "3306"; //This is the port that MySQL uses. 

