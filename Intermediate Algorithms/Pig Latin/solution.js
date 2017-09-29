
function translatePigLatin(str) {
    var arr = str.split("");
    var vowels = ["a", "e", "i", "o", "u"];
    var vindex = [];

    for (var i=0; i < vowels.length; i++) {
        if (arr.indexOf(vowels[i]) != -1) {
            vindex.push(arr.indexOf(vowels[i]));
        }
    }

    var firstVowel = Math.min(/*...vindex*/);
    if (firstVowel == 0) {
        str = str + "way";
    }
    else {
        str = str.slice(firstVowel, str.length) + str.slice(0, firstVowel) + "ay";
    }
    return str;
}

translatePigLatin("consonant");
translatePigLatin("andrew");
translatePigLatin("glove");
