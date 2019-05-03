The aim of this exercise is to make and retrieve the bookings for a ticketing firm.

# Spring-boot-exercise
1. Create a new spring-boot project
     * Select Web and Thymeleaf as dependencies
1. Create a thymeleaf template for booking. Use the booking.html file in this project
1. Create a Booking Controller to create the following APIS
     * /bookedseats API should return the view created in thymeleaf
        *  It should read the message attribute from url and add to the model in attribute "message"
        *  It should populate the model with attribute "bookings" with the list of all bookings
     * /book 
        * It must be a POST request
        * It must accept optional parameters name1,name2,name3,name4,name5,name6
        * After booking the seats, it should add "success" attribute in the model, and redirect to the first API
        
PS :
 * Please make use of a good architecture (Services and repositories)
 * You can use in memory storage for this exercise


      
