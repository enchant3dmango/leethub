object Solution {

  def romanToInt(s: String): Int = {
    // Map to store roman numerals
    val romanMap = Map(
      'I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000
    )
    
    // Length of the given string
    val n = s.length
    // Variable to store result
    var num = romanMap(s.charAt(n - 1))
    
    // Loop for each character from right to left
    for (i <- n - 2 to 0 by -1) {
      // Check if the character at the right of the current character is
      // bigger or smaller
      if (romanMap(s.charAt(i)) >= romanMap(s.charAt(i + 1))) {
        num += romanMap(s.charAt(i))
      } else {
        num -= romanMap(s.charAt(i))
      }
    }
    num
  }
}
