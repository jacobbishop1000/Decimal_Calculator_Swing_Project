import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecimalCalculatorUI extends JFrame implements ActionListener {

    DecimalCalculator theCalculator = new DecimalCalculator();
    JLabel displayLabel;

    public DecimalCalculatorUI() {
        super("Hello Swing Calculator");

        // Make fonts bigger in the whole app
        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);

        //0 button
        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            theCalculator.appendToMainNumber("0");
            displayLabel.setText(theCalculator.getMainNumber());
        });
        panel.add(button0, button0constraints);

        //1 button
        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("1");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button1, button1constraints);

        //2 button
        JButton button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("2");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button2, button2constraints);

        //3 button
        JButton button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("3");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button3, button3constraints);

        //4 button
        JButton button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("4");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button4, button4constraints);

        //5 button
        JButton button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("5");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button5, button5constraints);

        //6 button
        JButton button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("6");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button6, button6constraints);

        //7 button
        JButton button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("7");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button7, button7constraints);

        //8 button
        JButton button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("8");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button8, button8constraints);

        //9 button
        JButton button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theCalculator.appendToMainNumber("9");
                displayLabel.setText(theCalculator.getMainNumber());
            }
        });
        panel.add(button9, button9constraints);

        //+ button
        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton, plusButtonConstraints);

        //- button
        JButton minusButton = new JButton("-");
        var minusButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(this);
        panel.add(minusButton, minusButtonConstraints);

        //* button
        JButton multiplicationButton = new JButton("x");
        var multiplicationButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplicationButton.addActionListener(this);
        panel.add(multiplicationButton, multiplicationButtonConstraints);

        //÷ button
        JButton divisionButton = new JButton("÷");
        var divisionButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divisionButton.addActionListener(this);
        panel.add(divisionButton, divisionButtonConstraints);

        //= button
        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        //Clear button
        JButton clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        clearButton.addActionListener(this);
        panel.add(clearButton, clearButtonConstraints);

        //M+ button
        JButton memAddButton = new JButton("M+");
        var memAddConstraints = new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memAddButton.addActionListener(this);
        panel.add(memAddButton, memAddConstraints);

        //M- button
        JButton memSubtractButton = new JButton("M-");
        var memSubtractConstraints = new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memSubtractButton.addActionListener(this);
        panel.add(memSubtractButton, memSubtractConstraints);

        //MR button
        JButton memRecallButton = new JButton("MR");
        var memRecallConstraints = new GridBagConstraints(2, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memRecallButton.addActionListener(this);
        panel.add(memRecallButton, memRecallConstraints);

        //MC button
        JButton memClearButton = new JButton("MC");
        var memClearConstraints = new GridBagConstraints(3, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        memClearButton.addActionListener(this);
        panel.add(memClearButton, memClearConstraints);

        setPreferredSize(new Dimension(400, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new DecimalCalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = displayLabel.getText();
        String prevText = theCalculator.getPreviousNumber();
        if (text!=null) {
            if (text.contains("R")) {
                text = text.substring(0, text.indexOf("R"));
            }
        }
        if(prevText != null) {
            if (prevText.contains("R")) {
                theCalculator.setPreviousNumber(theCalculator.getPreviousNumber().substring(0, prevText.indexOf("R")));
            }
        }
        if (((JButton) e.getSource()).getText().equals("=")) {
            if(theCalculator.getSymbol() == "+"){
                theCalculator.addDecimal(text);
                displayLabel.setText(theCalculator.getMainNumber());
            }else if(theCalculator.getSymbol() == "-"){
                theCalculator.subtractDecimal(text);
                displayLabel.setText(theCalculator.getMainNumber());
            }else if(theCalculator.getSymbol() == "x"){
                theCalculator.multiplyDecimal(text);
                displayLabel.setText(theCalculator.getMainNumber());
            }else if(theCalculator.getSymbol() == "÷"){
                theCalculator.divideDecimal(text);
                displayLabel.setText(theCalculator.getMainNumber());
                theCalculator.resetMainNumber();
            }
        }
        else if(((JButton) e.getSource()).getText().equals("C")) {
            theCalculator.resetMainNumber();
            theCalculator.resetPreviousNumber();
            displayLabel.setText("0");
        }else if(((JButton) e.getSource()).getText().equals("MR")){
            displayLabel.setText(theCalculator.getMemoryNumber());
        }else if(((JButton) e.getSource()).getText().equals("MC")){
            theCalculator.setMemoryNumber("0");
        }else if(theCalculator.getSymbol() == "M+"){
            theCalculator.addMemoryNumber(prevText);
        }else if(theCalculator.getSymbol() == "M-"){
            theCalculator.subtractMemoryNumber(prevText);
        }
        else{
            theCalculator.setSymbol(((JButton) e.getSource()).getText());
            theCalculator.storeAndResetMainNumber();
            displayLabel.setText(theCalculator.getMainNumber());
            displayLabel.setText(theCalculator.symbol);
        }
    }
}