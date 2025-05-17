/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moviejavaapp;

/**
 *
 * @author Paola
 */

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Movie Manager");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen

        // Simple label for testing
        JLabel label = new JLabel("Hello from MainFrame!", SwingConstants.CENTER);
        add(label);
    }
}
