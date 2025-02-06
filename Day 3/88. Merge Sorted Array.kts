val nums1 = intArrayOf(1,2,3,0,0,0)
val nums2 = intArrayOf(2,5,6)
val m = 3
val n = 3

var k = m-1
var l = n-1

var i = k + l + 1
if (k < 0) k = 0
while (l>=0 && k >= 0) {
    if (nums2[l] >= nums1[k]) {
        nums1[i] = nums2[l]
        l--
    }
    else {
        nums1[i] = nums1[k]
        k--
    }
    i--
}

if (k < 0) {
    for (index in 0..l) {
        nums1[index] = nums2[index]
    }
}

for (num in nums1) {
    print("$num ")
}