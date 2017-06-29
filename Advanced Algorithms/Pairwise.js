function pairwise(arr, arg) {
    // Create empty array to keep the arrays we will add.
    var index = [];

    // Loop to check the first number.
    for (var a in arr) {
        // temporal first number.
        var temp = arr[a];

        // Second loop to check against the first number.
        for (var i = 1; i < arr.length; i++) {
            // temporal secodn number.
            var temp2 = arr[i];

            // Key element, this check to make sure that the numbers add to arg
            // also that the second index is greater than the first, and that neither
            // of those indices are already on the array.
            if (temp + temp2 === arg && i > a && index.indexOf(+a) === -1 && index.indexOf(+i) === -1) {
                // if true then add both indices as integers then stop checking to avoid repeats.
                index.push(+a, +i);
                break;
            }
        }
    }

    // After the two loops are done, check if index is empty to return 0
    // or if it is not, then use Array.reduce(callbackFunc) to returnt he sum
    // of the numbers.
    if (index.length >= 1) {
        var addAll = function(a, b) {
            return a + b;
        };

        return index.reduce(addAll);
    } else
        return 0;
    //My code that doesn't work because of duplicates in array and not being able to filter them.
    /*//get pairs in an array
     var values = [];
     var count=0;
     var index = [];
     for (var i =0; i<arr.length; i++) {
     if (arr.indexOf(arg-arr[i]) !=  -1 && arr.indexOf(arg-arr[i]) != arr.indexOf(arr[i])) {
     values.push(arr[i]);
     index.push(arr.indexOf(arr[i]));
     //values.push(arr[i], arr[arr.indexOf(arg-arr[i])]);
     //index.push(arr.indexOf(arr[i]), arr.indexOf(arg-arr[i]));
     count ++;
     console.log(count);
     }
     //break to avoid repeats

     /*if (values.indexOf(values[count]) != count ) {
     break;
     }
     }

     //get Index and sum it
     var sum = 0;
     for (var k = 0; k < values.length; k++) {
     // make sure to change the Index if it has already been used.
     if (values.indexOf(values[k]) != k) {
     sum += arr.indexOf(values[k]) + 1;
     }
     else {
     sum += arr.indexOf(values[k]);
     }
     }

     return sum;*/

}
