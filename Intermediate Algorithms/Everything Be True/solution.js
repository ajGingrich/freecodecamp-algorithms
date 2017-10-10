
function truthCheck(collection, pre) {
    for (var i=0; i < collection.length; i++) {
        if (!collection[i][pre]) {
            console.log(collection[i][pre]);
            return false;
        }
    }
    return true;
}
