# ISBN Checker
The International Standard Book Number (ISBN) is a unique identifying number given to each published book. 
This project is a checker to see if the ISBN is valid or not.

## Requirements 
+ Java Development Kit (JDK) installed on your system.

## Usage 
+ Clone or download the repository. 
+ Compile the program using the following command:
```
javac ISBNChecker.java
```
+ Run the program using the following command:
```
java ISBNChecker
```
+ Enter the ISBN you want to validate and hit enter. The program will output either 
"Valid" if the ISBN is valid, or a 13-digit ISBN if the 10-digit ISBN is valid.

## Code Explanation 
The program uses the JOptionPane class to request the ISBN from the user. It then 
passes the ISBN to the checkISBN method, which checks the length of the ISBN and performs 
calculations to determine if it's valid or not. If the ISBN is 10 digits long, the program 
generates a 13-digit ISBN if it's valid. If the ISBN is 13 digits long, the program outputs 
"Valid" if it's valid.

## Contribute 
If you have any suggestions or improvements for the program, feel free to open a pull request.
