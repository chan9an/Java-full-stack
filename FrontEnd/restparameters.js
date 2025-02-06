// Rest Parameters and Spread Operator in JavaScript

/**
 * Rest Parameters allow you to pass a variable number of arguments 
 * into a function and automatically store them in an array. This 
 * makes functions more flexible, especially when the exact number 
 * of arguments is not known in advance.
 * 
 * Syntax: 
 * function functionName(...restParam) {
 *     // restParam will be an array containing all passed arguments
 * }
 */

/**
 * Spread Operator allows you to **expand** an array or object into 
 * individual elements. It can be used when you need to pass elements 
 * of an array as individual arguments to a function or to create 
 * copies of arrays/objects.
 * 
 * Syntax: 
 * ...arrayOrObject
 */

/**
 * Example 1: Rest Parameters - Accepting a variable number of arguments.
 * The function 'sum' will accept any number of arguments and return 
 * the total sum.
 */
function sum(...numbers) {
    let total = 0;
    // Loop through each number and add to total
    for (let num of numbers) {
        total += num;
    }
    return total;
}

console.log(sum(1, 2, 3)); // Outputs: 6
console.log(sum(5, 10, 15, 20)); // Outputs: 50
console.log(sum()); // Outputs: 0 (no arguments)

/**
 * Example 2: Rest Parameters can be used along with regular parameters.
 * The first parameter is a mandatory one, and the rest will be captured 
 * by the rest parameter 'names'.
 */
function greet(message, ...names) {
    console.log(message + " " + names.join(", "));
}

greet("Hello", "John", "Paul", "George", "Ringo"); 
// Outputs: Hello John, Paul, George, Ringo

/**
 * Example 3: Spread Operator in Arrays.
 * The spread operator '...' can be used to expand elements of an array
 * when passed as arguments to a function.
 */
function multiply(a, b, c) {
    return a * b * c;
}

const numbersArray = [2, 3, 4];

// Spread operator expands the array into individual arguments
console.log(multiply(...numbersArray)); // Outputs: 24

/**
 * Example 4: Spread Operator in Arrays - Combining arrays.
 * You can use the spread operator to combine two or more arrays.
 */
const array1 = [1, 2, 3];
const array2 = [4, 5, 6];

const combinedArray = [...array1, ...array2];
console.log(combinedArray); // Outputs: [1, 2, 3, 4, 5, 6]

/**
 * Example 5: Spread Operator in Objects.
 * Spread operator can also be used to copy or combine objects.
 */
const obj1 = { name: "John", age: 30 };
const obj2 = { city: "New York", country: "USA" };

const combinedObject = { ...obj1, ...obj2 };
console.log(combinedObject); // Outputs: { name: "John", age: 30, city: "New York", country: "USA" }

/**
 * Example 6: Rest Parameters vs Arguments Object.
 * While the 'arguments' object is array-like, rest parameters return a real array.
 * The 'arguments' object does not support array methods like .map(), .forEach() directly.
 */

// Using arguments object (non-array-like)
function showArgs() {
    console.log(arguments); // This is not an array but an array-like object
}

showArgs(1, 2, 3, 4); // Outputs: [1, 2, 3, 4] (arguments object)

// Using Rest Parameters (real array)
function showRestParams(...args) {
    console.log(args); // 'args' is a real array
}

showRestParams(1, 2, 3, 4); // Outputs: [1, 2, 3, 4] (rest parameters)

// Example 7: Rest Parameters in arrow functions.
const multiplyArrow = (...numbers) => {
    return numbers.reduce((total, num) => total * num, 1);
};

console.log(multiplyArrow(2, 3, 4)); // Outputs: 24 (Multiplying all numbers)

/**
 * Example 8: Using Rest Parameters with other parameters.
 * Rest parameters can be used alongside regular parameters. However, 
 * they must always be the last parameter.
 */
function report(status, ...details) {
    console.log("Status:", status);
    console.log("Details:", details.join(", "));
}

report("Success", "Task completed", "No issues", "Time taken: 3 hours");
// Outputs:
// Status: Success
// Details: Task completed, No issues, Time taken: 3 hours

/**
 * Key Takeaways:
 * 1. Rest parameters must always be the last parameter in the function.
 * 2. They collect all remaining arguments passed to the function into an array.
 * 3. Rest parameters provide a cleaner alternative to using the 'arguments' object.
 * 4. Spread operator '...' allows expanding arrays/objects into individual elements.
 * 5. You can use spread operator to combine arrays and copy/merge objects.
 */
