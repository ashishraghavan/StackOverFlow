package com.stackoverflow;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {
        //avoid blocking the main thread
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                try {

                    new MainScreen();
                } catch (IOException e) {
                    e.printStackTrace();
                };
            }
        });
    }
}
