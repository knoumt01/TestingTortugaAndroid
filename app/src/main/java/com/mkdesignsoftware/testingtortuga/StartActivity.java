package com.mkdesignsoftware.testingtortuga;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import android.content.Context;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class StartActivity extends ActionBarActivity {


    int numberOfQuestions = 11;
    public String[] question = new String[numberOfQuestions];
    public String[] answerA = new String[numberOfQuestions];
    public String[] answerB = new String[numberOfQuestions];
    public String[] answerC = new String[numberOfQuestions];
    public String[] answerD = new String[numberOfQuestions];
    public String[] answerE = new String[numberOfQuestions];
    String[] correctAnswer = new String[numberOfQuestions];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loadQuestions();
        //loadProblems();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Question loading functions and declarations
     */


    public void loadQuestions()  throws IOException {



        // modified previous Buffered Reader / File Reader for compatibility with Android
        FileInputStream fs;
        String strFilename = "questions.txt";
        FileInputStream fs = openFileInput(strFilename);
        StringBuffer sBuffer = new StringBuffer();
        BufferedReader dataIO = new BufferedReader(new InputStreamReader(fs));
        String textData = dataIO.readLine();
        StringTokenizer st = new StringTokenizer(textData, "|", false);

        for (int i = 0; i < numberOfQuestions; i++) {
            question[i] = st.nextToken();
            answerA[i] = st.nextToken();
            answerB[i] = st.nextToken();
            answerC[i] = st.nextToken();
            answerD[i] = st.nextToken();
            answerE[i] = st.nextToken();
            correctAnswer[i] = st.nextToken();
        }
    }

    int counter = 0;
    Problem probList[];
    public void loadProblems()  {
        counter = (int)(numberOfQuestions * Math.random());
        probList[counter] = new Problem(question[counter],answerA[counter],
                answerB[counter],answerC[counter],answerD[counter],answerE[counter],
                correctAnswer[counter]);
    }
}