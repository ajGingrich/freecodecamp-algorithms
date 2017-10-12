function addTogether() {
    //get global arguments
    var arg1 = arguments[0];
    var arg2 = arguments[1];

    //set callback function
    var sum1 = function(z) {
        if (typeof z === "number") {
            return arg1 + z;
        }
    };

    //check to make sure they are numbers
    // &&
    if (typeof arg1 !== "number") {
        return undefined;
    }
    else {
        if (arguments.length == 2) {
            if (typeof arg1 === "number" && typeof arg2 === "number") {
                return  arg1 + arg2;
            }
        }
        else {
            return sum1;

        }
    }
}