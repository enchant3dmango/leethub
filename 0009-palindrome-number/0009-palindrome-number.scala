object Solution {
	def isPalindrome(x: Int): Boolean = {
		var xstr :String = x.toString
		var xrev :String = xstr.reverse
		
		if(xstr == xrev) return true
    else return false
  }
}