package application;

import javafx.scene.Scene;
import java.io.File;

public class Theme { private static boolean dark=false; public static boolean isDark(){return dark;} public static void setDark(boolean d){dark=d;} public static void apply(Scene scene){ scene.getStylesheets().clear(); File css=new File(dark?"resources/styles_dark.css":"resources/styles_light.css"); if(css.exists()) scene.getStylesheets().add(css.toURI().toString()); } }