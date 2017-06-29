
function diffArray(arr1, arr2) {
    var x = [];
    var y = [];


    for (var i=0; i <arr2.length; i++) {
        if (arr1.indexOf(arr2[i]) == -1) {
            x.push(arr2[i]);
        }
    }
    for (var j=0; j <arr1.length; j++) {
        if (arr2.indexOf(arr1[j]) == -1) {
            y.push(arr1[j]);
        }
    }
    var newArray = y.concat(x);
    return newArray;
}

//diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]);
diffArray([1, "calf", 3, "piglet"], [1, "calf", 3, 4]);