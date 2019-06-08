package com.stackoverflow.angela;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestJSON {

    private static File json;
    private static Logger jsonLogger = Logger.getLogger(TestJSON.class.getSimpleName());

    public static void main(String[] args) {
        try {
            json = new File("/Users/ashishraghavan/Production/StackOverFlow/JSON_From_https-::stackoverflow.com:questions:56501897:how-do-i-retrieve-json-from-a-deep-nested-object#56501897.json");
            Type listType = new TypeToken<ArrayList<JSONTest>>(){}.getType();
            //JSONTest jsonTest = new Gson().fromJson(new FileReader(json),JSONTest.class);
            List<JSONTest> jsonTestList = new Gson().fromJson(new FileReader(json),listType);
            if(jsonTestList.size() > 0) {
                JSONTest jsonTest1 = jsonTestList.get(1);
                System.out.println(jsonTest1.getBusyAt().get(0).getEvents().get(0).getStartedAt());
                System.out.println(jsonTest1.getBusyAt().get(0).getEvents().get(0).getEndedAt());
            }

        } catch (Exception e) {
            jsonLogger.severe("There was an error parsing the JSON with messsage "+e.getLocalizedMessage());
        }
    }
}
