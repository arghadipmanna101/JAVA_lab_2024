# Object-Oriented Programming Lab
Welcome to the Object-Oriented Programming Lab repository! Here, you'll find Java-based implementations of fundamental object-oriented programming concepts. Whether you're just starting with OOP or you're an experienced developer looking for reference code, this repository will guide you.

## Java Cheat Sheet
You can refer to a handy <a target="_blank" href="https://quickref.me/java">Java Cheat Sheet</a> for quick reference.

# How to Use Java on Replit.com
Replit is an online IDE that allows you to code and run Java directly in your browser. Here's a simple guide to get you started:

## Step 1: Start a New Repl
1. Go to Replit.com in your browser.
2. Sign up or log in to your account.
3. Click the ` + Create ` button to start a new project.

## Step 2: Select Java Template
1. Search for "Java" in the template section.
2. Select the Java template to proceed.

## Step 3: Set Up Your Repl
1. Give your project a name in the title field.
2. Click Create Repl to start coding.

## Step 4: Write Your Code
1. The file Main.java will be opened by default.
2. Enter your Java code into this file. Here's a basic example:

```java
  public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}
```

## Step 5: Run Your Code
1. Click the Run button to execute your Java program.
2. Check the console for output.
# Step 6: Explore & Share
1. Discover more features like collaborative coding and version control.
2. Share your project by clicking the Share button to generate a link.


##Example Program: Palindrome checking 
Here's a Java program that check the number is palindrome or not :

```java
import java.util.Scanner;

public class Test{
  public static void Prime(int n) {
    int c = 0;
    for (int i = 1; i<=(n/2); i++) {
      if (n%2==0){
        c++;
      }
    }
    if (c>1) {
      System.out.println(n+" Is Not a prime number");
      return;
    }
    System.out.println(n+" Is a prime number");
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    Prime(number);
    scanner.close();
  }
}
```
# Local Installation and Setup
If you prefer coding on your local machine, follow the steps below to set up Java and Visual Studio Code:

## 1. Install Java

### For Windows:
 * Download the [JDK installer](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) for Windows and follow the installation instructions.

### For macOS:
* Download the macOS version of the [JDK installer](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and complete the setup.

### For Linux:
* Open your terminal and run:

```bash
    sudo apt-get update
    sudo apt-get install default-jdk
```

## 2. Install VS Code (Optional)
You can install [Visual Studio Code](https://code.visualstudio.com/) as an optional IDE for coding.



# Running the Java Program Locally
After setting up Java, use these commands to compile and run your Java program:

```bash
  # Compile the Java program
  javac Main.java
  
  # Run the Java program
  java Main
```

Replace ` Main.java ` with the filename of your Java file.


# Contributing to This Project
We welcome contributions from the community! Here's how you can contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: ` git checkout -b your-feature-name`.
3. Commit your changes with a clear message.
4. Push to your fork: ` git push origin your-feature-name `.
5. Open a pull request to this repository.


## Steps to Fork and Contribute :
  
1. **Fork the repository:** Click on the "Fork" button on the repository page.
2. Clone your fork: In your terminal, clone your forked repository:
```bash
  git clone https://github.com/your-username/repository.git
```
3. ***Create a new branch:** Switch to your cloned repository and create a new branch:
```bash
  git checkout -b your-feature-name
```
4. ***Make changes and commit:*** After making changes, commit them:
```bash
  git add .
  git commit -m "Your descriptive message"
```
5. **Push your branch:** Push your changes:
```bash
 git push origin your-feature-name
```
6. **Create a pull request:** Navigate to your forked repository and submit a pull request for review.

## Happy coding!

<p align="center">
  <img src="https://i.giphy.com/media/v1.Y2lkPTc5MGI3NjExM2lpcjhhbGNzNDNkN21wdXlzZ2xvbmZtcTZwcHpqNXE0d3hpNnkxeCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/Dh5q0sShxgp13DwrvG/giphy.gif" width="400" height="200" alt="GIF">
</p>





