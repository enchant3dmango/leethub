/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    var inc_bit : Int = 0
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        var inc_bit : Int = 0
        inc_add(l1, l2, inc_bit)
    }
    def inc_add(l1: ListNode, l2: ListNode, inc_bit : Int) : ListNode = {
        var Inc_bit = inc_bit
        val inc = (x1 : Int, x2 : Int) =>{
            var res : Int = x1 + x2 + Inc_bit
            Inc_bit = res / 10
            res = res % 10
            res
        }
        
        if(l1 == null && l2 == null && Inc_bit == 0)
            null
        else if(l1 == null && l2 == null && inc_bit != 0){
            new ListNode(inc_bit)
        }
            
        else if(l2 == null && l1 != null){
            var thisnode = ListNode(inc(l1.x, 0))
            thisnode.next = inc_add(l1.next, null, Inc_bit)
            thisnode
        }
             
        else if(l1 == null && l2 != null){
            var thisnode = ListNode(inc(0, l2.x))
            thisnode.next = inc_add(null, l2.next, Inc_bit)
            thisnode
        }
            
        else{
            var thisnode = ListNode(inc(l1.x, l2.x))
            thisnode.next = inc_add(l1.next, l2.next, Inc_bit)
            thisnode
        }
    }
}