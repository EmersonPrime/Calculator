package com.houarizegai.calculator;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;
import java.lang.Math;

public class CalculatorViewPanel {
    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 840;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 30;

    private JFrame window; // Main window
    private JComboBox<String> comboCalcType, comboTheme;
    private JTextField inText; // Input
    private JButton btnC, btnBack,btnDiv, btnMul, btnSub, btnAdd,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPoint, btnEqual, btnRoot, btnPower, btnLog, btnLn, btnsin,
            btncosine, btntan, btnsininv, btnconinv, btntaninv, btnPi,
            btnParentheses,btnBP, btne, btnNeg;

    public CalculatorViewPanel() {
        window = new JFrame("Calculator");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLocationRelativeTo(null); // Move window to center
        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420, MARGIN_Y + 500, MARGIN_Y + 580, MARGIN_Y + 660 };

        inText = new JTextField("0");
        inText.setBounds(x[0], y[0], 350, 70);
        inText.setEditable(false);
        inText.setBackground(Color.WHITE);
        inText.setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        window.add(inText);

        btnC = initBtn("C", x[0], y[1], event -> {
            inText.setText("0");
        });

        btnParentheses = initBtn("(", x[1], y[1], event -> {

        });

        btnBP = initBtn(")", x[2], y[1], event -> {

        });

        btnBack = initBtn("<-", x[3], y[1], event -> {

        });

        btnLog = initBtn("log", x[0], y[2], event -> {

        });

        btnLn = initBtn("ln", x[1], y[2], event -> {

        });

        btne = initBtn("e", x[2], y[2], event -> {

        });

        btnPower = initBtn("^", x[3], y[2], event -> {

        });

        btnsin = initBtn("sin", x[0], y[3], event -> {

        });

        btncosine = initBtn("cos", x[1], y[3], event -> {

        });

        btntan = initBtn("sin", x[2], y[3], event -> {

        });

        btnPi = initBtn(" π", x[3], y[3], event -> {

        });

        btnsininv = initBtn("sin^-1 ", x[0], y[4], event -> {

        });
        btnsininv.setFont(new Font("Arial", Font.PLAIN, 15));


        btnconinv = initBtn(" cos^-1", x[1], y[4], event -> {

        });
        btnconinv.setFont(new Font("Arial", Font.PLAIN, 15));

        btntaninv = initBtn(" tan^-1", x[2], y[4], event -> {

        });
        btntaninv.setFont(new Font("Arial", Font.PLAIN, 15));

        btnDiv = initBtn(" ÷", x[3], y[4], event -> {

        });


        btn7 = initBtn("7", x[0], y[5], event -> {

        });

        btn8 = initBtn("8", x[1], y[5], event -> {

        });

        btn9 = initBtn("9", x[2], y[5], event -> {

        });

        btnMul = initBtn("*", x[3], y[5], event -> {

        });

        btn4 = initBtn("4", x[0], y[6], event -> {

        });

        btn5 = initBtn("5", x[1], y[6], event -> {

        });

        btn6 = initBtn("6", x[2], y[6], event -> {

        });

        btnSub = initBtn("-", x[3], y[6], event -> {

        });

        btn1 = initBtn("1", x[0], y[7], event -> {

        });

        btn2 = initBtn("2", x[1], y[7], event -> {

        });

        btn3 = initBtn("3", x[2], y[7], event -> {

        });

        btnAdd = initBtn("+", x[3], y[7], event -> {

        });

        btnPoint = initBtn(".", x[0], y[8], event -> {

        });

        btn0 = initBtn("0", x[1], y[8], event -> {

        });

        btnNeg = initBtn("(-)", x[2], y[8], event -> {

        });


        btnEqual = initBtn("=", x[3], y[8], event -> {

        });




        window.setLayout(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button clicked? = End The process
        window.setVisible(true);
    }


    private JButton initBtn(String label, int x, int y, ActionListener event) {
        JButton btn = new JButton(label);
        btn.setBounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
        btn.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event);
        btn.setFocusable(false);
        window.add(btn);

        return btn;
    }


    public static void main(String[] args) {
        new CalculatorViewPanel();
    }

}
