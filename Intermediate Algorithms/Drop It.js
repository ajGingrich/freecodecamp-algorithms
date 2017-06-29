
function dropElements(arr, func) {
    var i = 0;
    while (i < 20) {
        if (func(arr[i])) {
            break;
        }
        arr.shift();

    }

    return arr;
}
dropElements([1, 2, 3], function(n) {return n > 0;});


