
function longestEvenWord(sentence) {

    var longest = 0,
        longestIndex = 0;

    //split each word into an array
    var arr = sentence.split(' ');

    for (var i=0; i <arr.length; i++) {

        //check to make sure length is even first before check number of letters
        if (arr[i].length % 2 == 0) {
            //detonate longest word and note index
            if (arr[i].length > longest) {
                longest = arr[i].length;
                longestIndex = i;
            }
        }
    }
    //only return if there is an even word
    if (longest > 0) {
        return arr[longestIndex];
    }
    else {
        return '00';
    }

}

longestEvenWord('You can do it the way you like');