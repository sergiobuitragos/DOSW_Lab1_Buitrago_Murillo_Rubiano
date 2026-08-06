DOSW_Lab1_Buitrago_Murillo_Rubiano
Lab 1 de Dosw

##Team Members
Sergio Daniel Buitrago
Miguel Angel Murillo
Juanita Rubiano

##Challenge Evidence
Challenge 1

<img width="525" height="229" alt="image" src="https://github.com/user-attachments/assets/3ad9dd12-69bb-4830-bc52-87a8ca629f33" />

Challenge 2

<img width="620" height="437" alt="image" src="https://github.com/user-attachments/assets/20717c13-77a0-4a67-a26a-6352424c5f32" />

Challenge 3

<img width="1307" height="381" alt="image" src="https://github.com/user-attachments/assets/717983fb-1eaf-4e30-9543-3f0d15f76d75" />

Challenge 4

<img width="896" height="600" alt="image" src="https://github.com/user-attachments/assets/a04ee4dc-c308-4f2b-a411-49a82bcc95b2" />


##Technical Explanations

Challenge 1

Class Student created with its attributes. Then, WelcomeMessage.java prints the message with all the requirements.

Challenge 2

The base class for the challenge was created, along with its subclasses, Lane 1 and Lane 2. The different methods were implemented for each subclass, resolving the conflicts that arose during the merge process.
Finally, yhe function that returns all the data from a pair of number lists was implemented.

Challenge 3

This challenge was completed through collaborative work using Git, simulating a real-world merge conflict between two developers. Each student created their own branch from the `develop` branch. The first student implemented a `mysteriousEcho` method that repeats a message three times using `StringBuilder`, while the second student implemented the same method to reverse the message using `StringBuffer`.

When the two branches were merged, Git generated a real merge conflict because both students had modified the same method with different implementations. The conflict was resolved manually by combining both approaches into a final version that first repeats the message three times (using `StringBuilder` and `stream()`) and then reverses the resulting string (using `StringBuffer`). The final method is invoked through a lambda expression using a method reference (`Challenge3::mysteriousEcho`).

The entire process—including the creation of independent branches, the merge conflict, and its manual resolution—is documented in the Git commit history.

Challenge 4

Challenge 4 implemented a treasure map system using both HashMap and Hashtable to store key-value pairs of type (String, Integer), ignoring duplicate keys and preserving the first value found. The work was divided between two students: Sergio implemented the HashMap method and Miguel implemented the Hashtable equivalent. Both maps were then combined using Java Streams with stream(), map(), Collectors.toMap() and sorted(), prioritizing Hashtable values on duplicate keys and converting all keys to uppercase in ascending order. A merge conflict occurred in Challenge4.java when both students modified the main method on diverged branches simultaneously, which was resolved manually by combining both versions into the final implementation.

##Conceptual Questionaire Answers
1. Team agreement:
   - Constant communication
   - Working on separate branches
   - Making clear commits
   - Meeting agreed-upon deadlines
2. git merge vs git rebase: Merging joins branches while preserving the history; rebasing reorganizes commits for a linear history
3. What happens if two branches modify the same line? R:A conflict arises that must be resolved manually
4. How do I view the branch history? R:git log --oneline --graph --all --decorate
5. Commit vs Push: commit saves changes locally; push sends them to the remote repository
6. git stash and git stash pop:stash temporarily saves changes; stash pop retrieves them
7. HashMap vs Hashtable: HashMap is faster and allows null; Hashtable is synchronized and does not allow null
8. Advantage of Collectors.toMap():Convert a collection into a map with less code and in a clearer way
9. What does stream().map() do?: Transforms each element and returns a new Stream
10. What does stream().filter() do?: Filters the elements based on a condition and returns a new Stream containing those that meet it
