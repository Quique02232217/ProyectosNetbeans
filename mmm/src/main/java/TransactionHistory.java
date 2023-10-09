import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TransactionHistory extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JTextArea transactionHistoryTextArea;
    private JButton refreshButton;
    private ArrayList<String> transactionList;

    public TransactionHistory() {
        super("Transaction History");
        transactionList = new ArrayList<>();

        titleLabel = new JLabel("Transaction History");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(50, 20, 300, 30);
        add(titleLabel);

        transactionHistoryTextArea = new JTextArea();
        transactionHistoryTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(transactionHistoryTextArea);
        scrollPane.setBounds(50, 80, 300, 150);
        add(scrollPane);

        refreshButton = new JButton("Refresh");
        refreshButton.setBounds(150, 250, 100, 30);
        refreshButton.addActionListener(this);
        add(refreshButton);

        setLayout(null);
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == refreshButton) {
            refreshTransactionHistory();
        }
    }

    private void refreshTransactionHistory() {
        transactionHistoryTextArea.setText("");
        for (String transaction : transactionList) {
            transactionHistoryTextArea.append(transaction + "\n");
        }
    }

    public void addTransaction(String transaction) {
        transactionList.add(transaction);
    }

    public static void main(String[] args) {
        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.addTransaction("Transaction 1");
        transactionHistory.addTransaction("Transaction 2");
        transactionHistory.addTransaction("Transaction 3");
        transactionHistory.refreshTransactionHistory();
    }
}