import kotlin.math.max

val nums = arrayOf(-2,1,-3,4,-1,2,1,-5,4)

var curSum = 0
var maxSum = Int.MIN_VALUE
for (num in nums) {
    curSum += num
    maxSum = max(maxSum, curSum)
    if (curSum < 0) {
        curSum = 0
    }
}

print(maxSum)