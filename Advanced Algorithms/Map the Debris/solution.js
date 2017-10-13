
function orbitalPeriod(arr) {
    var GM = 398600.4418;
    var earthRadius = 6367.4447;

    var result = [];

    //loop for more than one case
    for (var i =0; i <arr.length; i++) {
        var r = earthRadius + arr[i].avgAlt;
        var orbitalP = Math.round(2*Math.PI*(Math.sqrt((Math.pow(r, 3))/GM)));
        result.push({"name": arr[i].name, "orbitalPeriod": orbitalP});
    }

    return result;
}
