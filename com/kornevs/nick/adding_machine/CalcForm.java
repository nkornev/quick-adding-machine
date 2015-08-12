package com.kornevs.nick.adding_machine;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by nick on 7/31/15.
 *
 * CalcForm class
 */
public class CalcForm {

    private JFrame mainFrame;
//    private JPanel controlPanel;
//    private JPanel bottomPanel;

    public CalcForm() {
        this.prepareGUI();
    }

    private void prepareGUI() {
        this.mainFrame = new JFrame("Quick Adding Machine");
        this.mainFrame.setLayout(new GridBagLayout());




        this.mainFrame.setSize(600, 600);
//        this.mainFrame.setLayout(new GridLayout(3, 1));

        JLabel headerLabel = new JLabel("some text with instructions", JLabel.CENTER);

        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
//        this.controlPanel = new JPanel();
//        this.controlPanel.setLayout(new FlowLayout());
//
//        this.bottomPanel = new JPanel();
//        this.bottomPanel.setLayout(new FlowLayout());

        this.prepareTopRow();

        this.mainFrame.setVisible(true);

//        this.prepareControlPanel();
    }

    private void prepareTopRow() {
        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel headerPanel = new JPanel();
        headerPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "80pct"));
        gbc.gridx = gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = gbc.weighty = 70;
        this.mainFrame.add(headerPanel, gbc);
    }

    private void prepareCentralRow() {

    }

    private void prepareControlPanel() {

        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();
//        this.mainFrame.setLayout(new GridBagLayout());



//        JPanel centralPanel = new JPanel();
//        centralPanel.setSize(500, 500);
//        centralPanel.setLayout(new GridBagLayout());

        JPanel centralPanelLeft = new JPanel();
//        centralPanelLeft.setSize(250, 500);
        centralPanelLeft.setBorder(BorderFactory.createTitledBorder(eBorder, "80pct"));
//        centralPanelLeft.setLayout(new GridBagLayout());

        JPanel centralPanelRight = new JPanel();
//        centralPanelRight.setSize(250, 500);
        centralPanelRight.setBorder(BorderFactory.createTitledBorder(eBorder, "20pct"));
//        centralPanelRight.setLayout(new GridBagLayout());

//        GridBagConstraints gbc = new GridBagConstraints();

//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.gridwidth = gbc.gridheight = 1;
//        gbc.fill = GridBagConstraints.BOTH;
//        gbc.anchor = GridBagConstraints.NORTHWEST;
//        gbc.weightx = gbc.weighty = 70;
        centralPanelLeft.add(new JLabel("Enter number:"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = gbc.weighty = 70;
        this.mainFrame.add(centralPanelLeft,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.mainFrame.add(centralPanelRight,gbc);

//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.ipady = 20;
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        panel.add(new JButton("Button 3"),gbc);
//
//        gbc.gridx = 1;
//        gbc.gridy = 1;
//        panel.add(new JButton("Button 4"),gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 2;
//        panel.add(new JButton("Button 5"),gbc);

//        this.controlPanel.add(centralPanel);

//        this.mainFrame.setVisible(true);
    }

}
