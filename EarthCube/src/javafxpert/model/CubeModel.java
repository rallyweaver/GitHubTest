/*
 * CubeModel.java
 * //Changed
 * //Another change
 * //A third change
 * //Fouth change
 * The model class for the EarthCubeFX proram
 * Note: This class was added since the original JavaFX 1.3.1 example, and
 *       there are more properties, etc. that should be moved into it.
 *
 * Developed by James L. Weaver (jim.weaver#javafxpert.com) to demonstrate the
 * use of 3D features in the JavaFX 2.0 API
 */
package javafxpert.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author Jim Weaver
 */
public class CubeModel {
  public static CubeModel instance;
  public DoubleProperty mapOpacity = new SimpleDoubleProperty(0);
}
