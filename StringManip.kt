
//Did not save the question in the interview for this answer
fun find(integers: Array<Int>): Int {

    var holderEven=0
    var evenCheck=0
    var holderOdd=1
    var oddCheck=0
    for( i in integers){
        if (i%2==0){
            holderEven=i
            evenCheck++
        }
        if(i%2==1){
            holderOdd=i
            oddCheck++
        }
    }
    if(evenCheck>oddCheck){
        return holderEven
    }

    return holderOdd
}

        fun reverseString(s: CharArray): Unit {
            var intermediate:Char
            var count:Int=0
            //count=0
            for(i in s){
                println("$i ${s[s.size-1-count]} $count")
                intermediate=i

            }

        }
