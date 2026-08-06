# DOSW_Lab1_Buitrago_Murillo_Rubiano

Lab 1 de Dosw

## Team Members

- Sergio Daniel Buitrago
- Miguel Angel Murillo Hurtado
- Juanita Rubiano

## Challenge Evidence

### Challenge 1 – Welcome Message

#### Evidence
![alt text](image-7.png)

#### Description
A Student class was created to store each team member's full name, age, institutional email, and current semester. A WelcomeMessage class was then implemented using Java Streams with stream(), map(), and collect() along with lambda expressions to iterate over a `List<Student>` and print a formatted welcome message for each member.

### Challenge 2 – Parallel Commit Race

#### Evidence
![alt text](image-6.png)

#### Description
A ParallelRace class was implemented using lambda-based functions to process a list of integers. Lane One implemented a findMax lambda to return the largest number. Lane Two implemented findMin and countElements lambdas to return the smallest number and total element count. Both lanes were developed on separate branches and merged, generating intentional conflicts that were resolved manually.

### Challenge 3

#### Evidence
![alt text](image-5.png)

#### Description
This challenge was completed through collaborative work using Git, simulating a real-world merge conflict between two developers. Each student created their own branch from the develop branch. The first student implemented a mysteriousEcho method that repeats a message three times using StringBuilder, while the second student implemented the same method to reverse the message using StringBuffer.

When the two branches were merged, Git generated a real merge conflict because both students had modified the same method with different implementations. The conflict was resolved manually by combining both approaches into a final version that first repeats the message three times (using StringBuilder and stream()) and then reverses the resulting string (using StringBuffer). The final method is invoked through a lambda expression using a method reference (Challenge3::mysteriousEcho).

The entire process—including the creation of independent branches, the merge conflict, and its manual resolution—is documented in the Git commit history.


### Challenge 4 – The Treasure of Duplicate Keys

#### Evidence
![alt text](image-4.png)

#### Description
A Challenge4 class was implemented using both HashMap and Hashtable to store key-value pairs of type (String, Integer), ignoring duplicate keys and preserving the first value found. A merge method combined both maps using Stream.concat(), Collectors.toMap() and TreeMap to prioritize Hashtable values on duplicates, convert all keys to uppercase, and sort them in ascending order. A merge conflict was intentionally generated and resolved during the integration of both branches.


## Conceptual Questionnaire Answers