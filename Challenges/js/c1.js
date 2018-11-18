// Complete the electionWinner function below.
function electionWinner(votes) {
  let memo = {};
  votes.slice(1).map(vote => {
    if (vote in memo) {
      memo[vote] = memo[vote] + 1;
    } else {
      memo[vote] = 1;
    }
  });

  let winners = [];
  let vote = 0;
  for (let key in memo) {
    if (memo[key] > vote) {
      vote = memo[key];
    }
  }

  for (let key in memo) {
    if (memo[key] === vote) {
      winners.push(key);
    }
  }

  winners.sort();
  return winners.pop();
}

// Complete the maxDifference function below.
function maxDifference(a) {
  let index;
  let max = 0;
  for (let i = 1; i < a.length; i++) {
    for (let j = i - 1; j >= 0; j--) {
      if (a[i] > a[j]) {
        let diff = a[i] - a[j];
        if (diff > max) {
          max = diff;
        }
      }
    }
  }
  return max;
}
