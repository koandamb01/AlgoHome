function coinChange(change) {
  var coin = {
    quarters: 0,
    dimes: 0,
    nickels: 0,
    pennies: 0
  };

  var divider = [25, 10, 5, 1];

  for (var i = 0; i < 4; i++) {
    if (divider[i] == 25) {
      coin.quarters = Math.floor(change / divider[i]);
    } else if (divider[i] == 10) {
      coin.dimes = Math.floor(change / divider[i]);
    } else if (divider[i] == 5) {
      coin.nickels = Math.floor(change / divider[i]);
    } else {
      coin.dimes = change;
    }
    change = change % divider[i];
  }

  return coin;
}
