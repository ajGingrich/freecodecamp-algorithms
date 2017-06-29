
function confirmEnding(str, target) {
    if (str.slice(str.length-target.length, str.length) === target) {
        return true;
    }
    else {
        return false;
    }
}


