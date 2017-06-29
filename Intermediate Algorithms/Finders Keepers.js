
function findElement(arr, func) {
    var x = arr.filter(func);
    var num = x[0];
    return num;
}

findElement([1, 2, 3, 4], function(num){ return num % 2 === 0; });
