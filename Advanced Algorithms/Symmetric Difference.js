
function sym(placeholder) {
    //turn args into array
    var args =Array.prototype.slice.call(arguments);

    //find symmetric difference in between two arrays
    var sDiff = function(arr1, arr2) {
        var arrDiff = [];
        for (var i=0; i<arr1.length; i++) {
            if (arr2.indexOf(arr1[i]) == -1 ) {
                arrDiff.push(arr1[i]);
            }
        }
        for (var j=0; j<arr2.length; j++) {
            if (arr1.indexOf(arr2[j]) == -1 ) {
                arrDiff.push(arr2[j]);
            }
        }
        arrDiff.sort(function(a,b) {
            return a-b;
        });
        return arrDiff;
    };

    //reduce array using symmetric
    var answer = args.reduce(sDiff);

    //filter duplicate results
    answer = answer.filter(function(item, pos, self){
        return self.indexOf(item) == pos;
    });


    return answer;
}
