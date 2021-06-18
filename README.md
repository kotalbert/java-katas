# java-katas

Source: https://www.codewars.com/

## SpinWords

Write a function that takes in a string of one or more words, and returns the same string, but with all five or more
letter words reversed (like the name of this kata).

* Strings passed in will consist of only letters and spaces.
* Spaces will be included only when more than one word is present.

Examples:

```java
spinWords("Hey fellow warriors")=>"Hey wollef sroirraw"
        spinWords("This is a test")=>"This is a test"
        spinWords("This is another test")=>"This is rehtona test"
```

## XO

Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

```bash
XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
```

