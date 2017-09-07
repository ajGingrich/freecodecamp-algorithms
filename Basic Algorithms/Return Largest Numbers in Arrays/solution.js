

function largestOfFour(arr) {
    var largest1 = 0;
    var largest2 = 0;
    var largest3 = 0;
    var largest4 = 0;
    for (var i=0; i < 4; i++) {
        if (arr[0][i] > largest1) {
            largest1 = arr[0][i];
        }
    }
    for (var i=0; i < 4; i++) {
        if (arr[1][i] > largest2) {
            largest2 = arr[1][i];
        }
    }
    for (var i=0; i < 4; i++) {
        if (arr[2][i] > largest3) {
            largest3 = arr[2][i];
        }
    }
    for (var i=0; i < 4; i++) {
        if (arr[3][i] > largest4) {
            largest4 = arr[3][i];
        }
    }
    var res = [largest1, largest2, largest3, largest4];
    return res;
}


largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);

