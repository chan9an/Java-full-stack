alert("Beware");

// Global variable
var globalVar = "I am a global variable";

function exampleFunction() {
    // Local variable
    let localVar = "I am a local variable";
    
    console.log(globalVar); // Accessible
    console.log(localVar);  // Accessible
}

exampleFunction();

console.log(globalVar); // Accessible outside function
// console.log(localVar); // Uncaught ReferenceError: localVar is not defined

// Array declaration using constructor
const arr1 = new Array(1, 2, 3, 4, 5);
console.log("Array using constructor:", arr1);

// Array declaration using literal
const arr2 = [10, 20, 30, 40, 50];
console.log("Array using literal:", arr2);

// Array traversal



const city = new Array("Pune","Delhi","Chandigrah","Shimla","Kolkata");
var c = "Shimla";
var o =0;
for(let i =0;i<city.length;i++){
if(city[i]==c){
    o++;
}
    
}
if(o>0){
    document.write("YES");

}
else{
    document.write("No");
}
