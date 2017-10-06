
function sumFibs(num) {
    var fib = [1, 1, 2];
    //get fibs under numb into an array
    for (var i=2; i <= num; i++ ) {
        var x = fib[i]+fib[i-1];
        fib.push(x);

        if (fib[i] > num) {
            fib.splice(i);
            break;
        }
    }
    //only sum odd fibs
    var sum = 0;
    for (var j=0; j < fib.length; j++) {
        if (fib[j] % 2 != 0) {
            sum += fib[j];
        }
    }
    return sum;
}

sumFibs(4);