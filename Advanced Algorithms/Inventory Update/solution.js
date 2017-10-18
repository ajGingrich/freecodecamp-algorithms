
function updateInventory(arr1, arr2) {
    // get properties
    var props1 = [];
    for (var j = 0; j<arr1.length; j++) {
        props1.push(arr1[j][1]);
    }

    for (var i=0; i <arr2.length; i++) {
        if (props1.indexOf(arr2[i][1]) != -1) {
            arr1[props1.indexOf(arr2[i][1])][0] += arr2[i][0];
        }
        else {
            arr1.push(arr2[i]);
        }
    }
    //sort by second column
    function compareSecondColumn(a, b) {
        return a[1] > b[1];
    }
    arr1.sort(compareSecondColumn);
    return arr1;
}
