
// Wherefore are though
function whatIsInAName(collection, source) {
    var arr = collection.filter(function(item) {
        for (var i in source) {
            if (source[i] != item[i]) {
                return false;
            }
        }
        return true;
    });
    return arr;
}

whatIsInAName([{ "a": 1 }, { "a": 1 }, { "a": 1, "b": 2 }], { "a": 1 });



