A football game ultimately has three possible outcomes (HOME WIN / DRAW / AWAY WIN). Bookmakers offer different odds for each outcome, this is known as a '3-Way' bet. (The Odds are related to the relative probabilities)

"The house always wins"... They do this by proportionally reducing the true odds which causes the 'book' to exceed 100%. The percentage over is known as the 'bookmakers margin' and it represents their expected profits. Mathematically, for real life examples, the sum of probabilities for all possibilities (the book) must be 1.00 or 100%.

##Task

Write a function takes the bookies odds and returns the 'true' odds. The odds are entered as fractional odds displayed in a 2D array. For example 3-5 = [3,5].


input:    [homeWinOdds, drawOdds, awayWinOdds]
output:   [trueHomeOdds, trueDrawOdds, trueAwayOdds]

             Bookmakers Odds                True Odds
Eg:      [ [3,5], [7,5], [19,5] ] --> [ [1,1], [2,1], [5,1] ]
Note: You'll need to reduce fractions to get your final answer, It's worth completing this Kata before hand. https://www.codewars.com/kata/576400f2f716ca816d001614.

Useful Resources: https://en.wikipedia.org/wiki/Mathematics_of_bookmaking http://www.wikihow.com/Calculate-Odds