
function pairElement(str) {
    var arr = str.split("");

    for (var i = arr.length; i >= 1; i--) {
        var letter = arr[i-1];
        switch (letter) {
            case ("C"):
                arr.splice(i, 0, "G");
                break;
            case ("G"):
                arr.splice(i, 0, "C");
                break;
            case ("A"):
                arr.splice(i, 0, "T");
                break;
            case ("T"):
                arr.splice(i, 0, "A");
                break;
        }

    }
    var j,k;
    var x = [];
    for (j = 0, k = 0; j < arr.length; j += 2, k++) {
        x[k] = arr.slice(j, j+2);
    }

    return x;

}

pairElement("GCG");

