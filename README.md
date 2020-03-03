# Lifeway Test


Hello,
This is a spring boot app, the ide that was used to create it was IntelliJ but any ide of you choice to be used to import the project.

After the project is imported please run a maven install to download dependencies for compilation.

After get the app, the program can be invoked by hitting this endpoint:
http://localhost:8080/message?id=123&message=abc 
This should return a json with a count that is cumulative to the number of words in the message.

Since some time was giving I took some time to add some enhancements and will describe below:
1. Test Cases:      A small test was added to application.

2. Error handling:  If a endpoint is hit that was not explicitly exposed an customized error page will be displayed.
                    A Global exception handler was added for easy scalability of the application.
                    The application will return a custom Json error with status and code and message if the same id is detected.

3. A Swagger Page:  I was thinking about giving a Postman collection but the next best thing was to provide a swagger page
                    that is embedded into the app this can be reached at http://localhost:8080/swagger-ui.html This can be used as a                           Restclient tool to test the message endpoint and gives a nice UI.

4. Banner Txt:      During start up of the program to show pride and what LifeWay is about and what it has done.

5. AutoWiring:      This is springboot app why not take advantage of some Dependency Injection this is a power framework lets use it.
