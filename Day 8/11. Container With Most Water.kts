import kotlin.math.max
import kotlin.math.min

val height = arrayOf(1,1)

var maxWater = 0

var lp = 0
var rp = height.size - 1
var width = 0
var currWater = 0
var ht = 0

while (lp < rp) {
    width = rp - lp
    ht = min(height[lp], height[rp])
    currWater = width * ht

    maxWater = max(maxWater, currWater)

    if (height[lp] < height[rp]) {
        lp++
    }
    else {
        rp--
    }
}

print(maxWater)