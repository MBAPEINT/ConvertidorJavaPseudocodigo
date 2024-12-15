package proyectofinal;

import javax.swing.*;
import java.awt.*;

public class LineNumberedTextPanel extends JPanel {
    private JTextArea textArea;
    private JTextArea lineNumbers;
    
    public LineNumberedTextPanel(JTextArea textArea) {
        this.textArea = textArea;
        setLayout(new BorderLayout());
        
        lineNumbers = new JTextArea("1");
        lineNumbers.setBackground(Color.LIGHT_GRAY);
        lineNumbers.setEditable(false);
        lineNumbers.setFont(textArea.getFont());
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setRowHeaderView(lineNumbers);
        
        add(scrollPane, BorderLayout.CENTER);
        
        textArea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updateLineNumbers();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updateLineNumbers();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updateLineNumbers();
            }
        });
    }
    
    private void updateLineNumbers() {
        String text = textArea.getText();
        int lines = text.split("\n").length;
        StringBuilder numbers = new StringBuilder();
        for(int i = 1; i <= lines; i++) {
            numbers.append(i).append("\n");
        }
        lineNumbers.setText(numbers.toString());
    }
    
    public JTextArea getTextArea() {
        return textArea;
    }
} 