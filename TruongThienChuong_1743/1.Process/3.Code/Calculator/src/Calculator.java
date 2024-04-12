import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JTextField num1Field;
    private JTextField num2Field;
    private JTextField num3Field;
    private JTextField resultField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;

    public Calculator() {
        setTitle("Máy tính");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(createVerticalPanel());
        pack();
        setVisible(true);
    }

    private JPanel createVerticalPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Số thứ nhất : "));
        panel.add(num1Field = new JTextField(20));
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Số thứ hai : "));
        panel.add(num2Field = new JTextField(20));
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Số thứ ba : "));
        panel.add(num3Field = new JTextField(20));
        panel.add(Box.createVerticalStrut(10));

        panel.add(new JLabel("Kết quả: "));
        panel.add(resultField = new JTextField(20));
        resultField.setEditable(false);
        panel.add(Box.createVerticalStrut(10));

        // Thêm các nút với khoảng cách dọc giữa chúng
        panel.add(addButton = new JButton("Cộng"));
        panel.add(Box.createVerticalStrut(10));

        panel.add(subtractButton = new JButton("Trừ"));
        panel.add(Box.createVerticalStrut(10));

        panel.add(multiplyButton = new JButton("Nhân"));
        panel.add(Box.createVerticalStrut(10));

        panel.add(divideButton = new JButton("Chia"));
        panel.add(Box.createVerticalStrut(10));

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double result = 0;

        try {
            num1 = Double.parseDouble(num1Field.getText());
            num2 = Double.parseDouble(num2Field.getText());
            num3 = Double.parseDouble(num3Field.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Hãy nhập một số", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (e.getSource() == addButton) {
            result = num1 + num2 + num3;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2 - num3;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2 * num3;
        } else if (e.getSource() == divideButton) {
            if (num2 == 0|| num3 == 0) {
                JOptionPane.showMessageDialog(null, "Lỗi chia cho 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            result = num1 / num2;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
