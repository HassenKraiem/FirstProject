//First methode :
fun main () {
    val image = listOf(
        listOf(1, 1, 0, 0, 0, 1),
        listOf(1, 1, 0, 0, 0, 1),
        listOf(1, 1, 1, 1, 1, 1),
        listOf(1, 1, 1, 1, 1, 1)
    )
    println(findRectangle(image))


}
fun findRectangle1(list: List<List<Int>>):List<Int>{
    val newList1= mutableListOf<List<Int>>()
    val newList2=mutableListOf<Int>()
    for (list1 in list){
        if (0 in list1){
            newList1.add(list1)
            newList2.add(list.indexOfFirst { it===list1 })

        }
    }
    return listOf(newList2[0],newList1[0].indexOf(0),newList2.last(),newList1.last().indexOfLast { it==0 })


}
