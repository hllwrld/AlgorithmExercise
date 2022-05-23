package com.hllwrld.AlgorithmExercise

import java.util.*

class CQueue() {

    val stack1=  Stack<Int>()
    val stack2 = Stack<Int>()


    fun appendTail(value: Int) {
        stack1.push(value)
    }

    fun deleteHead(): Int {
        if (!stack2.empty()) {
            return stack2.pop()
        }
        if (stack1.isEmpty()) {
            return -1;
        }


        while (!stack1.isEmpty()) {
            val temp = stack1.pop()
            stack2.push(temp)
        }
        return stack2.pop()
    }

}

/**
 * Your CQueue object will be instantiated and called as such:
 * var obj = CQueue()
 * obj.appendTail(value)
 * var param_2 = obj.deleteHead()
 */