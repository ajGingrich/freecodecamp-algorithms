
function repeatStringNumTimes(str, num) {
    var a = "";
    if (num < 0) {
        return a;
    }
    else {

        for (var i=0; i < num; i++) {
            a += str;
        }
        return(a);
    }

}

repeatStringNumTimes("abc", 3);

