package com.hllwrld.AlgorithmExercise

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

val unit1 = listOf("I", "V", "X")
val unit10 = listOf("X", "L", "C")
val unit100 = listOf("C", "D", "M")
val unit1000 = listOf("M", "", "")




fun rules(num:Int, unit:List<String>) :String {
      return when (num) {
          in 1..3-> unit[0].repeat(num)
          4 -> "${unit[0]}${unit[1]}"
          5 -> unit[1]
          in 6..8->"${unit[1]}${unit[0].repeat(num - 5)}"
          9 -> "${unit[0]}${unit[2]}"
          else->""
      }
}


fun luoMaNum(_num: Int): Flow<Int> = flow{
    check(_num in 1..3999)

    var num = _num


    num.toString().reversed().forEach{
        emit(it.toString().toInt())
    }

}

fun main() = runBlocking <Unit>{

    val flow = luoMaNum(9)

    println(flow.withIndex().map {
        val unit = when(it.index) {
            0 -> unit1
            1-> unit10
            2-> unit100
            3-> unit1000
            else-> emptyList()
        }
        rules(it.value, unit)
    }.reduce{ accumulator, value -> value + accumulator })

}