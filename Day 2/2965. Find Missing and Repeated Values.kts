val grid = arrayOf(
    intArrayOf(9,1,7),
    intArrayOf(8,9,2),
    intArrayOf(3,4,6)
)

val n = grid.size
val map = mutableMapOf<Int, Int>()
val set = mutableSetOf<Int>()
val ans = IntArray(2)

for (arr in grid) {
    for (num in arr) {
        map[num] = map.getOrDefault(num, 0) + 1
        set.add(num)
    }
}

for ((key, value) in map) {
    if (value == 2) {
        ans[0] = key
        break
    }
}

for (i in 1..(n*n)) {
    if (i !in set) {
        ans[1] = i
        break
    }
}

print("${ans[0]} ${ans[1]}")