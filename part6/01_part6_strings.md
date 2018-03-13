# Strings
#### Common constructors of the String class
```
String() Creates an empty string ("")
```
```
String(arrayName) Creates a string from an array of char or byte types.
```
```
String(arrayName,intOffset, intLength) 
Creates a string from a subset of an array of char or byte types. The characters referred to by intOffset and
intLength must fall within the array, or the constructor will throw an exception.
```
* be careful using char in single quote

#### Methods for manipulating strings (18)
* 1.
```
length() Returns an int value for the number of
characters in this string.
```
* 2.
```
indexOf(String) Returns an int value for the index of the first occurrence of the specified string in this
string. Returns -1 if not found.
```
* 3.
```
indexOf(String, startIndex) Returns an int value for the index of the firstoccurrence of the specified string starting at
the specified index. Returns -1 if not found.
```
* 4.
```
lastIndexOf(String) Returns an int value for the index of the last occurrence of the specified string in this
string.
```
* 5.
```
lastIndexOf(String, startIndex) Returns an int value for the index of the last occurrence of the specified string in this
string starting at the specified index.
```
* 6.
```
trim() This method returns a copy of the string, with leading and trailing whitespace omitted.
```

* 7. Note that,we just have substring, and not substr. Also, ending index is not included.
```
substring(startIndex) Returns a String object that starts at the specified index and goes to the end of the string.
```
* 8. Note that is no slice(), or substr() in JAVA
```
substring(startIndex, endIndex) Returns a String object that starts at the specified start index and goes to, but doesn’t include, the end index.
```

* 9.
```
replace(oldChar, newChar) Returns a String object that results from replacing all instances of the specified old char value with the specified new char value.
```

* 10.
```
split(String regex) It returns the array of strings computed by splitting this string around matches of the given regular expression.
```

* 11.
```
charAt(index) Returns the char value at the specified index.
```

* 12. Note that, there is not = for string, and this guy is case-sensitive
```
equals(String) Returns a boolean true value if the specified string is equal to the current string. Comparison is case-sensitive.
```

* 13.
```
equalsIgnoreCase(String) Returns a boolean true value if the specified string is equal to the current string. Comparison is not case-sensitive.
```

* 14.
```
startsWith(String) Returns a boolean true value if this string starts with the specified string.
```

* 15.
```
startsWith(String, startIndex) Returns a boolean true value if this string starts with the specified string starting at the start index.
```

* 16.
```
endsWith(String) Returns a boolean true value if the string ends with the specified string.
```

* 17. it is close to equals but it returns int 0 or something else.
```
compareTo(String) Returns an int that’s less than zero if the string is less than the specified string, greater than zero if the string is greater than the specified string, and zero if the strings are equal.
```

* 18.
```
compareToIgnoreCase( String) The same as compareTo, but the case of the strings is ignored.
```