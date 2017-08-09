
function doesCircleExist(commands) {
    var results = [];

    for (var i=0; i <commands.length; i++) {

        //set robots initial index
        var index = [0, 0];
        //set initial direction to forward
        var direction = "north";

        //split all of commands into another array
        var movement = commands[i].split('');
        console.log(movement);
        for (var k=0; k < movement.length; k++) {

            if (movement[k] === 'G' ) {
                //go a specific direction
                if (direction === "north") {
                    index[1] += 1;
                }
                else if (direction === "east") {
                    index[0] += 1;
                }
                else if (direction === "south") {
                    index[1] -= 1;
                }
                else if (direction === "west") {
                    index[0] -= 1;
                }
            }
            else if (movement[k] === 'L') {
                ///set depending on initial direction
                if (direction === "north") {
                    direction = 'west';
                }
                else if (direction === "east") {
                    direction = 'north';
                }
                else if (direction === "south") {
                    direction = 'east';
                }
                else if (direction === "west") {
                    direction = 'south';
                }
            }
            else if (movement[k] === 'R') {
                ///set depending on initial direction
                if (direction === "north") {
                    direction = 'east';
                }
                else if (direction === "east") {
                    direction = 'south';
                }
                else if (direction === "south") {
                    direction = 'west';
                }
                else if (direction === "west") {
                    direction = 'north';
                }
            }
        }
        console.log(index);
        if (index[0] === 0 && index[1] === 0) {
            results.push('YES')
        }
        else {
            results.push('NO')
        }
    }

    return results;

}

//doesCircleExist(['GRGL']);
doesCircleExist(['G','L']);