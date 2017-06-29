
function sumPrimes(num) {
    var arr = [];
    var allNumbers = [];
    var i, j;
    //make array of all numbers
    // get prime numbers
    for (i=2; i <=num; i++) {
        if (!allNumbers[i]) {
            arr.push(i);
            for (j=i << 1; j <=num; j += i ) {
                allNumbers[j]=true;
            }
        }
    }
    console.log(arr);
    //sum them
    var sum = 0;
    for (var k = 0; k <arr.length; k++) {
        sum += arr[k];
    }

    return sum;
}

sumPrimes(10);
