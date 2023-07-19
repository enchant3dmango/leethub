object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        def twoSumRec(initial: Int): Array[Int] = {
            val x = target - nums(initial)
            nums.indexWhere(_ == x, initial+1) match {
                case -1 => twoSumRec(initial+1)
                case idx => Array(initial,idx)
            }
        }
        twoSumRec(0)
    }
}