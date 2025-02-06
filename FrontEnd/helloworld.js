// Global variable
var globalVar = "I am a global variable";

/**
 * Example Function
 * Demonstrates how local and global variables work.
 */
function exampleFunction() {
    // Local variable
    let localVar = "I am a local variable";
    
    document.write("Global variable from function: " + globalVar + "<br>"); // Accessible
    document.write("Local variable from function: " + localVar + "<br>");  // Accessible
}

exampleFunction();

// Document writes for global variables
document.write("Global variable outside function: " + globalVar + "<br>");
// Local variable is not accessible outside the function, so it is commented out:
// document.write("Local variable outside function: " + localVar + "<br>"); 

// --- Arrays ---
/**
 * Arrays in JavaScript:
 * 1. Array declaration using the constructor.
 * 2. Array declaration using array literal.
 */
const arr1 = new Array(1, 2, 3, 4, 5); // Constructor
document.write("Array using constructor: " + arr1.join(", ") + "<br>");

const arr2 = [10, 20, 30, 40, 50]; // Literal
document.write("Array using literal: " + arr2.join(", ") + "<br>");

// --- Array Traversal ---
/**
 * Array Traversal:
 * Searching for a specific city in the array and writing the result to the document.
 */
const city = new Array("Pune", "Delhi", "Chandigarh", "Shimla", "Kolkata");
var c = "Shimla";
var o = 0;

for (let i = 0; i < city.length; i++) {
    if (city[i] == c) {
        o++;
    }
}

if (o > 0) {
    document.write("City found: YES<br>");
} else {
    document.write("City found: NO<br>");
}

// --- Arrow Function with Default Parameters ---
/**
 * Arrow Function with Default Parameters:
 * A shorter way to define functions with default values for parameters.
 */
const sum = (a = 0, b = 0) => a + b; // Default parameters for a and b
document.write("Sum using arrow function (5 + 10): " + sum(5, 10) + "<br>");
document.write("Sum with default parameters (no args): " + sum() + "<br>");

// --- Object ---
/**
 * Object in JavaScript:
 * Defines an object with properties and methods.
 * The method uses `this` to access object properties.
 */
const person = {
    name: "John",
    age: 30,
    city: "New York",
    greet: function() {
        return `Hello, my name is ${this.name} and I am ${this.age} years old.`;
    }
};

document.write("Person Object: <br>");
document.write("Name: " + person.name + "<br>");
document.write("Age: " + person.age + "<br>");
document.write("City: " + person.city + "<br>");
document.write("Greeting: " + person.greet() + "<br>");
