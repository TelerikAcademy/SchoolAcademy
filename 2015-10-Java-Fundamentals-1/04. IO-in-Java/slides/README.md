<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->

# Console IO
##  Getting input and showing output to the user
<div class="signature">
    <p class="signature-course">Java Fundamentals - Part 1</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents

*   Printing to the command line
    *   Printing with `System.out.print()` and `System.out.println()`
    *   Printing formatted strings with `System.out.printf()`
*   Reading from the command line:
    *   Using `InputStreamReader`
    *   Using `BufferedReader`
    *   Using `Scanner`

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   Printing to the Standard Output
##    i.e. the Console

#   Printing to the Console

*   Java provides a ready-to-use stream for printing to the standard output (the console):
    *   Printing on the same line:
    ```java
    System.out.print(value);
    ```
    *   Printing and appending a new line at the end:
    ```java
    System.out.println(value);
    ```
    *   Printing with format:
    ```java
    System.out.printf(format, values);
    ```

#  Printing on the same line

*   The following code:

```java
String name = "Doncho Minkov";
int age = 19;
System.out.print("Hi! My name is ");
System.out.print(name);
System.out.print(" and I am ");
System.out.print(age);
System.out.print(" years old.");
```

results in

```java
Hi! My name is Doncho Minkov and I am 19 years old.
```

*   Each `print()` moves the print marker on the end of the same line

<!-- attr: {class: 'slide-section'} -->
#   Printing on the same line
##    [Demo](http://)

#   Printing on a new line

*   The following code:

```java
String name = "Doncho Minkov";
int age = 19;
System.out.println("Hi! My name is ");
System.out.println(name);
System.out.println(" and I am ");
System.out.println(age);
System.out.println(" years old.");
```

results in

```java
Hi! My name is
Doncho Minkov
 and I am
19
 years old.
```

*   Each `println()` moves the print marker on a new line

<!-- attr: {class: 'slide-section'} -->
#   Printing on a New Line
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   Printing with a format
##  Precision, dates, locales

#   Printing with a format

*   `System.out.printf()` prints with a format
    *   i.e. we do not need to concatenate into a whole string
    *   plus we can apply some formatting of the values
        *   Floating-point numbers precision
        *   Date format
        *   etc...

#   Printing with a format: Number and String

*   Regular format:

```java
String name = "Doncho Minkov";
int age = 19;

System.out.printf("Hi! My name is %s and I am %d years old", name, age);
```

results in

```java
Hi! My name is Doncho Minkov and I am 19 years old
```

*   `%s` prints a `String`
*   `%d` prints an `int` (decimal)

#   Printing with a format: Example

*   Floating-point precision:

```java
double pi = Math.PI;
System.out.format("%f%n", pi);
System.out.format("%.3f%n", pi);
System.out.format("%10.3f%n", pi);
System.out.format("%-10.3f%n", pi);
```

results in

```java
3.141593
3.142
     3.142
3.142
```

*   `%f` defines the **precision**

#   Printing with a format: Example

*   Date formats:

```java
Calendar c = Calendar.getInstance();

System.out.format("%tB %te, %tY%n", c, c, c);
System.out.format(Locale.forLanguageTag("BG"), "%tB %te, %tY%n", c, c, c);
System.out.format(Locale.CHINA, "%tB %te, %tY%n", c, c, c);
System.out.format("%tl:%tM %tp%n", c, c, c);
System.out.format("%tD%n", c);
```

results in

```java
October 27, 2015
Октомври 27, 2015
十月 27, 2015
8:23 am
10/27/15
```

<!-- attr: {class: 'slide-section'} -->
#   Printing to the Standard Output
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   Reading from the Standard Input
##  Getting data from the user

<!-- attr: {style: 'font-size:40px'} -->
#   Reading from the standard input

*   `InputStreamReader` is used to read from the standard input
*   It is used as follows
    *   Reading `char` by `char`

    ```java
    InputStreamReader reader = new InputStreamReader(System.in);
    char c = (char)reader.read();
    ```

    *   Reading a line:

    ```java
    char[] bytes = new char[50];
    int bytesReadCount = reader.read(bytes);
    ```

    *   Need to parse each byte from `bytes` to `char`

<!-- attr: {style: 'font-size:45px'} -->
#   Reading from the standard input

*   `InputStreamReader` is used to read from the standard input
*   It is used as follows

    *   Reading a number:

    ```java
    char[] bytes = new char[50];
    int bytesReadCount = reader.read(bytes);
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < bytesReadCount-1; ++i){
    	builder.append((char)bytes[i]);
    }
    String line = builder.toString();
    int number = Integer.parseInt(line);
    ```

<!-- attr: {class: 'slide-section'} -->
#   Reading from the Standard Input
##    [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   Reading with BufferedReader
##  Easier way to read

#   Reading from the standard input with BufferedReader

*   `InputStreamReader` is great, but it provides too much low-level interface
    *   Parsing a number is hell
*   `BufferedReader` is a wrapper of `InputStreamReader` that provides a cleaner interface
    *   Reading a string:

    ```java
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line = reader.readLine();
    ```


#   Reading from the standard input with BufferedReader

*   `InputStreamReader` is great, but it provides too much low-level interface
    *   Parsing a number is hell
*   `BufferedReader` is a wrapper of `InputStreamReader` that provides a cleaner interface
    *   Reading a number:

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int number = Integer.parseInt(reader.readLine());
```

<!-- attr: {class: 'slide-section'} -->
#   Using `BufferedReader`
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-section'} -->
#   The `Scanner` class
##  Even easier reading

#   The `Scanner` class

*   The scanner class is a wrapper over `InputStreamReader` that provides even easier API than the `BufferedReader`:

```java
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
String str = scanner.next();
```

<!-- attr: {class: 'slide-section'} -->
#   The `Scanner`
##  [Demo](http://)

<!-- section start -->

<!-- attr: {class: 'slide-questions'} -->
#   Console IO in Java
##  Questions
