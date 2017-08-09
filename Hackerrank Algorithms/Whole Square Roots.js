
function getMinimumUniqueSum(param) {

    var quantity = parseInt(Object.keys(param));

    var integers = [];

    ///loop over all the strings
    for (var k=0; k <quantity; k++) {
        var count = 0;

        //make the strings arrays
        var arr1 = param[quantity][k].split(" ");
        for (var i = arr1[0]; i <= arr1[1]; i++) {
            //check if square root is whole number
            if (Math.sqrt(i) == Math.sqrt(i).toFixed()) {
                count++;
            }
        }
        integers.push(count);
    }
    return integers;
}

//getMinimumUniqueSum({0: ['3 0', '17 24']});
getMinimumUniqueSum({2: ['3 9', '12 24']});