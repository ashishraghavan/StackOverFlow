//https://stackoverflow.com/questions/56660027/my-listview-does-not-print-out-my-array-list-after-importing-it-from-my-file?noredirect=1#comment99890597_56660027

package com.stackoverflow;

import java.util.List;
import java.util.logging.Logger;

public class StackOverFlow_question_56660027 {

    private static Logger logger = Logger.getLogger(StackOverFlow_question_56660027.class.getSimpleName());
    public static void main(String[] args) {
        try {
            FileWritter fl = new FileWritter();
            List<String> mStringList = fl.loadlist2();
            if(mStringList != null) {
                logger.info("Success");
            }
        } catch (Exception e) {
            logger.severe("There was an error retrieving contents from DairyNames.txt with exception "+e.getLocalizedMessage());
        }
    }
}
