import kotlin.math.absoluteValue

val x:Double = 2.00000
val n:Int = -2147483648

var ans: Double = 1.00000
var x1: Double = x.absoluteValue
var n1: Long = n.toLong().absoluteValue
//if (n < 0) {
//    if (x1 != 0.000){
//        x1 = 1/x1
//        n1 = -n.toLong()
//    }
//}
while (n1 > 0) {
    if (n1 % 2 == 0L) {
        x1 *= x1
        n1 /= 2
    } else {
        ans *= x1
        n1--
    }
}
if (n<0) {
    ans = 1/ans
}

if (x < 0 && n % 2 != 0) {
    ans = -ans
}
print(ans)