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

    public CalcForm() {
        this.prepareGUI();
    }

    private void prepareGUI() {
        this.mainFrame = new JFrame("Quick Adding Machine");
        this.mainFrame.setLayout(new GridBagLayout());
        this.mainFrame.setSize(600, 600);

        this.mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        this.prepareTopRow();
        this.prepareCentralRow();
        this.prepareBottomRow();

        this.mainFrame.setVisible(true);
    }

    private void prepareTopRow() {
        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel headerPanel = new JPanel(new GridBagLayout());
        headerPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "top"));

        this.prepareTopRowContent(headerPanel);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1;

        this.mainFrame.add(headerPanel, gbc);
    }

    private void prepareTopRowContent(JPanel headerPanel)
    {
        JLabel headerLabel = new JLabel("some text with instructions", JLabel.LEFT);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        headerPanel.add(headerLabel, gbc);
    }

    private void prepareCentralRow() {
        this.prepareCentralLeftBlock();
        this.prepareCentralRightBlock();
    }

    private void prepareCentralLeftBlock() {
        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "center left"));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 0.5;
        this.mainFrame.add(leftPanel, gbc);
    }

    private void prepareCentralRightBlock() {
        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "center right"));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0.5;
        this.mainFrame.add(rightPanel, gbc);
    }

    private void prepareBottomRow() {
        Border eBorder = BorderFactory.createEtchedBorder();
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel footerPanel = new JPanel();
        footerPanel.setBorder(BorderFactory.createTitledBorder(eBorder, "bottom"));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        this.mainFrame.add(footerPanel, gbc);
    }

}
