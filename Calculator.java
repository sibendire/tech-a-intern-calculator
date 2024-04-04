import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    int c,n;
    String string1,string2,string3,string4,string5;
    Frame frame;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqu,buttonClr,buttonDot,buttonPer;
    Panel panel;
    TextField textField;
    GridLayout gridLayout;
    Calculator() {
        frame = new Frame("calculator");
        frame.setLayout(new FlowLayout());
        panel = new Panel();

        button0 = new Button("0");
        button0.addActionListener(this);

        button1 = new Button("1");
        button1.addActionListener(this);

        button2 = new Button("2");
        button2.addActionListener(this);

        button3 = new Button("3");
        button3.addActionListener(this);

        button4 = new Button("4");
        button4.addActionListener(this);

        button5 = new Button("5");
        button5.addActionListener(this);

        button6 = new Button("6");
        button6.addActionListener(this);

        button7 = new Button("7");
        button7.addActionListener(this);

        button8 = new Button("8");
        button8.addActionListener(this);

        button9 = new Button("9");
        button9.addActionListener(this);

        buttonAdd = new Button("+");
        buttonAdd.addActionListener(this);

        buttonSub = new Button("-");
        buttonSub.addActionListener(this);

        buttonDiv = new Button("/");
        buttonDiv.addActionListener(this);

        buttonMulti = new Button("X");
        buttonMulti.addActionListener(this);

        buttonPer = new Button("%");
        buttonPer.addActionListener(this);

        buttonDot = new Button(".");
        buttonDot.addActionListener(this);

        buttonEqu = new Button("=");
        buttonEqu.addActionListener(this);

        buttonClr = new Button("CL");
        buttonClr.addActionListener(this);

        textField = new TextField(20);
        frame.add(textField);

        gridLayout = new GridLayout(4,6);
        panel.setLayout(gridLayout);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(buttonAdd);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(buttonDot);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonDiv);
        panel.add(buttonMulti);
        panel.add(buttonSub);
        panel.add(buttonPer);
        panel.add(buttonClr);
        panel.add(buttonEqu);

        frame.add(panel);
        frame.setSize(200,180);
        frame.setVisible(true);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==button0){
         string3 = textField.getText();
         string4 = "0";
         string5 = string3 + string4;
         textField.setText(string5);
     }
        if (e.getSource()==button1){
            string3 = textField.getText();
            string4 = "1";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button2){
            string3 = textField.getText();
            string4 = "2";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button3){
            string3 = textField.getText();
            string4 = "3";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button4){
            string3 = textField.getText();
            string4 = "4";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button5){
            string3 = textField.getText();
            string4 = "5";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button6){
            string3 = textField.getText();
            string4 = "6";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button7){
            string3 = textField.getText();
            string4 = "7";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button8){
            string3 = textField.getText();
            string4 = "8";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==button9){
            string3 = textField.getText();
            string4 = "9";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==buttonAdd){
            string1=textField.getText();
            textField.setText("");
            c = 1;

        }
        if (e.getSource()==buttonMulti){
            string1=textField.getText();
            textField.setText("");
            c = 2;

        }
        if (e.getSource()==buttonDiv){
            string1=textField.getText();
            textField.setText("");
            c = 3;

        }
        if (e.getSource()==buttonSub){
            string1=textField.getText();
            textField.setText("");
            c = 4;

        }
        if (e.getSource()==buttonEqu){
            string2 = textField.getText();
            if (c == 1){
                n = Integer.parseInt(string1) + Integer.parseInt(string2);
                textField.setText(String.valueOf(n));
            }
            if (c == 2){
                n = Integer.parseInt(string1) * Integer.parseInt(string2);
                textField.setText(String.valueOf(n));
            }
            if (c == 3){
                n = Integer.parseInt(string1) / Integer.parseInt(string2);
                textField.setText(String.valueOf(n));
            }
            if (c == 4){
                n = Integer.parseInt(string1) - Integer.parseInt(string2);
                textField.setText(String.valueOf(n));
            }
        }
        if (e.getSource()==buttonClr){
            textField.setText("");
        }
        if(e.getSource()==buttonDot){
            string3 = textField.getText();
            string4=".";
            string5 = string3 + string4;
            textField.setText(string5);
        }
        if (e.getSource()==buttonPer){
            string3 = textField.getText();
            double num = Double.parseDouble(string3);
            double result = num/100.0;
            textField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
         Calculator  calculator = new  Calculator ();
    }
}
