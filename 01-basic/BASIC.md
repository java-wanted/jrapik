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

Solve the following two string problem:

- Output the following two string onto a terminal

      5 10
      7 cm

Solve the following two number input problem:

- Read two numbers and output them in the form:

      100 FIRST
      1949 SECOND

### Formula Calculation

There are arithmetic operations in Java:

- Addition

- Subtraction

- Multiplication

- Division

The operations have the following precedence, from highest to lowest:

- Postfix increment and decrement

- Prefix increment and decrement

- Multiplication, division and remainder

- Addition and subtraction

There are mathematical functions in Java. The Math type provides the following
functions: *abs*, *acos*, *asin*, *atan*, *cbrt*, *ceil*, *cos*, *cosh*, *exp*,
*floor*, *floorDiv*, *log*, *log1p*, *log10*, *max*, *min*, *pow*, *random*,
*rint*, *round*, *ignum*, *sin*, *sinh*, *sqrt*, *tan*, *tanh*, *toDegrees*,
*toRadians*. For example:

- *cbrt* returns the cube root of a scalar

- *foorDiv* returns the result of integer division of two integers

- *rint* returns a double that is the nearest integer for a double

- *ignum* return 1, 0 or -1 if a scalar is greater, equal or below a zero

- *toDegres* and *toRAdians* converts radian angle to degrees and vice versa

There are two constants also:

- E, a double value, closest to *e*, the base of the natural logarithms

- PI, a double value, closest to *pi*, the ratio of circumference of a circle to
  its diameter

In Java, it is possible to convert an integer to a float and vice versa. An integer
is converted to a float number implicitly, regardless of underflow. But the inverse
conversion must be explicit.

Output the result of the integer calculation with the formula:

$$ y = 17 x ^ 2 - 6 x + 13, $$

where $x$ is an integer read from the terminal.

Output the result of the calculation with the formula:

$$\sqrt{\frac{2 a + \sin \left\lvert 3 a \right\rvert}{3.56}}$$

where $a$ is a number.

There is not need to round the result off.

Solve the following issue:

- Input two integer numbers

- Output the result of integer calculation of the mean and the geometric mean

  Do not round off, if integers 3 and 4 are provided, the result should be 3
  and 3.

Input the radius of a circle. Output its diameter.

Solve the following program:

- Let 1 kg of sweets, cookies and apples cost 340, 230 and 98 units
  respectively.

- Let the number of kilograms for each kind are defined as three
  integers separated by spaces.

- Input the numbers, calculate the total cost and output it onto the terminal.

Solve the work station problem

- There are prices for a monitor, a system unit, a keyboard and a mouse.

- Input a number and output the total cost of this number of sets of this
  components.

Solve middle age problem:

- Input two numbers, the ages of Tany and Mity, in years.

- Output their integral mean age and difference of their ages and the mean in
  the format:

      The mean is N1, differency for Tany is N2, for Mity is N3

Solve the degree problem:

- Read a number representing the temperature in degrees Celsius.

- Output this temperature in degrees Fahrenheit.

  To convert the temperature from degrees Celsius degrees to degrees Fahrenheit,
  multiply its  by 1.8 and add 32.

Solve the collide problem:

- Two vehicles are moving towards each other at constant speeds of V1 and V2
  km/h respectively.

- Calculate the time it will take for them to collide if the initial distance
  between them was S km.

  Read three integer numbers, V1, V2 and S, space separated. And output the
  result in the format:

      They collides in HORS hours and MINUTES minutes.

Take attention that a one of vehicles is broken and does not move. Thus, it is
known that if V1, V2, S are 60, 58, 5 respectively, the result is

      The collides in 0 hours and 5 minutes.

Solve the backward degree problem:

- Read a number representing the temperature Fahrenheit.

- Output this temperature in degrees Celsius.

  To convert the temperature from degrees Celsius degrees to degrees Fahrenheit,
  multiply its  by 1.8 and add 32.


### Integer Arithmetic

There are integer arithmetic operations in Java:

- addition

- subtraction

- multiplication

- division

- taking the remainder of a division

In Java, the conversion of a floating point number to an integer one must
be done explicitly:

    int x = (int)1.0f;

Solve the integral apple problem:

- Read two numbers: N - the number of students, k - the number of
  apples in a bucket.

- Distribute the apples across the students in such a way that each student
  are given with equal integer number of apples.

- Print the number of apple that are given to each student and the number
  of apples that left in the bucket.

Solve the railway compartment problem:

- There are 9 compartments in a carriage, for 4 passengers each

- Read the number of a berth in the carriage and output the number of the
  related compartment.

  The berths and compartments are numberer in order, starting with 1.

Solve the housing floor problem:

- There are 15 apartments in an entrance of a five-story apartment building.

- Read the number of an apartment and output the floor number.

  The apartments and floors are numbered in order, starting with 1.

Solve the day hours problem:

- Read the number of seconds passed since the start of a day.

- Output the integer number of hours passed during this time.

Solve the two digit sum problem:

- Read a two digit number. Output the sum of digits in it.

Solve the two digit unit problem:

- Read a two digit number. Output the number of tens and the number
  of units in it.

Solve the three digit unit problem:

- Read a three digit number. Output digits of it comma separated,
  starting with the most significant one.

Solve the three digit reverse problem

- Read a three digit number.

- Output a number obtained by reversing the order of the digits in it.

Solve the three digit partial reverse problem

- Read a three digit number.

- Output a number obtained by reversing the order of the second and the
  first digits in it.

Solve the four digit sum problem:

- Read a four digit number.

- Output the sum of digits in it.
