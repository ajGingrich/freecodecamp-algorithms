
var Person = function(firstAndLast) {
    //Name information from input
    var arr = firstAndLast.split(" ");
    var FirstName = arr[0];
    var LastName = arr[1];

    // Methods //////
    //get names
    this.getFirstName = function() {
        return FirstName;
    };
    this.getLastName = function() {
        return LastName;
    };
    this.getFullName = function() {
        //console.log(this.FirstName + " " + this.LastName);
        return FirstName + " " + LastName;
    };
    // set names //
    this.setFirstName = function(first) {
        FirstName = first;
    };
    this.setLastName = function(last) {
        LastName = last;
    };
    this.setFullName = function(firstAndLast) {
        var arr = firstAndLast.split(" ");
        FirstName = arr[0];
        LastName = arr[1];
    };


};

var bob = new Person('Bob Ross');
bob.getFullName();
console.log(Object.keys(bob).length);
