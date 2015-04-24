package com.mkdesignsoftware.testingtortuga;

/**
 * Question file processor and loading mechanism for Testing Tortuga.
 * Shared class across all Testing Tortuga for _____ products.
 * Created by mkdesign on 4/21/2015.
 */

import android.app.Activity;
import java.io.InputStream;
import java.io.*;
import java.util.*;

public class questionProcessor extends Activity {

    String question;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    String answerE;
    String correctAnswer;
    int numberOfQuestions;

    public questionProcessor(String t_question, String t_answerA, String t_answerB, String t_answerC,
                             String t_answerD, String t_answerE, String t_correctAnswer) {
        t_question = question;
        t_answerA = answerA;
        t_answerB = answerB;
        t_answerC = answerC;
        t_answerD = answerD;
        t_answerE = answerE;
        t_correctAnswer = correctAnswer;
    }
}