
function mutation(arr) {
    var secondA = arr.slice(1).join("").toLowerCase();
    var firstA = arr.slice(0,1).join("").toLowerCase();
    window.secondA = secondA;
    window.firstA = firstA;

    for (var i=0; i < secondA.length; i++) {
        if (firstA.indexOf(secondA.charAt(i)) === -1 ) {
            return false;
        }
    }
    return true;
}

mutation(["hello", "hey"]);
