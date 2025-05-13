# Recursion Practice

This exercise is designed to help you develop your understanding of recursion in Java. Recursion is a powerful technique where a method calls itself to solve smaller instances of a problem.

## How to Think Recursively

Each recursive function should follow this structure:

1. **Base Case:**  
   What is the simplest version of the problem that you can solve directly, without any further recursion?

2. **Recursive Case:**  
   Break the problem into a smaller version of itself. Call the same function with a simpler input.

3. **Trust the Recursion:**  
   Don't try to follow every recursive call in your head! Write the base case, write the recursive case, and assume the method works as promised for the smaller version.

<br>

# Additional Practice Problems

The problems below are organized in **three tiers**. You should work through them in order. Try to complete all problems in Tier 1 and Tier 2. Tier 3 is **optional** and more challenging.

## Tier 1: Basic Recursion

### 1. Print N Times
Write a recursive function `printNTimes(String word, int n)` that prints the given `word` exactly `n` times.  
Example: `printNTimes("hi", 3)` → prints:  

```
hi  
hi  
hi
```

### 2. Print Digits of a Number
Write a recursive function `printDigits(int n)` that prints each digit of `n` on a separate line, from most significant to least.  
Example: `printDigits(431)` →  

```
4  
3  
1
```

### 3. Count Occurrences of a Number
Write a recursive function `countOccurrences(int[] arr, int n, int target)` that counts how many times `target` appears in the first `n` elements of the array.  
Example: `countOccurrences([1, 2, 3, 2, 4], 5, 2)` → `2`

## Tier 2: Intermediate Practice

### 4. Replace Character in a String
Write a recursive function `replaceChar(String s, char target, char replacement)` that returns a new string where all occurrences of `target` are replaced with `replacement`.  
Example: `replaceChar("banana", 'a', 'o') → "bonono"`

### 5. GCD (Greatest Common Divisor)
Write a recursive function `gcd(int a, int b)` that returns the greatest common divisor of `a` and `b` using the Euclidean algorithm.  
Example: `gcd(48, 18)` → `6`

### 6. Recursive String Clean
Write a recursive function `cleanString(String s)` that returns a string where *consecutive duplicate characters* are reduced to a single one.  
Example: `cleanString("aaabbccdaa") → "abcda"`

## Tier 3: Advanced Recursion Challenges

### 7. Recursive Linear Search
Write a recursive function `linearSearch(int[] arr, int n, int target)` that returns the **index** of the first occurrence of `target` in the first `n` elements of the array. Return `-1` if not found.  
Example: `linearSearch([5, 3, 7, 3], 4, 3)` → `1`

### 8. All Indices of a Target
Write a recursive function `allIndices(int[] arr, int n, int target)` that returns a list of all indices where `target` appears in the first `n` elements.  
Example: `allIndices([1, 2, 3, 2, 4], 5, 2)` → `[1, 3]`

### 9. Recursive String Permutations
Write a recursive function `generatePermutations(String s)` that prints all permutations of the characters in the string.  
Example: `generatePermutations("ab")` → prints:  
```
ab  
ba
```