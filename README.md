# Assignment 1 - Your First Application and Introduction to Git
## Due 9-26-2016

## Author
Jordan Koehler
## Description

Create a person counter. The UI should have a + button, and a - button as well as a textview to store the value of the current number.
When the app launches, the counter will be at zero. When the + button is pressed, it will increase the counter. When the - button is pressed, it will decrease the number.

If the counter goes above 20, the app will toast a message that it is over 20. This message will only appear when the counter goes over 20. It should not appear for every number over 20, and it should not appear when decrementing regardless of the current number.

Solution Requirements:

* A plus button
* A minus button
* A textview to show the counter
* A toast message when the counter goes above 20.

![alt text](http://barnesbrothers.homeserver.com/cis298/assignmentImages/assignment1.jpg "Application Layout")

### Notes

This application should be very similar to the first application in the book.

## Grading
| Feature          | Points |
| ---------------- | ------ |
| Plus Button      | 10     |
| Minus Button     | 10     |
| TextView         | 10     |
| Strings.xml      | 10     |
| Plus Works       | 15     |
| Minus Works      | 15     |
| TextView Updates | 15     |
| Toasts Correctly | 15     |
| Total            | 100    |

## Outside Resources Used
I did have to google how to cast an int into a string in Java as I've never used Java before. Other than that, just used the in class program for reference.
## Known Problems, Issues, And/Or Errors in the Program
Does what it's supposed to, but there is no save functionality at all so if you tip your phone (or Virtual phone, as it may be) it resets the counter.