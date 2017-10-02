
function uniteUnique(arr) {
    var args = Array.prototype.slice.call(arguments);
    var array = [];
//split into multiple arrays
    for (var j=0; j <args.length; j++ ) {
        var x = args[j];
        for (var i=0; i <x.length; i++) {
            var index = x[i];
            if (array.indexOf(index) == -1) {
                array.push(index);
            }
        }
    }

    return array;

}

uniteUnique([1, 3, 2], [5, 2, 1, 4], [2, 1]);
