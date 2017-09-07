
function truncateString(str, num) {
    if (str.length > num) {
        if (num <= 3) {
            var a = str.slice(0, num) + "...";
            return a;
        }
        else {
            a = str.slice(0,num-3) + "...";
            return a;
        }

    }
    else {
        a = str;
        return a;
    }
}

truncateString("A-tisket a-tasket A green and yellow basket", 11);

