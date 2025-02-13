# **2025-OBJPROG-LAB011**
Week 03-04 - Conditional and Looping Statements

Laboratory # 11 - Guided Coding Exercise 5: Integrated Control and Looping Application – Number Classifier Menu

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 11 - Guided Coding Exercise 5: Integrated Control and Looping Application – Number Classifier Menu**

   **Objective:**
   - Combine selection statements and looping constructs in an integrated application.
   - Solve a problem by classifying numbers and allowing repeated user interaction.

   **File Naming Convention:**
   - `NumberClassifierMenu.java`

   **Desired Output (with day = 4 and grade = 'B'):**
   ```txt
   === Number Classifier Menu ===
   1. Classify a number as positive, negative, or zero
   2. Print a multiplication table for a given number
   3. Exit
   Enter your choice (1-3): 1
   Enter a number to classify: 5
   The number 5 is positive.
   It is an odd number.
   Do you want to return to the menu? (Y/N): Y
   
   === Number Classifier Menu ===
   1. Classify a number as positive, negative, or zero
   2. Print a multiplication table for a given number
   3. Exit
   Enter your choice (1-3): 2
   Enter a number to display its multiplication table: 3
   Multiplication Table for 3:
   3 x 1 = 3
   3 x 2 = 6
   3 x 3 = 9
   3 x 4 = 12
   3 x 5 = 15
   3 x 6 = 18
   3 x 7 = 21
   3 x 8 = 24
   3 x 9 = 27
   3 x 10 = 30
   Do you want to return to the menu? (Y/N): Y
   
   === Number Classifier Menu ===
   1. Classify a number as positive, negative, or zero
   2. Print a multiplication table for a given number
   3. Exit
   Enter your choice (1-3): 3
   Exiting the program. Goodbye!
   ```

   **Notable Observations (to be discussed after completing the exercise):**
   - This program combines various control flow mechanisms to create a more complex and interactive application.
   - The use of a menu provides a user-friendly interface.
   - The do-while loop ensures the menu is displayed at least once.

   **Java Programming Best Practices:**
   - Use descriptive variable names.
   - Add comments to explain your code.
   - Indent your code consistently.
   - Validate user input to prevent errors (this example has minimal input validation, but it's important in real applications).
   - Close resources like Scanner when you're finished with them.
      
   **Step-by-Step Instructions:**

   1. Setup Class and Main Method
      - Create a file named `NumberClassifierMenu.java`.
      - Import the `Scanner` class at the top.
      - Define the class `NumberClassifierMenu` and the `main` method.
      ```Java
      import java.util.Scanner;
      
      public class NumberClassifierMenu {
          public static void main(String[] args) {
      
          }
      }
      ```
            
   2. Create Scanner Object and Choice Variable
      - Inside main, create a Scanner object named input.
      - Declare a character variable named userChoice to store the user's choice for continuing or exiting.
      ```Java
      Scanner input = new Scanner(System.in);
      char userChoice;
      ```

   3. Switch Statement for Day of the Week
      - Start a do-while loop to allow the menu to be displayed repeatedly.
      ```Java
      do {
          // Menu and logic will go here
      } while (userChoice == 'Y'); // Condition to continue
      ```

   4. Display Menu Options
      - Inside the do-while loop, print the menu options:
         "=== Number Classifier Menu ==="
         "1. Classify a number as positive, negative, or zero"
         "2. Print a multiplication table for a given number"
         "3. Exit"
         "Enter your choice (1-3): "
      ```Java
      System.out.println("\n=== Number Classifier Menu ===");
      System.out.println("1. Classify a number as positive, negative, or zero");
      System.out.println("2. Print a multiplication table for a given number");
      System.out.println("3. Exit");
      System.out.print("Enter your choice (1-3): ");
      ```

   5. Read User Choice
      - Use input.nextInt() to read the user's menu choice and store it in an integer variable named choice.
      ```Java
      int choice = input.nextInt();
      ```

   6. Switch Statement for Menu Handling
      - Create a switch statement to handle the different menu choices (choice).
      ```Java
      switch (choice) {
          case 1: 
              // Code for option 1
              break;
          case 2:
              // Code for option 2
              break;
          case 3:
              // Code for option 3
              break;
          default:
              // Handle invalid choice
      }
      ```

   7. Case 1: Classify Number
      - Inside case 1:
         - Prompt the user to enter a number: "Enter a number to classify: "
         - Read the number using input.nextInt() and store it in an integer variable number.
         - Use an if-else if-else block to classify the number as positive, negative, or zero.
         - Add an additional if-else to check if the number is even or odd using the modulus operator (%).
      ```Java
      System.out.print("Enter a number to classify: ");
      int number = input.nextInt();
      // Use if–else selection to classify the number.
      if (number > 0) {
         System.out.println("The number " + number + " is positive.");
      } else if (number < 0) {
         System.out.println("The number " + number + " is negative.");
      } else {
         System.out.println("The number is zero.");
      }
      // Demonstrate additional boolean expression: check if the number is even.
      if (number % 2 == 0) {
         System.out.println("It is also an even number.");
      } else {
         System.out.println("It is an odd number.");
      }
      ```

   8. Case 2: Multiplication Table
      - Inside case 2:
         - Prompt the user to enter a number for the table: "Enter a number to display its multiplication table: "
         - Read the number using input.nextInt() and store it in an integer variable tableNumber.
         - Print "Multiplication Table for [tableNumber]:"
         - Use a for loop to iterate from 1 to 10. Inside the loop, print each multiplication line (e.g., "3 x 1 = 3").
      ```Java
      System.out.print("Enter a number to display its multiplication table: ");
      int tableNumber = input.nextInt();
      System.out.println("Multiplication Table for " + tableNumber + ":");
      // Use a for loop for table generation.
      for (int i = 1; i <= 10; i++) {
         System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
      }
      ```

   9. Case 3: Exit
      - Inside case 3, print "Exiting the program. Goodbye!".
```Java
// Option 3: Exit the program.
System.out.println("Exiting the program. Goodbye!");
```

   10. Case 3: Exit
      - In the default case, print "Invalid option. Please choose between 1 and 3."
```Java
System.out.println("Invalid option. Please choose between 1 and 3.");
```

   11. Ask to Continue
      - After the switch block, ask the user if they want to continue: "Do you want to return to the menu? (Y/N): "
      - Use input.nextLine() to consume the leftover newline.
      - Read the user's response using input.nextLine(), convert it to uppercase, and store the first character in userChoice.
```Java
System.out.print("Do you want to return to the menu? (Y/N): ");
input.nextLine(); // Consume newline
userChoice = input.nextLine().toUpperCase().charAt(0);
```

   12. Close Scanner
      - Outside the do-while loop, close the Scanner object using input.close();.
```Java
input.close();
```

   13. Compile and Run
       - Save the file as `NumberClassifierMenu.java`.
       - Compile the code using `javac NumberClassifierMenu.java` in your terminal or command prompt.
       - Run the compiled code using `java NumberClassifierMenu`.

   **Conclusion**
   This exercise demonstrates how to integrate selection statements (if, if-else, switch) and looping constructs (do-while, for) to create a more sophisticated program.  By combining these elements, you can build interactive applications that solve problems and provide a better user experience.  This exercise reinforces the importance of planning your program logic, using appropriate control flow mechanisms, and following Java best practices for clean, efficient, and maintainable code.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 04 - Session 01 - Exercise 05"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
