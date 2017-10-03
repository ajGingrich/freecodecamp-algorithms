
function convertHTML(str) {
    str = str.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;");
    str = str.replace(/"/g, "&quot;").replace(/'/g, "&apos;");
    return str;
}

//convertHTML("Dolce & Gabbana");
convertHTML("Hamburgers < Pizza < Tacos");
