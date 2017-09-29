
function myReplace(str, before, after) {
    var arr = str.split(" ");
    if (before[0] === before[0].toUpperCase()) {
        after = after[0].toUpperCase() + after.slice(1, after.length);
    }
    for (var i=0; i < arr.length; i++) {
        if (arr[i] == before) {
            arr[i] = after;
        }
    }
    str = arr.join(" ");
    return str;
}

myReplace("A quick brown fox jumped over the lazy dog", "jumped", "leaped");