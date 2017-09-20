
function sumAll(arr) {
    var min = arr.reduce(function(a,b) {
        return Math.min(a,b)});
    var max = arr.reduce(function(a,b) {
        return Math.max(a,b)});
    var sum = 0;

    for (var i= min; i <= max; i++) {
        sum += i;
    }
    return sum;
}

sumAll([4, 1]);