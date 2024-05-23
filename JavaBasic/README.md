## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Step 1:
For macOS:
Download the JDK:

Go to the Oracle JDK download page or the OpenJDK download page.
Download the .dmg installer for the latest JDK version.
Install the JDK:

Open the downloaded .dmg file and run the installer. Follow the instructions to complete the installation.
Set Up Environment Variables (optional):

Open the Terminal and edit your shell profile file (e.g., ~/.bash_profile, ~/.zshrc depending on your shell).
Add the following lines to set the JAVA_HOME environment variable:
sh
Copy code
export JAVA_HOME=$(/usr/libexec/java_home)
Save the file and run source ~/.bash_profile or source ~/.zshrc to apply the changes.
Verify Installation:

Open a new Terminal window and type java -version and javac -version. If installed correctly, you should see the version information for Java and the Java compiler.

## Step 2: Install Java Extension Pack
Open VS Code.
Go to the Extensions View:
Click on the Extensions icon in the Activity Bar on the side of the window or press Ctrl+Shift+X.
Search for "Java Extension Pack":
Type "Java Extension Pack" in the search bar.
Install the Java Extension Pack:
Click the "Install" button. This pack includes essential extensions for Java development, such as:
Language Support for Java(TM) by Red Hat
Debugger for Java
Java Test Runner
Maven for Java
Visual Studio IntelliCode
Step 3: Create a New Java Project
Open the Command Palette:
Press Ctrl+Shift+P (or Cmd+Shift+P on macOS) to open the Command Palette.
Create Java Project:
Type Java: Create Java Project and select it.
Select Project Type:
Choose the type of project you want to create (e.g., No Build Tools, Maven, or Gradle). For a simple setup, you can choose "No Build Tools".
Choose Project Location:
Select the location where you want to create the project.
Name Your Project:
Enter a name for your project.
Step 4: Set Up Project Structure
VS Code will create a basic project structure for you. If you chose "No Build Tools", the structure will look something like this:

```
your-project/
├── src/
│   └── App.java
├── .vscode/
│   └── settings.json
├── .classpath
└── .project
```

## Step 5: Write Your Java Code
Open the src folder and find the App.java file.
Edit App.java:
Replace the existing code with your own Java code. For example:
```
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Step 6: Run Your Java Project
Run the Project:
Right-click on the App.java file in the Explorer and select Run Java.
Alternatively, open the Command Palette (Ctrl+Shift+P or Cmd+Shift+P), type Java: Run, and select it.
View Output:
The output will be displayed in the Terminal or Output pane at the bottom of VS Code.
Step 7: Debug Your Java Project
Set Breakpoints:
Click in the gutter to the left of the line numbers in your code to set breakpoints.
Start Debugging:
Open the Command Palette (Ctrl+Shift+P or Cmd+Shift+P), type Debug: Start Debugging, and select it.
Alternatively, press F5 to start debugging.
Use Debug Controls:
Use the debug controls in the top bar to step over, step into, continue, or stop the debugging session.
Step 8: Manage Dependencies (if using build tools)
If you chose Maven or Gradle as your build tool, manage your dependencies in the pom.xml (for Maven) or build.gradle (for Gradle) files.

For Maven:
Add dependencies in the dependencies section of pom.xml and update the project by running Java: Update Project from the Command Palette.
For Gradle:
Add dependencies in the dependencies section of build.gradle and refresh the Gradle project.
