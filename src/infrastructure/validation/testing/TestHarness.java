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
import java.io.File;

public class TestHarness{
  
  private String savePath;
  
  void setSavePath(String path){
    this.savePath=path;
  }
  
  String getSavePath(){
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

 /**
  * Run all test cases of all modules one by one 
  */
  void runAll(){
  
    //get all the test cases in infrastucture module
    File testFolderInfrastucture = new File("../../../infrastucture/tests");
    File[] listOfTests1 = testFolderInfrastucture.listFiles();
    System.out.println("Running all the test cases of infrastucture module...");
    for(File file : listOfTests1){
      if(file.isFile()){
        runByName(file.getName());
      }
    }
    
    //get all the test cases in networking module
    File testFolderNetworking = new File("../../../networking/tests");
    File[] listOfTests2 = testFolderNetworking.listFiles();
    System.out.println("Running all the test cases of networking module...");
    for(File file : listOfTests2){
      if (file.isFile()){
        runByName(file.getName());
      }
    }

    //get all the test cases in processing module
    File testFolderProcessing = new File("../../../processing/tests");
    File[] listOfTests3 = testFolderProcessing.listFiles();
    System.out.println("Running all the test cases of processing module...");
    for(File file : listOfTests3){
      if(file.isFile()){
        runByName(file.getName());
      }
    }
    
    //get all the test cases in UI module
    File testFolderUI = new File("../../../UI/tests");
    File[] listOfTests4 = testFolderUI.listFiles();
    System.out.println("Running all the test cases of UI module...");
    for(File file : listOfTests4){
      if(file.isFile()) {
        runByName(file.getName());
      }
    }
    
}
	  
 
  
 /**
  * Boolean method to give result of the Test Case Class
  * @param testName    The absoulete path to file name of test case class including .java extension as a string
  * @return    <code>true</code> if the test case pass 
  *     and actual output is same as expected output; 
  *     <code>false</code> otherwise.
  */
  public boolean runByName(String testName){
    String[] arrOfStr = testName.split(".", 2); 
    String testClassName = arrOfStr[0];
    Class<?> clazz = Class.forName("testClassName");
    Object test = clazz.getDeclaredConstructor().newInstance();
    boolean result = test.run();
    
    //after saving the result using logger
    return result;
  }

}
