/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kafferslang;

import environment.Environment;
import environment.Grid;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author danielsenekal
 */
class SnakeEnvironment extends Environment{
    Grid grid;
    
    public SnakeEnvironment() {
    }

    @Override
    public void initializeEnvironment() {
        this.grid = new Grid();
    }

    @Override
    public void timerTaskHandler() {
    
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (this.grid != null){
            this.grid.paintComponent(graphics);
        }
    }
    
}
