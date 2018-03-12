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
#### Methods for manipulating strings
```
length() Returns an int value for the number of
characters in this string.
```
```
indexOf(String) Returns an int value for the index of the first occurrence of the specified string in this
string. Returns -1 if not found.
```
```
indexOf(String, startIndex) Returns an int value for the index of the firstoccurrence of the specified string starting at
the specified index. Returns -1 if not found.
```

```
lastIndexOf(String) Returns an int value for the index of the last occurrence of the specified string in this
string.
```

```
lastIndexOf(String, startIndex) Returns an int value for the index of the last occurrence of the specified string in this
string starting at the specified index.
```

