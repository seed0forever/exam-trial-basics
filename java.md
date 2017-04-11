# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer: \[
One way to do it is by calling the Math.random() method.

It returns a double-precision floating point number (a _double_ type variable) between 0 and 1.
(0 can be included, 1 is excluded.)

If you need e.g a random number between 1 and 10, you have to multiply the random number you got.
Also, if you want a whole number, you have to _cast_ the value you got to _int_.
Now you have a whole number between 0 and 9.
So you have to add 1 after you converted it to integer.

Example:
Random integer between 1 and 10:
```java
int randomIntBetween1To10 = (int) (Math.random() * 10) + 1;
```
\]
