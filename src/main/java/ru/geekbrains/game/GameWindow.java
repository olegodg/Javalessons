package ru.geekbrains.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GameWindow extends JFrame {
    private JLabel label;
    private int randomNumber;
    private int count;

    public GameWindow() {
        this.randomNumber = (int) (Math.random() * 10) + 1;
        setTitle("Игра: угадай число");
        setBounds(100, 100, 700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.NORTH);
        Font font = new Font("TimesNewRoman", Font.PLAIN, 16);
        label.setText("Компьютер загадал число от 1 до 10");
        label.setFont(font);
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        buttonsPanel.setPreferredSize(new Dimension(600, 20));
        add(buttonsPanel, BorderLayout.CENTER);
        for (int i = 1; i <= 10; i++) {
            //if (getCount()<2) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            //button.setPreferredSize(new Dimension(20,20));
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count <= 2) {
                        tryToAnswer(buttonIndex);
                        count++;
                    } else {
                        label.setText("ИГРА ОКОНЧЕНА");
                        return;
                    }
                }
            });
        }
        JButton buttonRestart = new JButton("Restart");
        add(buttonRestart,BorderLayout.SOUTH);
        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new GameWindow(); как один из вариантов
                randomNumber = (int) (Math.random() * 10) + 1;
                count=0;
               label.setText("ИГРА НАЧАЛАСЬ!!!");
            }
        });
        setVisible(true);
    }
    public void tryToAnswer(int answer){
        if (answer==randomNumber){
            label.setText("Вы выиграли!!!");
        }
        else if (answer>randomNumber){
            count++;
            label.setText("Вы проиграли, загаданное число меньше " + answer);
        }
        else {
            count++;
            label.setText("Вы проиграли, загаданное число больше " + answer);
        }
    }

    public int getCount() {
        return count;
    }
}
