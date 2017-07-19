
var sum = 0;
var index = 0;

function pairwise(arr, arg) {
    var matched = false;

    console.log("arr: " + arr);
    if (arr.length > 1) {
        //check the first one
        for (var i=1; i<arr.length; i++) {
            if (arr[0] + arr[i] === arg) {
                
                sum += (2 *index) + arr.indexOf(arr[i]);
                //console.log("sum: " + sum);

                //strip numbers so they can't be used again second number first but keep index placeholder
                arr.splice(i, 1, "not a number");
                //now remove first number
                arr.splice(0,1);

                //increase the index
                index++;

                //now recursive function again
                pairwise(arr,arg);
                matched = true;
            }
        }

        if (matched == false) {
            ///strip first number if it didn't match any, strip index, and perform recursive
            index++;
            arr.splice(0, 1);
            pairwise(arr, arg);
        }

    }
    else {
        //return the sum of the indices
        console.log(sum);
    }
}

pairwise([1, 4, 2, 3, 0, 5], 7);