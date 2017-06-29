function telephoneCheck(str) {
    // Good luck!
    var arr = str.split('');
    var regEx = /^\d|\(|\)|-|\s/;
    //check if number has characters that are not number -, or (

    for (var k=0; k<arr.length; k++) {
        if (!regEx.test(arr[k])) {
            return false;
        }
    }
    //hyphens
    var hyphenTrue;
    var hyphenEx = /-/;
    for (var z=0; z<arr.length; z++) {
        if (hyphenEx.test(arr[z])) {
            hyphenTrue = true;
        }
    }
    var oneH = /\d\d\d-\d\d\d\d/;
    //var twoH = /\d\d\d-\d\d\d-\d\d\d\d/;
    if (hyphenTrue) {
        str = arr.join('');
        console.log(str);
        if (!oneH.test(str) || str[0] == '-') {
            return false;
        }
    }

    //Remove all hyphens ----check it out
    arr = str.replace(/[^0-9\(|\)]/g, '').split('');

    //Convert to numbers
    var parse = function() {
        for (var i=0; i<arr.length; i++) {
            arr[i] = parseInt(arr[i], 10);
        }
    };
    parse();

    console.log(arr.length);
    console.log(arr);
    //check if they are actually numbers
    if (arr.length == 10) {
        return true;
    }
    else if (arr.length == 11 && arr[0] == 1) {
        return true;
    }
    else if (arr.length == 12 && (isNaN(arr[0])) && (isNaN(arr[4]))) {
        return true;
    }
    else if (arr.length == 13 && (isNaN(arr[1])) && (isNaN(arr[5])) && arr[0] == 1) {
        return true;
    }
    else {
        return false;
    }
}