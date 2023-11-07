# Writing a class with a main()
- Running a program means telling the Java Virtual Machine (JVM) to “Load theMyFirstApp class, then start executing its main() method.
- The main() method is where your program starts running.

# System.out.print vs System.out.println
- System.out.println inserts a newline (think of println as printnewline).
- System.out.print keeps printing to the same line
- (If you want each thing you print out to be on its own line, use println. If you want everything to stick together on one line, use print.)

# 2 classes and objects
- Overriding just means that a subclass redefines one of its inherited methods when it needs to change or extend the behavior of that method.

# What do you like about OO?
- It helps me design in a more natural way
- Not messing around with code I’ve already tested, just to add a new feature.
- I like that the data and the methods that operate on that data are together in one class.
- Reusing code in other applications.


# When you design a class, think about the objects that will be created from that class type.
- things the object knows.
- things the object does.
- Things an object knows about itself are called  instance variables.
- Things an object can do are called  methods.

# What’s the difference between a class and an object?
- A class is a blueprint for an object. It tells the virtual machine how to make an object of that particular type.
- An object is an instance of a class.

# The two uses of main:
-  to test your real class
-  to launch/start your Java application

# The Guessing Game

Summary:
The Guessing Game involves a game object and three player objects. The game generates
a random number between 0 and 9, and the three player objects try to guess
it.

Classes:
GuessGame.class Player.class GameLauncher.class
