### Day 6 JavaScript Dates

![](https://hrcdn.net/hackerrank/assets/brand/h_mark_sm-9c05999c62674028552f4e813728e591.svg)
###### author: [**Abhinav Kushwaha (Baba Albus)**](http://babaalbus.com/ "http://babaalbus.com/")
---
#### Objective
In this challenge, we learn about JavaScript Dates. Check out the attached tutorial for more details.

#### Task
Given a date string, *dateString*, in the format MM/DD/YYYY, find and return the day name for that date. Each day name must be one of the following strings: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, or Saturday. For example, the day name for the date 12/07/2016 is Wednesday.

#### Input Format
Locked stub code in the editor reads the following input from stdin: 
The first line contains an integer, *d*, denoting the number of dates to check. 
Each line *i* of the *d* subsequent lines contains a date in MM/DD/YYYY format; each date denotes some *dateString* that is passed to the function.

#### Constraints
It is guaranteed that the input only consists of valid dates.

#### Output Format
The function must return a string denoting the day of the week corresponding to the date denoted by *dateString*.

#### Sample Input 0
2 </br>
10/11/2009 </br>
11/10/2010 </br>

#### Sample Output 0
Sunday </br>
Wednesday </br>

#### Explanation 0
The function is called for the following *d=2* dates:</br>
	1. The date 10/11/2009 was a Sunday, so we return Sunday.</br>
	2. The date 11/10/2010 was a Wednesday, so we return Wednesday.

```
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
```

```
// The days of the week are: "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
function getDayName(dateString) {
    let dayName = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    // Write your code here
    return dayName[new Date(dateString).getDay()];
}
```
```
function main() {
    const d = +(readLine());
    
    for (let i = 0; i < d; i++) {
        const date = readLine();
        
        console.log(getDayName(date));
    }
}
```
