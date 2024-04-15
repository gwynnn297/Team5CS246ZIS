import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JMenuItem addMenuItem;
    private JMenuItem subtractMenuItem;
    private JMenuItem multiplyMenuItem;
    private JMenuItem divideMenuItem;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu operationMenu = new JMenu("Phép tính");
        setLocationRelativeTo(null);

        addMenuItem = new JMenuItem("Cộng");
        subtractMenuItem = new JMenuItem("Trừ");
        multiplyMenuItem = new JMenuItem("Nhân");
        divideMenuItem = new JMenuItem("Chia");

        operationMenu.add(addMenuItem);
        operationMenu.add(subtractMenuItem);
        operationMenu.add(multiplyMenuItem);
        operationMenu.add(divideMenuItem);

        menuBar.add(operationMenu);
        setJMenuBar(menuBar);

        addMenuItem.addActionListener(this);
        subtractMenuItem.addActionListener(this);
        multiplyMenuItem.addActionListener(this);
        divideMenuItem.addActionListener(this);

        setSize(550, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addMenuItem) {
            createOperationFrame("Cộng", "+");
        } else if (e.getSource() == subtractMenuItem) {
            createOperationFrame("Trừ", "-");
        } else if (e.getSource() == multiplyMenuItem) {
            createOperationFrame("Nhân", "*");
        } else if (e.getSource() == divideMenuItem) {
            createOperationFrame("Chia", "/");
        }
    }

    private void createOperationFrame(String title, String operation) {
        JFrame operationFrame = new JFrame(title);
        operationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        ImageIcon image = new ImageIcon("logo.png");
        getGraphics().drawImage(image.getImage(), 0, 0,550,400, null);


        panel.add(new JLabel("Số thứ nhất:"));
        JTextField num1Field = new JTextField(20);
        panel.add(num1Field);
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Số thứ hai:"));
        JTextField num2Field = new JTextField(20);
        panel.add(num2Field);
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Kết quả:"));
        JTextField resultField = new JTextField(20);
        resultField.setEditable(false);
        panel.add(resultField);
        panel.add(Box.createVerticalStrut(10));

        JButton calculateButton = new JButton("Tính");
        panel.add(calculateButton);

        calculateButton.addActionListener(event -> {
            double num1 = 0;
            double num2 = 0;
            double result = 0;

            try {
                num1 = Double.parseDouble(num1Field.getText());
                num2 = Double.parseDouble(num2Field.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(operationFrame, "Hãy nhập một số", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(operationFrame, "Lỗi chia cho 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            resultField.setText(String.valueOf(result));
        });

        operationFrame.add(panel);
        operationFrame.setSize(300, 200);
        operationFrame.setLocationRelativeTo(null);
        operationFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
