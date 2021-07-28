package utils.dataProviders

import org.testng.annotations.DataProvider

/**
 * Test data provider for factorial calculation operation
 */
class FactorialDataProvider {
  /**
   * This method provides valid input and its factorial value
   * @return array
   */
  @DataProvider(name = "factorialValues")
  static Object[][] factorialValues() {
    ArrayList<Integer> inputValues = [0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 45, 77, 100, 134, 999]
    def array = []
    inputValues.eachWithIndex{ it, i ->
      array << [it,factorial(it)] }
    return array }

  /**
   * This method provides invalid numeric values
   * @return array
   */
  @DataProvider(name = "invalidNumericValues")
  static Object[][] invalidNumericValues() {
    def array = [-1,000,05,050,5.6,-8.2,5.0]
    return array }

  /**
   * This method provides valid input values and expected GUI messages
   * @return array
   */
  @DataProvider(name = "factorialValidInputs")
  static Object[][] factorialValidInputs() {
    ArrayList<Integer> inputValues = [0, 1, 2, 5, 10, 25, 120]
    def array = []
    inputValues.eachWithIndex{ it, i ->
      array << [it,"The factorial value is : " + factorial(it)] }
    return array }

  /**
   * This method provides invalid input values and expected GUI error messages
   * @return array
   */
  @DataProvider(name = "factorialInvalidInputs")
  static Object[][] factorialInvalidInputs() {
    def array = [['-1','Invalid result Message'],
                 ['00','Invalid result Message'],
                 ['5.6','Invalid result Message'],
                 ['05','Invalid result Message'],
                 [' ','Invalid result Message'],
                 ['!','Invalid result Message'],
                 ['@','Invalid result Message'],
                 ['$$','Invalid result Message'],
                 ['@','Invalid result Message'],
                 ['','Invalid result Message'],
                 ['e','Invalid result Message'],
                 ['5 3','Invalid result Message'],
                 ['6a','Invalid result Message'],
                 ['7$','Invalid result Message'],
                 ['.','Invalid result Message'],
                 ['+4','Invalid result Message']]
    return array }

  /**
   * Method called to perform factorial of a given number
   * @param n
   * @return array
   */
  static long factorial(int n){
    return ( n==0 ? 1 : n*factorial(n-1) ) }
}
