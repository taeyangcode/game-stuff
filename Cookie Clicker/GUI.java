package com.jetbrains;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    final int screenX = 1280, screenY = 720;

    int cookieNumber = 0;

    int clickerAmount = 1, clickerIncrease = 1, clickerCost = 15;
    int grandmaAmount = 0, grandmaIncrease = 0, grandmaCost = 100;
    int retirementAmount = 0, retirementIncrease = 8, retirementCost = 1100;
    int armyAmount = 0, armyIncrease = 47, armyCost = 12000;

    boolean grandmaRun = false;
    boolean retirementRun = false;
    boolean armyRun = false;

    String playerName = "";
    String cookieAmount = "0";

    JFrame mainGui = new JFrame();

    JPanel welcomePanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel shopPanel = new JPanel();

    JLabel initialWelcome = new JLabel("Before beginning, please enter a name:", SwingConstants.CENTER);
    JLabel cookieCounter = new JLabel("Cookies: " + cookieAmount, SwingConstants.CENTER); // this is the counter for how many cookies the user currently has
    JLabel userName = new JLabel("Hello, " + playerName, SwingConstants.CENTER); // this is the area for the user's username they input in
    JLabel filler1 = new JLabel();
    JLabel filler2 = new JLabel();
    JLabel filler3 = new JLabel();
    JLabel filler4 = new JLabel();

    JButton enterGameButton = new JButton("Enter the Game!");
    JButton cookieClick = new JButton(""); // this is the label for the cookie we click on
    JButton shopButton = new JButton("Go to the Shop!"); // this takes us to the shop, probably some if statement and set visible etc.
    JButton gameButton = new JButton("Back to the Game!"); // this takes us back to the game

    JButton clickerUpgrade = new JButton("Clicker Upgrade");
    JButton grandmaUpgrade = new JButton("Grandma Upgrade");
    JButton retirementUpgrade = new JButton("Retirement Home Upgrade");
    JButton armyUpgrade = new JButton("Grandma's Army Upgrade");

    JTextArea userNameInput = new JTextArea("");

    JTextArea clickerInfo = new JTextArea("Amount: " + clickerAmount + "\nCookie Increase: " + clickerIncrease + "\nCost: " + clickerCost);
    JTextArea grandmaInfo = new JTextArea("Amount: " + grandmaAmount + "\nCookie Increase: " + grandmaIncrease + "\nCost: " + grandmaCost);
    JTextArea retirementInfo = new JTextArea("Amount: " + retirementAmount + "\nCookie Increase: " + retirementIncrease + "\nCost: " + retirementCost);
    JTextArea armyInfo = new JTextArea("Amount: " + armyAmount + "\nCookie Increase: " + armyIncrease + "\nCost: " + armyCost);

    Color backgroundColor = Color.decode("#F6F6F6");

    GridBagConstraints gameLayout = new GridBagConstraints();

    Font titleFont = new Font("MONOSPACED", Font.PLAIN, 48);
    Font mainFont = new Font("MONOSPACED", Font.PLAIN, 36);
    Font subtleFont = new Font("MONOSPACED", Font.PLAIN, 20);

    Border blackBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

    ImageIcon cookieImage = new ImageIcon("Images/cookie.png");

    public void guiConfig() {
        mainGui.setSize(screenX, screenY);
        mainGui.setTitle("Corey's Cookie Clicker");
        mainGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainGui.setResizable(false);

        welcomePanel.setSize(screenX, screenY);
        welcomePanel.setLayout(new GridLayout(3, 1));
        welcomePanel.setOpaque(true);
        welcomePanel.setBackground(backgroundColor);

        welcomePanel.add(initialWelcome);
        welcomePanel.add(userNameInput);
        welcomePanel.add(enterGameButton);

        initialWelcome.setFont(titleFont);

        userNameInput.setFont(mainFont);

        enterGameButton.setFont(titleFont);
        enterGameButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        playerName = userNameInput.getText();
                        userName.setText("Hello, " + playerName);
                        welcomePanel.setVisible(false);
                        gamePanel.setVisible(true);
                    }
                }
        );

        gamePanel.setSize(screenX, screenY);
        gamePanel.setLayout(new GridBagLayout());
        gamePanel.setOpaque(true);
        gamePanel.setBackground(backgroundColor);

        cookieCounter.setFont(mainFont);
        cookieCounter.setBorder(blackBorder);

        userName.setFont(mainFont);
        userName.setBorder(blackBorder);

        cookieClick.setIcon(cookieImage);
        cookieClick.setFocusPainted(false);
        cookieClick.setContentAreaFilled(false);
        cookieClick.setBorder(blackBorder);
        cookieClick.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cookieNumber += clickerIncrease;
                        cookieAmount = Integer.toString(cookieNumber);
                        cookieCounter.setText("Cookies: " + cookieNumber);
                    }
                }
        );

        shopButton.setFont(mainFont);
        shopButton.setFocusPainted(false);
        shopButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gamePanel.setVisible(false);
                        shopPanel.setVisible(true);
                    }
                }
        );

        shopPanel.setSize(screenX, screenY);
        shopPanel.setLayout(new GridLayout(5, 2));
        shopPanel.setOpaque(true);
        shopPanel.setBackground(backgroundColor);

        shopPanel.add(clickerInfo);
        shopPanel.add(clickerUpgrade);
        shopPanel.add(grandmaInfo);
        shopPanel.add(grandmaUpgrade);
        shopPanel.add(retirementInfo);
        shopPanel.add(retirementUpgrade);
        shopPanel.add(armyInfo);
        shopPanel.add(armyUpgrade);
        shopPanel.add(gameButton);

        clickerInfo.setEditable(false);
        clickerInfo.setLineWrap(true);
        clickerInfo.setFont(subtleFont);

        clickerUpgrade.setFont(mainFont);
        clickerUpgrade.setFocusPainted(false);
        clickerUpgrade.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(cookieNumber >= clickerCost) {
                            cookieNumber -= clickerCost;
                            clickerCost += (clickerCost * .15);
                            clickerAmount++;
                            clickerIncrease += 1;

                            clickerInfo.setText("Amount: " + clickerAmount + "\nCookie Increase: " + clickerIncrease + "\nCost: " + clickerCost);
                            cookieCounter.setText("Cookies: " + Integer.toString(cookieNumber));
                        }
                    }
                }
        );

        grandmaInfo.setEditable(false);
        grandmaInfo.setLineWrap(true);
        grandmaInfo.setFont(subtleFont);

        grandmaUpgrade.setFont(mainFont);
        grandmaUpgrade.setFocusPainted(false);
        grandmaUpgrade.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(cookieNumber >= grandmaCost) {
                            grandmaRun = true;
                            cookieNumber -= grandmaCost;
                            grandmaCost += (grandmaCost * .15);
                            grandmaAmount++;
                            grandmaIncrease += 1;

                            grandmaInfo.setText("Amount: " + grandmaAmount + "\nCookie Increase: " + grandmaIncrease + "\nCost: " + grandmaCost);
                            cookieCounter.setText("Cookies: " + Integer.toString(cookieNumber));
                        }
                    }
                }
        );

        retirementInfo.setEditable(false);
        retirementInfo.setLineWrap(true);
        retirementInfo.setFont(subtleFont);

        retirementUpgrade.setFont(mainFont);
        retirementUpgrade.setFocusPainted(false);
        retirementUpgrade.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(cookieNumber >= retirementCost) {
                            retirementRun = true;
                            cookieNumber -= retirementCost;
                            retirementCost += (retirementCost * .15);
                            retirementAmount++;
                            retirementIncrease += 8;

                            retirementInfo.setText("Amount: " + retirementAmount + "\nCookie Increase: " + retirementIncrease + "\nCost: " + retirementCost);
                            cookieCounter.setText("Cookies: " + Integer.toString(cookieNumber));
                        }
                    }
                }
        );

        armyInfo.setEditable(false);
        armyInfo.setLineWrap(true);
        armyInfo.setFont(subtleFont);

        armyUpgrade.setFont(mainFont);
        armyUpgrade.setFocusPainted(false);
        armyUpgrade.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(cookieNumber >= armyCost) {
                            armyRun = true;
                            cookieNumber -= armyCost;
                            armyCost += (armyCost * .15);
                            armyAmount++;
                            armyIncrease += 47;

                            armyInfo.setText("Amount: " + armyAmount + "\nCookie Increase: " + armyIncrease + "\nCost: " + armyCost);
                            cookieCounter.setText("Cookies: " + Integer.toString(cookieNumber));
                        }
                    }
                }
        );

        gameButton.setFont(mainFont);
        gameButton.setFocusPainted(false);
        gameButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        shopPanel.setVisible(false);
                        gamePanel.setVisible(true);
                    }
                }
        );
    }

    public void gameLabelPositioning() {
        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 0;
        gameLayout.gridwidth = 2;
        gameLayout.gridy = 0;
        gameLayout.weightx = 2.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(cookieCounter, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 2;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 0;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(userName, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 0;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 1;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(filler1, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 1;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 1;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(cookieClick, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 2;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 1;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(filler2, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 0;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 2;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(filler3, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 1;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 2;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(shopButton, gameLayout);

        gameLayout.fill = GridBagConstraints.HORIZONTAL;
        gameLayout.gridx = 2;
        gameLayout.gridwidth = 1;
        gameLayout.gridy = 2;
        gameLayout.weightx = 1.0;
        gameLayout.weighty = 1.0;
        gamePanel.add(filler4, gameLayout);
    }

    public void frameVisibility() {
        mainGui.add(welcomePanel);
        mainGui.add(gamePanel);
        mainGui.add(shopPanel);
        mainGui.setVisible(true);
        
        welcomePanel.setVisible(true);
        gamePanel.setVisible(false);
        shopPanel.setVisible(false);
    }

    public void upgradeIncreaser() {
        try {
            Thread.sleep(1000);
            if(grandmaRun == true) {
                cookieNumber += grandmaIncrease;
            }
            if(retirementRun == true) {
                cookieNumber += retirementIncrease;
            }
            if(armyRun == true) {
                cookieNumber += armyIncrease;
            }
            cookieCounter.setText("Cookies: " + Integer.toString(cookieNumber));
        }
        catch(InterruptedException e) {
            System.out.println("Error: 1337 - Tell Corey there was an issue and he'll try and fix it.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
