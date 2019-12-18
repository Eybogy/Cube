public class Facet {
    private R3Vector[] vertex;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        vertex = new R3Vector[]{v1, v2, v3, v4};
    }

    public void TurnOX(double angel) {
        vertex[0].rotateOX(angel);
        vertex[1].rotateOX(angel);
        vertex[2].rotateOX(angel);
        vertex[3].rotateOX(angel);
    }
    public void TurnOY(double angel) {
        vertex[0].rotateOY(angel);
        vertex[1].rotateOY(angel);
        vertex[2].rotateOY(angel);
        vertex[3].rotateOY(angel);
    }
    public void TurnOZ(double angel) {
        vertex[0].rotateOZ(angel);
        vertex[1].rotateOZ(angel);
        vertex[2].rotateOZ(angel);
        vertex[3].rotateOZ(angel);
    }

    public void Turn(double angelX, double angelY, double angelZ) {
        TurnOX(angelX);
        TurnOY(angelY);
        TurnOZ(angelZ);
    }

    public void Scaling(double x){
        vertex[0].mult(x);
        vertex[1].mult(x);
        vertex[2].mult(x);
        vertex[3].mult(x);
    }

}