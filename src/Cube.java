import java.awt.*;

public class Cube {
    private Facet[] cubster;
    public Cube(Facet f1, Facet f2, Facet f3, Facet f4, Facet f5, Facet f6){
        cubster = new Facet[]{f1, f2, f3, f4, f5, f6};
    }

    public void RotationOX(double angel){
        cubster[0].TurnOX(angel);
        cubster[1].TurnOX(angel);
        cubster[2].TurnOX(angel);
        cubster[3].TurnOX(angel);
        cubster[4].TurnOX(angel);
        cubster[5].TurnOX(angel);
    }
    public void RotationOY(double angel){
        cubster[0].TurnOY(angel);
        cubster[1].TurnOY(angel);
        cubster[2].TurnOY(angel);
        cubster[3].TurnOY(angel);
        cubster[4].TurnOY(angel);
        cubster[5].TurnOY(angel);
    }
    public void RotationOZ(double angel){
        cubster[0].TurnOZ(angel);
        cubster[1].TurnOZ(angel);
        cubster[2].TurnOZ(angel);
        cubster[3].TurnOZ(angel);
        cubster[4].TurnOZ(angel);
        cubster[5].TurnOZ(angel);
    }

    public void RotationAll(double angelX, double angelY, double angelZ){       // Поворчаивает куб относително трёх осей
        RotationOX(angelX);
        RotationOY(angelY);
        RotationOZ(angelZ);
    }

    public void Scaling(double x){      // Маштабирование куба
        cubster[0].Scaling(x);
        cubster[1].Scaling(x);
        cubster[2].Scaling(x);
        cubster[3].Scaling(x);
        cubster[4].Scaling(x);
        cubster[5].Scaling(x);
    }

    public void draw(Graphics g) {

    }
}
