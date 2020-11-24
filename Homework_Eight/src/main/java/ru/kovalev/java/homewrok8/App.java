package ru.kovalev.java.homewrok8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public App() {
        final Plate plate1 = new Plate(50);
        final Cat[] cats = new Cat[5];
        cats[0] = new Cat("Рыжик", 20);
        cats[1] = new Cat("Барсик", 10);
        cats[2] = new Cat("Ася", 15);
        cats[3] = new Cat("Мурка", 5);
        cats[4] = new Cat("Блохастик", 20);
        setTitle("Накорми кота или познай их гнев!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        final JButton plate = new JButton("Доложить еды"); // Считается, что в пачке 15 еды, поэтому кол-ва будет фиксированное,
        // но я знаю как можно впихнуть сканнер
        JButton plateInfo = new JButton("Информация о тарелке");
        final JButton[] jbs = new JButton[cats.length];
        setLayout(new FlowLayout());
        for (int i = 0; i < jbs.length; i++) {
            jbs[i] = new JButton("Кот номер " + (i + 1));
            add(jbs[i]);
        }
        add(plate);
        add(plateInfo);
        jbs[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cats[0].eat(plate1);
            }
        });
        jbs[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cats[1].eat(plate1);
            }
        });
        jbs[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cats[2].eat(plate1);
            }
        });
        jbs[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cats[3].eat(plate1);
            }
        });
        jbs[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cats[4].eat(plate1);
            }
        });
        plate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                plate1.putFood(15);
            }
        });
        plateInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                plate1.info();
            }
        });

        setVisible(true);
    }
}
