val nums = intArrayOf(1)

val map = mutableMapOf<Int, Int>()
var ans: Int = 0

for (num in nums) {
    map[num] = map.getOrDefault(num, 0) + 1
}

for ((key, value) in map) {
    if (value == 1) ans = key
}

print(ans)