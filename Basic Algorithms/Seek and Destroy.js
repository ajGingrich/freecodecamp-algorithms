
function destroyer(arr) {
    var arrayFilter =  [];
    for (var i = 1; i <arguments.length; i++) {
        arrayFilter.push(arguments[i]);
    }

    for (var j=0; j <arguments.length; j++) {
        arr = (arr.filter(function(val) {
                return val != arrayFilter[j];
            })
        );
    }
    window.arguments = arguments;
    return(arr);
}

destroyer([1, 2, 3, 1, 2, 3], 2, 3);

