// SPDX-License-Identifier: GPL-3.0-or-later

package de.sesu8642.feudaltactics.menu.statistics.ui;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import de.sesu8642.feudaltactics.dagger.VersionProperty;
import de.sesu8642.feudaltactics.menu.common.ui.Slide;

/** Factory for the slide displayed in the About Menu Option. */
@Singleton
public class  StatisticsGameFactory{

    private Skin skin;
    private String version;

    /**
     * Constructor.
     *
     * @param version game version
     * @param skin    game skin
     */
    @Inject
    public StatisticsGameFactory(@VersionProperty String version, Skin skin) {
        this.version = version;
        this.skin = skin;
    }

    /**
     *
     * Creates the Statistics Page.
     *
     * @return Statistics slides
     */
    public Slide createStatisticsGame() {
        String text1 = "by Sesu8642\nVersion " + version;
        //add text for values statitics page
        String text2 = "number of maps generated: ";
        String text3 = "number of maps started: ";
        String text4 = "number of games won: ";
        String text5 = "number of games lost: ";
        String text6 = "number of games exited before winning or losing: ";
        String text7 = "seed played the most: ";
        String imagePath = "square_logo_64.png";
        Slide slide = new Slide(skin, "Statistics Game FeudalTactics");
        slide.getTable().add(new Image(new Texture(imagePath))).row();
        slide.getTable().add(slide.newNiceLabel(text1)).center().row();
        slide.addLabel(text2);
        slide.addLabel(text3);
        slide.addLabel(text4);
        slide.addLabel(text5);
        slide.addLabel(text5); 
        slide.addLabel(text6);
        slide.addLabel(text7);
        return slide;
    }

}

