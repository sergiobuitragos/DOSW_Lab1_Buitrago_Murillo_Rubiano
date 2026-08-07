# DOSW_Lab1_Buitrago_Murillo_Rubiano

Lab 1 de Dosw

## Team Members

- Sergio Daniel Buitrago
- Miguel Angel Murillo Hurtado
- Juanita Rubiano Fernandez

## Challenge Evidence

### Challenge 1 – Welcome Message

#### Evidence
<img width="1083" height="279" alt="image" src="https://github.com/user-attachments/assets/0d3f3d3c-086c-49f1-8f36-d71993a8359d" />


#### Description
A Student class was created to store each team member's full name, age, institutional email, and current semester. A WelcomeMessage class was then implemented using Java Streams with stream(), map(), and collect() along with lambda expressions to iterate over a `List<Student>` and print a formatted welcome message for each member.

### Challenge 2 – Parallel Commit Race

#### Evidence
<img width="770" height="545" alt="image" src="https://github.com/user-attachments/assets/4177691c-c0e8-4f9f-a3e8-3dcf059a402d" />


#### Description
A ParallelRace class was implemented using lambda-based functions to process a list of integers. Lane One implemented a findMax lambda to return the largest number. Lane Two implemented findMin and countElements lambdas to return the smallest number and total element count. Both lanes were developed on separate branches and merged, generating intentional conflicts that were resolved manually.

### Challenge 3

#### Evidence
<img width="1264" height="361" alt="image" src="https://github.com/user-attachments/assets/c27ab2f2-9940-4a3d-a5c1-5eb53a022e47" />


#### Description
This challenge was completed through collaborative work using Git, simulating a real-world merge conflict between two developers. Each student created their own branch from the develop branch. The first student implemented a mysteriousEcho method that repeats a message three times using StringBuilder, while the second student implemented the same method to reverse the message using StringBuffer.

When the two branches were merged, Git generated a real merge conflict because both students had modified the same method with different implementations. The conflict was resolved manually by combining both approaches into a final version that first repeats the message three times (using StringBuilder and stream()) and then reverses the resulting string (using StringBuffer). The final method is invoked through a lambda expression using a method reference (Challenge3::mysteriousEcho).

The entire process—including the creation of independent branches, the merge conflict, and its manual resolution—is documented in the Git commit history.


### Challenge 4 – The Treasure of Duplicate Keys

#### Evidence
<img width="1109" height="746" alt="image" src="https://github.com/user-attachments/assets/21d8f4ac-339a-448d-a187-ef818549497d" />


#### Description
A Challenge4 class was implemented using both HashMap and Hashtable to store key-value pairs of type (String, Integer), ignoring duplicate keys and preserving the first value found. A merge method combined both maps using Stream.concat(), Collectors.toMap() and TreeMap to prioritize Hashtable values on duplicates, convert all keys to uppercase, and sort them in ascending order. A merge conflict was intentionally generated and resolved during the integration of both branches.


## Conceptual Questionnaire Answers
1. Team agreements: Each student works on their own computer and branch. 
Commits must be meaningful and traceable. All challenges must be merged into 
develop before merging to main. The branch history must be preserved at all times.

2. git merge vs git rebase: git merge combines two branches creating a new 
merge commit, preserving the full history. git rebase moves or replays commits 
from one branch on top of another, resulting in a cleaner linear history but 
rewriting commit history.

3. Same line conflict: When two branches modify the same line of a file, Git 
cannot automatically decide which version to keep and generates a merge conflict. 
The developer must manually resolve it by editing the file, removing the conflict 
markers and committing the resolved version.

4. Graphical branch history: You can display the branch and merge history 
graphically in the terminal using:
git log --oneline --graph --decorate --all

5. Commit vs Push: A commit saves changes locally in the repository history. 
A push uploads those local commits to the remote repository so others can access them.

6. git stash and git stash pop: git stash temporarily saves uncommitted changes 
without committing them, allowing you to switch branches with a clean working tree. 
git stash pop restores those saved changes back to the working directory.

7. HashMap vs Hashtable: HashMap is not synchronized, allows one null key and 
multiple null values, and is faster in single-threaded environments. Hashtable is 
synchronized (thread-safe), does not allow null keys or values, and is slower due 
to its thread-safety overhead.

8. Collectors.toMap() advantages: Collectors.toMap() allows transforming a 
stream directly into a Map in a declarative and concise way. It supports key/value 
mapping functions, merge functions for duplicate keys, and custom Map suppliers, 
avoiding the verbosity and error-proneness of traditional loops.

9. stream().map() operation: stream().map() performs an intermediate 
transformation operation. It applies a function to each element of the stream and 
returns a new stream with the transformed elements, without modifying the original collection.

10. stream().filter(): stream().filter() applies a predicate (boolean condition) 
to each element and returns a new stream containing only the elements that satisfy 
the condition. It is an intermediate operation that does not modify the original collection.

11.Creating a Feature Branch from develop
  11.1 Switch to develop
    git checkout develop,This is the branch where the team's in-progress work lives, before it goes to production.
  11.2 Update it to make sure you're starting from the latest version: git pull origin develop
  11.3 Create the new branch and switch to it in one step:
    git checkout -b feature/your-feature-name, This creates a copy of develop where you can work without affecting anyone else's work.      The -b flag tells Git to create the branch if it doesn't already exist.
  11.4 Work as usual: edit files, and save your progress with add and commit as many times as needed.
  11.5 Push the branch to the remote repository so your team can see it:
    git push -u origin feature/your-feature-name, This serves as a backup and gives your teammates visibility into your commits. 
  Atlassian
  This is the standard Git Flow pattern: develop holds changes before they're released, feature branches are created from it, and when     work is finished, they get merged back into develop.

12.  Difference between git branch and git checkout -b
    
git branch <name> only creates a new branch but keeps you on your current branch, while git checkout -b <name> creates the branch and switches to it in one step, equivalent to running git branch <name> followed by git checkout <name> — in modern Git (2.23+) this is also done with git switch -c <name>; in short, use git branch if you just want to set up a branch without moving into it, and checkout -b/switch -c when you want to create and jump into it right away, which is the more common case.

14.Developing in feature/* branches instead of directly on main matters because it encapsulates each feature so multiple developers can work without disturbing the main codebase, and it ensures main never contains broken code — a huge advantage for continuous integration; on top of that, isolating work this way limits the effect of unfinished changes on other team members until the change is actually ready to merge, and it enables pull requests, which give other developers the chance to review and sign off on a feature before it's integrated into the official project — that's exactly why many teams and platforms like GitHub and GitLab explicitly forbid pushing directly to main, in favor of merge/pull requests instead


Bibliography
- Atlassian Git Tutorial – Git Feature Branch Workflow
https://www.atlassian.com/git/tutorials/comparing-workflows/feature-branch-workflow

- Mergify – Feature Branch: A Quick Walk Through Git Workflow
https://articles.mergify.com/feature-branch-a-quick-walk-through-git-workflow/

- Hugging Face Datasets – git-prompt dataset (Git command reference/instructions)
https://huggingface.co/datasets/hesamation/git-prompt/viewer

- University of Washington, CSE 391 Course Materials – Git Branching Exercises
https://courses.cs.washington.edu/courses/cse391/24wi/lectures/5/questions


