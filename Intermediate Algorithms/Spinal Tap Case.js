
function spinalCase(str) {

    str = str.replace(/([a-z])([A-Z])/g, "$1 $2" ).toLowerCase().replace(/\W/g, "-").replace(/_/g, "-");

    return str;
}

//spinalCase('This Is Spinal Tap');
//spinalCase("The_Andy_Griffith_Show");
spinalCase("thisIsSpinalTap");