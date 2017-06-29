
function getIndexToIns(arr, num) {
    var arrSorted = arr.sort(function(a,b) {
        return a - b;
    });
    if (num <= arrSorted[0]) {
        b = 0;
        return b;
    }
    else {
        for (var i=0; i < arrSorted.length; i++) {
            if (arrSorted[i] < num ) {
                var b = i+1;
            }
        }
        window.arrSorted = arrSorted;
        return b;
    }

}

getIndexToIns([5, 3, 20, 3], 5);