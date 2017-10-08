function smallestCommons(arr) {
    //get largest
    var largest;
    var smallest;

    if (arr[1] > arr[0]) {
        largest = arr[1];
        smallest = arr[0];
    } else {
        largest = arr[0];
        smallest = arr[1];
    }

    var found = false;
    var scm = largest * (largest - 1);

    while (!found) {
        for (var i=smallest;i <= largest; i++) {
            if (scm % i != 0) {
                scm += largest;
                break;
            }
            if (i == largest && scm % i == 0) {
                found = true;
            }
        }
    }
    return scm;
}
smallestCommons([1,5]);