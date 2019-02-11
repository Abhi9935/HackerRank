'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(str => str.trim());

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the timeConversion function below.
 */
function timeConversion(s) {
    /*
     * Write your code here.
     */
    let hours = parseInt(s.substr(0, 2));
    let mins = s.substr(3, 2);
    let secs = s.substr(6, 2);
    let pmOrAm = s.substr(-2, 2);
    
    if (pmOrAm === 'AM') {
        if (hours != 12) {
            return (s.substr(0, 2) + ":" + mins + ":" + secs);
        }
        else {
            return ("00:" + mins + ":" + secs);
        }        
    } else if (hours !== 12 && pmOrAm === 'PM') {
        return (hours+12+":"+mins+":"+secs);
    } else {
        return (hours+":"+mins+":"+secs);
    }  

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    let result = timeConversion(s);

    ws.write(result + "\n");

    ws.end();
}
