
function permAlone(str) {
    //make str into array
    var arr = str.split('');
    var allArrays = [];
    //Heap's Algorithm to make new array with all permutations

    var dups = /([a-z])\1/;

    var swap = function (array, pos1, pos2) {
        var temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;

    };

    var permute = function(array, n) {
        n = n || array.length;
        if (n === 1 ) {
            //console.log(array);
            allArrays.push(array.slice(0));
        }
        else {
            for (var i=1; i <= n; i += 1) {
                permute(array, n-1);
                if (n%2) {
                    var j=1;
                }
                else {
                    j=i;
                }
                swap(array, j-1, n-1);
            }
        }

    };
    permute(arr);

    //make each small array into a string
    for (var i=0; i < allArrays.length; i++) {
        allArrays[i] = allArrays[i].join("");
    }

    //filter out Dups
    allArrays = allArrays.filter(function(value) {
        return !dups.test(value);
    });
    //console.log(allArrays);
    return allArrays.length;
}