
function chunkArrayInGroups(arr, size) {
    var a = [];
    var x = [];
    for (var i=0; i < (arr.length/size); i++) {
        x = arr.slice(size*i, size*(i+1));
        a.push(x);
    }
    return a;
}

chunkArrayInGroups(["a", "b", "c", "d"], 2);

