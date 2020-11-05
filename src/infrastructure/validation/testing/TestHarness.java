/**
 * @author        Abhishek Saran
 * @author        Manas Sanjay
 * @module        Infrastructure module 
 * @team          Test Harness
 * @description   Test Harness main class
 * @summary       To provide functionality to tester to run test case sets in various ways- 
                  Methods such as runAll(), runByName(), runByCategroy() and run by  Priority() are provided. 
 */

package infrastructure.validation.testing;

public class TestHarness{

  private String savePath;
  
  void setSavePath(String path){
    this.savePath=path;
  }
  
  void getSavePath(){
    return this.savePath;
  }
  
  /* 
  * Manas Sanjay may start righting his two methods runByCategroy() and run by Priority() from here. 
  * The guideline to avoid merge conflicts is as follows-
  * The spacing must follow a tab being two spaces otherwise identation may get messy with tabs + spaces combination.
  * If one is using file editor gedit, then tab width has to be 2 spaces with use spaces option enabled. 
  * Please don't edit anything beyond the space alloted to you otherwise we might get into a messy merge conflict.
  * 
  * For your two methods and their javadocs, 90 lines of code space(line no 38 - line no 127) is alloted to you. 
  * In case A) you need more lines to be alloted or B) there is any need to make some changes outside the alloted space, 
  * A pull request has to be made on my branch.
  * I'll merge your branch and A) modify my branch to make requested changes or B) give some more lines of code space in my branch. 
  * You need to then fetch my branch and again make a pull request on my branch for final merge.
  */
  //Manas's code starts from here.


























































































  // Manas's code finishes here

  void runAll(){
 	 
  }  
  
 /**
  * Boolean method to give result of the Test Case Class
  * @param testName    The file name of test case class including .java extension
  * @return    <code>true</code> if the test case pass 
  *     and actual output is same as expected output; 
  *     <code>false</code> otherwise.
  */
  public boolean runByName(String testName){
    String[] arrOfStr = str.split(".", 2); 
    String testClassName = arrOfStr[0];
    TestCase test = Class.forName(testClassName).newInstance();
    bool result = test.run();
    
    //after saving the result using logger
    return result;
  }

}
