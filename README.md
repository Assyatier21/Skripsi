# Thesis Program
Contains files in the form of algorithms and supporting methods in detecting source code using Java 8 Language and tool named ANTLR4. 
The method used in this program is the Abstract Syntax Tree and the Ratcliff/Obershelp algorithm.


# RO-Algorithm
If you want to use it, just replace the String contained in the main code.

# Abstract Syntax Tree Method
Make sure that you have ANTLR4 in your device. ANTLR4 can be downloaded via the official website at https://www.antlr.org/. There is no need to download the entire file, its just a collection of compiled files. You just need to <b>download Java.g4</b> as AST Grammar which will translate java language into AST form.

How to use :
1. First, set CLASSPATH to the directory where your ANTLR files in. You can also edit it via "System Environment Variables" on your Windows.
2. Open CMD then move your directory to where your .java file is
3. Follow the syntax below:
   - antlr4 Java.g4
   - javac Java*.java
   - grun Java compilationUnit fileName.java - gui // if you want to print the AST Form. Here the example result:
   
![java3](https://user-images.githubusercontent.com/60766389/134788241-2dc6e1da-8152-4128-a9c9-936e512af490.png)
