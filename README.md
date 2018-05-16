# Java intro training tutorial with examples for working in tech companies fdsfsd

For this simple tutorial I used:

* Language and version: Java 8
* IDE: IntelliJ
* Build tool: SBT

## Installation

### IntelliJ

I like IntelliJ but you can use others such as NetBeans, Eclipse, etc.

Please, follow the guide in this link to install the IDE: https://www.jetbrains.com/help/idea/install-and-set-up-product.html

After installing IntelliJ, is useful to install the Scala plugin in IntelliJ by going to: File -> Settings -> Plugins -> Scala. For more information please look in: https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html

### SBT

SBT is a build tool that will help us to easily compile Java programs. 

Please, follow the guide in this link to install SBT:  https://www.scala-sbt.org/1.0/docs/Installing-sbt-on-Linux.html 

## New project

1. Open IntelliJ
2. New Project -> Scala -> sbt. 
3. In the folder src/main create a folder with the name "java": src/main/java
4. Left click over "java" folder -> New -> Java Class
5. Inside the new class add the following code:

``` java
public static void main(String[] args) {
   System.out.println("Hello World!"); // Display the string in the console.
}
```
6. Go to the console and in the parent folder of the project run "sbt" for open the interactive console.

7. Once the console is opened execute "run" and you should see the message "Hello World!" in the console.

### Multiples Java projects

With SBT you can compile and manage multiples Java or Scala projects in a very easy way. In the root of the repository there is a file named "build.sbt". This file tells to SBT the structure of your project and other important properties. Here is an example of a "build.sbt" for supporting multiples Java projects in the same context.

``` sbt
val baseSettings = Seq(
  organization := "com.ejesposito",
  scalaVersion := "2.12.6",
  autoScalaLibrary := false
)

lazy val javaTraining = (project in file("."))
  .settings(baseSettings:_*)
  .settings(
    packagedArtifacts := Map.empty
  )
  .aggregate(
    `step_1_basics`,
    `step_2_oop`
  )

lazy val `step_1_basics` = (project in file("src/step_1_basics"))
  .settings(baseSettings:_*)
  .settings(
    name := "step_1_basics",
    moduleName := "step_1_basics",
    version := "1.0.0"
  )

lazy val `step_2_oop` = (project in file("src/step_2_oop"))
  .settings(baseSettings:_*)
  .settings(
    name := "step_2_oop",
    moduleName := "step_2_oop",
    version := "1.0.0"
  )
```
Here you are telling sbt that you have two projects:

* step_1_basics in the relative folder src/step_1_basics
* step_2_oop in the relative folder src/step_2_oop

Each project has a basic settings defined in "baseSettings" and both projects are in the context of the root project "javaTraining". 

The project structure is the following:

```
-- build.sbt 
 -- src/ 
  -- step_1_basics 
   - src/
    - main/
     - java/
      - com/
       - ejesposito/
        - code ...
  - step_2_oop
   - src/
    - main/
     - java/
      - com/
       - ejesposito/
        - code ...
```
    
For a reference manual about sbt and build.sbt please look in: https://www.scala-sbt.org/1.x/docs/Getting-Started.html 

### Navigating multiples Java projects

Go to the console again and execute sbt to open the interactive console. 

Inside sbt, with the command "project projectName" you can move across projects. For example test "project step_1_basics", then "run" and you will see the output of that project. Then test "project step_2_oop" and you will see the output of the other project.  

## Java introduction

### Step 1 - Basics

Is a very basic Java project with two classes. 

Class Figure: basic Java class
Class Basics: it has the main() method

### Step 2 - OOP

Is a basic Java project that shows basics concepts of inheritance and polymorphism.
