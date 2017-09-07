
function palindrome(str) {
    var smallS = str.toLowerCase().replace(/\W/g, "").replace(/_/g, "");
    var backwards = smallS.split("").reverse().join("");
    if (backwards === smallS) {
        return true;
    }
    else {
        return false;
    }


}



palindrome("race#   _Car");
