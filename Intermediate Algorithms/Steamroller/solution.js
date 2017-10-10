
function steamrollArray(arr) {
    var x = [];

    // run through original array
    for (var i=0; i <arr.length; i++) {
        if (Array.isArray(arr[i])) {
            x = x.concat(arr[i]);
        }
        else {
            x.push(arr[i]);
        }
    }
    //run through partial flattened x
    for (var j=0; j< x.length; j++) {
        if (Array.isArray(x[j])) {
            x = x.concat(x[j]);
        }
    }
    // delete additional arrays
    for (var k=x.length -1; k >= 0; k--) {
        if (Array.isArray(x[k])) {
            x.splice(k, 1);
        }
    }
    return x;

}

steamrollArray([1, [2], [3, [[4]]]]);

