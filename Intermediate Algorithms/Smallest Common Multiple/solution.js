function smallestCommons(arr) {
    var range = [];
    for (var i = Math.max(arr[0], arr[1]); i >= Math.min(arr[0], arr[1]); i--) {
        range.push(i);
    }

    // can use reduce() in place of this block
    var lcm = range[0];
    for (i = 1; i < range.length; i++) {
        var GCD = gcd(lcm, range[i]);
        lcm = (lcm * range[i]) / GCD;
    }
    return lcm;

    function gcd(x, y) {    // Implements the Euclidean Algorithm
        if (y === 0)
            return x;
        else
            return gcd(y, x%y);
    }
}

// test here
smallestCommons([1,5]);
/*This is my code that works correctly.
 Sort Array first.
 var compareNumbers = function(a,b) {
 return a-b;
 };
 arr.sort(compareNumbers);
 //make Array of all numbers
 var numbers =[];
 for (var i=arr[0]; i <= arr[1]; i++ ) {
 numbers.push(i);
 }


 //find LCD
 var SCM = 0;

 //Use Recursion to get answer for lower numbers
 var checkEquality = function() {
 for (var z=numbers.length-1; z>=0; z--) {
 if (SCM % numbers[z] != 0) {
 SCM++;
 checkEquality();
 }
 }
 };
 checkEquality(SCM);
 //Edit out this part above

 var x = true;
 while (x) {
 SCM++;
 for (var k= numbers[numbers.length-1]; k >= numbers[0]; k--) {
 if (SCM % k !== 0) {
 break;
 }
 else if (k == numbers[0]) {
 x = false;
 }
 }
 }

 return SCM;*/