package Monitor;

public abstract class Pc {

    private String attributes;

    private double modelNumber = 6789312;
    private String manufactureName = "Hp";
    private Object drawLogo;


    public String getAttributes() {
        return attributes;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public static int powerUp(int pressPowerButton, int drawLogo){


        return pressPowerButton = drawLogo;

    }

    public void drawPixel (String manufactureName, String color){
        this.manufactureName = manufactureName;
        drawPixel("hp","black");
    }

    @Override
    public String toString() {
        return "Pc{" +
                "attributes = '" + attributes + '\'' +
                ", modelNumber = " + modelNumber +
                ", manufactureName = '" + manufactureName + '\'' +
                ", drawLogo =" + drawLogo +
                '}';
    }
}
