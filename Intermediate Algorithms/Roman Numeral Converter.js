
function convertToRoman(num) {
    var roman = [];
    var numbers = ["I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL",
        "L", "LX", "LXX", "LXXX", "XC", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC",
        "CM"];
    var thousands = (Math.floor(num/1000)*1000);
    for (var i=0; i < thousands; i += 1000) {
        roman.push("M");
    }
    //console.log(thousands);
    var hundreds = (Math.floor(((num-thousands)/100))*100);
    if (hundreds != 0) {
        roman.push(numbers[17+(hundreds/100)]);
    }
    //console.log(hundreds);

    var tens = (Math.floor(((num-thousands-hundreds)/10))*10);
    if (tens != 0) {
        roman.push(numbers[8 + (tens/10)]);
    }
    //console.log(tens);

    var ones = Math.floor(num-thousands-hundreds-tens);
    if (ones != 0 ) {
        roman.push(numbers[ones-1]);
    }

    //console.log(ones);

    var romanStr = roman.join("");
    return romanStr;
}

convertToRoman(500);

