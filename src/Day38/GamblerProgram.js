let money = 100;
let bets = 0;
let wins = 0;

while(money > 0 && money < 200) {

    let gamble = Math.floor(Math.random() * 2);

    if(gamble == 1) {
        money++;
        wins++;
    } else {
        money--;
    }

    bets++;
}

console.log("Final Money: " + money);
console.log("Total Bets: " + bets);
console.log("Wins: " + wins);