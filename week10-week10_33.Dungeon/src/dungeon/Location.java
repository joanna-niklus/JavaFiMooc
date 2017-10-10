package dungeon;

public class Location {
    private int xCoord;
    private int yCoord;
    private int length;
    private int height;

    public Location(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void setBoundaries(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void makeMove(char c) {
        if (c == 'w') {
            if (yCoord - 1 >= 0) {
                this.yCoord--;
            }
        } else if (c == 's') {
            if (yCoord + 1 < height) {
                this.yCoord++;
            }
        } else if (c == 'a') {
            if (xCoord - 1 >= 0) {
                this.xCoord--;
            }
        } else if (c == 'd') {
            if (xCoord + 1 < length) {
                this.xCoord++;
            }
        }
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    @Override
    public String toString() {
        return this.xCoord + " " + this.yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (xCoord != location.xCoord) return false;
        return yCoord == location.yCoord;
    }

    @Override
    public int hashCode() {
        int result = xCoord;
        result = 31 * result + yCoord;
        return result;
    }
}
