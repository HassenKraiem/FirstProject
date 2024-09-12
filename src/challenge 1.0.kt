//Second methode 
fun main () {
    val image1 = listOf(
        listOf(1, 1, 0, 0, 0, 1),
        listOf(1, 1, 0, 0, 0, 1),
        listOf(1, 1, 1, 1, 1, 1),
        listOf(1, 1, 1, 1, 1, 1)
    )
    val image2 = listOf(
        listOf(1, 0, 0, 1, 1, 1),
        listOf(1, 0, 0, 1, 1, 1),
        listOf(1, 0, 0, 1, 1, 1))

    val image3 = listOf(
        listOf(1, 1, 1, 1, 1),
        listOf(1, 1, 1, 0, 0),
        listOf(1, 1, 1, 0, 0),
        listOf(1, 1, 1, 0, 0),
        listOf(1, 1, 1, 0, 0))
    println(findRectangle(image1))
    println(findRectangle(image2))
    println(findRectangle(image3))



}
fun findRectangle(list: List<List<Int>>):List<Int>{
    val list1= list.first { 0 in it }
    val list2 =list.last { 0 in it  }

    return listOf(list.indexOfFirst { 0 in it },list1.indexOf(0),list.indexOfLast { 0 in it },list2.lastIndexOf(0))

}
