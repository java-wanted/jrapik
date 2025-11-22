## Simple Issues

### Introduction

Java is simple. It includes:

- Java SE. Java Standard Edition includes translators, API, Java Runtime
  Environment. It is appropriate to create userspace applications,
  console applications at the first.

- Java EE. Java Enterprise Edition is a set of specifications, appropriate
  to create factory applications.

- Java ME. Java Micro Edition is intended to create applications with
  reduced requirements for hardware platforms, e.g. to create applications
  to be executed on bare hardware.

- Java FX. A technology to grade Java to be a Rich Client Platform. It is
  intended to create graphical interface for busy folks.

- Java Card. A technology that provides a safe environment to execute
  applications on finite memory devices.

There are particularities of Java:

- Simplicity

  Java is designed to learn it easy and quickly. On the dark side it lacks
  such constructions as goto, pre-processor, structures, unions, operator
  overloading, multi inheritance, and operations to access memory directly.

- Object-orientation

  In Java, data are represented as hierarchy of objects. Java provides a set
  of packages that can be used to process such data in a pre-defined way.

- Suitability for Network Programming

  Java allows to develop software for all levels of the Open Systems
  Interconnection model transparently, as if they were intended for the
  Inter Process Communication only.

- Interpretability

  A program written in Java is not intended to be translated into code for a
  specific hardware platform. Instead, it must be interpreted by a specific
  version of a Java Virtual Machine.

- Reliability

  Java does not support key object-oriented conceptions, e.g. runtime
  polymorphism. It requires that all data must be typed at translation time.

- Safety

  Java lacks ability to redirect a reference to a memory region to an other
  region.

- Independence from hardware architecture

  A Java application is interpreted by a version of a Java Virtual Machine.

- Portability

  Java lacks ability to be translated with respect to a specific hardware
  architecture. Basic types are kept in a fixed number of bytes.

- Performance

  The performance of a Java application can be better than the performance
  of an other application, if the later waits for some user activity.

- Multithreading

  Java allows to prevent to process the same task by two threads in parallel.

- Dynamism

  Java allows to load a specific library into memory in a lazy way, when it is
  required.

### Output to Terminal

There is the basic pattern of Java applications:

    public calss Main {
        public static void main(String []argv) {
            INSTRACTIONS
        }
    }

There are instructions to output an information onto a terminal:

    System.out.println( INFORMATION );
    System.out.print( INFORMATION );

The former instructions terminates the output with codes for line feed and
carriage return.

There is a library to read data from a terminal, *java.util.Scanner*. For
example, there are operations:

- *next* - read data until the first space character

- *nextLine* - read data until the end of the line

- *nextInt* - read data as an *int* number

Solve the following three number problem:

- Output numbers 31, 18 and 79 onto a terminal, space separated.

  It is prohibited to output a string like '31 18 97', the numbers must
  be involved.

Solve the following two number problem:

- Output numbers 50 and 10 onto a terminal, one per line

Solve the following one number problem:

- Output the number PI, with three decimal places

  It is prohibited to output a string like '3.142'.

Solve the following interactive numeric problem:

- Output the number read from the terminal

  The output must be provided in the form 'You entered the number NUMBER'.

Solve the following naming problem:

- Prompt the name of a user and output it onto a terminal

  The output must be in the form:

      What is your name?
      NAME

Solve the following greeting problem:

- Read the name of a user and greet her

  The output must be in the form 'Hello, NAME!".

Solve the following previous-next numerical problem:

- Read a number and print the next and previous one

  The output must be in the form:

      The next number after NUMBER is NEXT
      For the number NUMBER, the previous one is PREVIOUS

Solve the following four number problem:

- Read four numbers and output them to terminal, space separated.
