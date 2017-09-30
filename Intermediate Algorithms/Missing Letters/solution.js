function fearNotLetter(str) {
    var arr = str.split("");

    //convert to numbers
    for (var i =0; i < arr.length; i++) {
        arr[i] = arr[i].charCodeAt(0);
    }

    //check which is missing
    for (var j=0; j < arr.length-1; j++) {
        if (arr[j+1] - arr[j] != 1) {
            var miss = arr[j] + 1;
            console.log(miss);
        }
    }

    //return number
    if (miss > 0) {
        var x = String.fromCharCode(miss);
        return x;
    }

}

//fearNotLetter("abce");
//fearNotLetter("abcdefghjklmno");
fearNotLetter("bcd");
