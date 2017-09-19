function rot13(str) { // LBH QVQ VG!
    var arrayStr = [];
    var resUTF = [];

    for (var i=0; i < str.length; i++) {
        arrayStr[i] = str.charCodeAt(i);
    }
    for (var j=0; j < str.length; j++) {
        if (arrayStr[j] >= 65 && arrayStr[j] <= 77) {
            resUTF[j] = arrayStr[j] + 13;
        }
        else if (arrayStr[j] > 77 && arrayStr[j] < 91) {
            resUTF[j] = arrayStr[j] - 13;
        }
        else {
            resUTF[j] = arrayStr[j];
        }
    }
    window.arrayStr = arrayStr;
    window.resUTF = resUTF;
    var res = String.fromCharCode.apply(String, resUTF);
    return res;
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");