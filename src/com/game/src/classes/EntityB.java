package com.game.src.classes;

import java.awt.*;

/**
 * @author Philip Yu
 */
public interface EntityB {

    void tick();

    void render(Graphics g);

    Rectangle getBounds();

    double getX();

    double getY();

} // end interface Entity
