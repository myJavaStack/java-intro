# StringBuilder
- String is immutable, so for every changes, there will be new space in memory
- StringBuilder objects are mutable, which means you can modify the characters in the string.
- The StringBuilder class is new for Java 5.0. It’s designed to replace the older StringBuffer class, which has identical constructors and methods but isn’t as efficient.

#### Common constructors of the StringBuilder class
```
StringBuilder Creates an empty StringBuilder object with capacity of 16 characters
```
```
StringBuilder(intLength) Creates an empty StringBuilder object with an initial capacity of the specified number of characters.
```
```
StringBuilder(String) Creates a StringBuilder object that contains the specified string plus an additional capacity of 16 characters.
```

#### Methods for manipulating stringbuilders (13)
* 1.
```
length() Returns an int value for the number of
characters in this StringBuilder.
```
* 2. Note: Capacity and length are different
```
capacity() Returns an int value for the capacity of
characters in this StringBuilder object.
```
* Note: if the length pass the current capacity, the new capacity will be (old * 2) + 2

* 3.
```
setLength(intNumOfChars) Sets the length of this StringBuilder object to the specified number of characters.
``` 

* 4. The append and insert methods accept primitive types, objects, and arrays of characters.
```
append(value) Adds the value to the end of the string.
```

* 5.
```
insert(index, value) Inserts the value at the specified index, pushing the rest of the string back.
```

* 6.
```
replace(startIndex, endIndex, String) Replaces the characters from the start index to, but not including, the end index with the specified string.
```

* 7.
```
delete(startIndex, endIndex) Removes the substring from the start index to, but not including, the end index.
```

* 8.
```
deleteCharAt(index) Removes the character at the specified index.
```
* 9.
```
setCharAt(index, character) Replaces the character at the specified index with the specified character.
```

* 10.
```
charAt(index) Returns a char value for the character at the specified index.
```

* 11.
```
substring(index) Returns a String object that contains the characters starting at the specified index to the end of the string.
```

* 12.
```
substring(startIndex, endIndex) Returns a String object that contains the characters from the start index to, but not including, the end index.
```

* 13.
```
toString() Returns a String object that contains the string that’s stored in the StringBuilder object.
```