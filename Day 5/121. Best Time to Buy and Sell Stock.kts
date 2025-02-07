import kotlin.math.max
import kotlin.math.min

val prices = arrayOf(2,4,1)

var bestBuy = prices[0]
var maxProfit = 0

for (price in prices) {
    if (bestBuy < price){
        maxProfit = max(maxProfit, price - bestBuy)
    }
    bestBuy = min(bestBuy, price)
}

print(maxProfit)