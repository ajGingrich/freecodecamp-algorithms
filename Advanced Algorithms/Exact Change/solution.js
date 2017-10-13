
function checkCashRegister(price, cash, cid) {
    //get quantity
    var change = cash - price;
    //reverse array
    cid.reverse();

    //make array with unit value
    var values = [100,20,10,5,1,0.25,0.1,0.05,0.01];

    var cambio = [];
    var drawer;
    //start checking if the bill or quantity can be used to pay for the change.
    for (var i=0; i <cid.length; i++) {
        if ((change / values[i]) >= 1 && cid[i][1] >= values[i]) {
            drawer = (Math.floor(change/values[i]))*values[i];
            if (drawer > cid[i][1]) {
                drawer = cid[i][1];
            }
            cambio.push([cid[i][0], drawer]);
            change -= drawer;
            change = Math.round(change*100)/100;
            cid[i][1] -= drawer;
        }
    }
    // return insufficient funds
    if (drawer < change) {
        return "Insufficient Funds";
    }
    // drawer closed
    var cashLeft = 0;
    for (var j=0; j <cid.length; j++) {
        cashLeft += cid[j][1];

    }
    if (cashLeft === 0) {
        return "Closed";
    }
    //return change
    return cambio;
}