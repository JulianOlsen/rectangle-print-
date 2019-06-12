package rectangle;

public class rectangle {

    public static final double default_xPos = 0.0;
    public static final double default_yPos = 0.0;
    public static final double default_width = 1.0;
    public static final double default_height = 1.0;

    private double xPos;
    private double yPos;
    private double width;
    private double height;

    // construtors
    public rectangle() {
        this.xPos = default_xPos;
        this.yPos = default_yPos;
        this.width = default_width;
        this.height = default_height;
    }
    public rectangle(double xPos ) {
        this.xPos = xPos;
        this.yPos = default_yPos;
        this.width = default_width;
        this.height = default_height;
    }
    public rectangle(double xPos , double yPos ) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = default_width;
        this.height = default_height;
    }
    public rectangle(double xPos , double yPos , double width ) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = default_height;
    }

    public rectangle(double xPos , double yPos , double width , double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
    }

    public double getxPos() {
        return this.xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return this.yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public double getwidth() {
        return this.width;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getheight() {
        return this.height;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle (" + xPos + "," + yPos + ")-(" + (width + xPos) + "," + (height + yPos) + ")";
    }

    public double getarea() {
        return width * height;
    }

    public double getstars() {
        return (width + 1) * (height + 1);
    }

    public String printshape() {
        int i = 0;
        while (i < yPos) {
            System.out.println();
            ++i;
        }

        int iiii = 0;
        while (iiii < height + 1) {
            int ii = 0;
            while (ii < xPos) {
                System.out.print(" ");
                ++ii;
            }
            int iii = 0;
            while (iii < width) {
                System.out.print("* ");
                ++iii;
            }
            System.out.println("* ");
            ++iiii;

        }

        return "";
    }
}
