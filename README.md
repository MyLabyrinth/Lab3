# Lab 3

## Recap: Lab (Github) Workflow 📝 - How to Work on Labs

Follow these steps for every lab carefully to access, complete, and submit your assignment. Please make sure you write your code in the correct file. **Do NOT edit or adjust any files that has the word "Test" in the name. Failure to do may result in receiving a 0 in this lab.**

1.  **Accept the Assignment**

    - Open the Lab Assignment Link the professor provided.
    - Click **"Accept the assignment"**. This will create your personal assignment repository on GitHub under the correct organization for the semester.
    - You'll be taken to your repository page. Verify that the URL looks like `github.com/organization-this-semester/lab-number-yourusername`.

2.  **Clone the Repository to Your Computer**

    - On your repository page, click the blue **`<> Code`** button.
    - In the dropdown menu, choose **"Open with GitHub Desktop"**.
    - GitHub Desktop will launch. Choose a preferred local folder on your computer to save the project and click **"Clone"**.
    - If asked "How are you planning on using this fork?", select **"For my own purpose"** and continue.

3.  **Open in VS Code and Start Coding**

    - In GitHub Desktop, ensure the "Current repository" is the one for this lab.
    - Click the **"Open in Visual Studio Code"** button.
    - VS Code will open the project folder. You can now begin writing your solutions in the `Lab02.java` file.

4.  **Save and Submit Your Work**

    - **Commit (Save) Changes**: As you work, save your file in VS Code (`Ctrl+S` or `Cmd+S`). To record your progress, go to the **Source Control** tab (the fork icon) on the left sidebar in VS Code. Type a descriptive message in the message box (e.g., "Finished Task 1 and 2") and click **"Commit"**. You must enter a message.
    - **Push (Submit) to GitHub**: When you are finished with the lab or want to back up your work, go back to GitHub Desktop. Click the **"Push origin"** button at the top of the window. This sends your committed changes from your computer to your GitHub repository online.

5.  **Verify Your Submission**
    - After you push, you can click **"View on GitHub"** in GitHub Desktop to open your repository in the browser.
    - On the GitHub website, make sure you are viewing the `main` branch and confirm that all of your latest code is visible.

---

## Lab 3 Tasks

## Task 1: Square Feet

**Objective:** Ask the user for the width and the length of a rectangle, then calculate and print its area. The formula is `area = width * length`.

### Example Output

```
Width: 10
Length: 20
The area is: 200
```

---

## Task 2: How Many Minutes?

**Objective:** Ask the user for a number of hours and a number of minutes, then print the total number of minutes. Remember that one hour has 60 minutes.

### Example Output

```
Number of hours: 3
Number of minutes: 15
The total number of minutes is: 195
```

---

## Task 3: Use the Force Harry!

**Objective:** Ask the user for a total number of minutes and convert it into hours and minutes. For example, all the Harry Potter movies are 1,179 minutes long.

**Hint:** You will need to use the division (`/`) and modulo (`%`) operators to solve this.

### Example Output

```
Total minutes: 1179
Total time: 19 hours 39 minutes
```

---

## Task 4: What’s Your Name?

**Objective:** Ask the user for their first name and their last name, and then print their full name.

### Example Output

```
What is your first name: Sarah
What is your last name: Lin
Your full name is: Sarah Lin
```

---

## Task 5: Mad Libs

**Objective:** Create a simple Mad Libs game. You will ask the user for a noun, a verb, a place, and an adjective, and then use their answers to create a story.

### Example Output

```
Enter a noun: dog
Enter a verb: walk
Enter a place: school
Enter an adjective: smart
A dog took a walk by school because they were smart.
```

---

## Task 6: DPS

**Objective:** In video games, DPS stands for Damage Per Second. Ask the user for a character's name, their DPS, and the number of seconds they attack. Then, print out the total damage done.

### Example Output

```
Name: Pharah
DPS: 120
Seconds: 2
Pharah did 120 dps for 2 seconds which is 240 damage.
```
