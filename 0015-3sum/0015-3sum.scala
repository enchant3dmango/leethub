object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val sortedNums = nums.sorted
    val n = sortedNums.length
    var triplets = List.empty[List[Int]]

    for (i <- 0 until n - 2) {
      if (i == 0 || (i > 0 && sortedNums(i) != sortedNums(i - 1))) {
        var left = i + 1
        var right = n - 1

        while (left < right) {
          val sum = sortedNums(i) + sortedNums(left) + sortedNums(right)

          if (sum == 0) {
            triplets = triplets :+ List(sortedNums(i), sortedNums(left), sortedNums(right))

            while (left < right && sortedNums(left) == sortedNums(left + 1)) left += 1
            while (left < right && sortedNums(right) == sortedNums(right - 1)) right -= 1

            left += 1
            right -= 1
          } else if (sum < 0) {
            left += 1
          } else {
            right -= 1
          }
        }
      }
    }
    triplets
  }
}
