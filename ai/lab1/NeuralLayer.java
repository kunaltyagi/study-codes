import java.util.ArrayList;

class NeuralLayer{
    ArrayList<Perceptron> level;

    public NeuralLayer(int n){
        level = new ArrayList<Perceptron>(n);
        for(int i=0; i<n; ++i){
            level.add(Perceptron(Vector2D(0),Vector2D(0),0));
        }
    }

    public NeuralLayer(ArrayList<Perceptron> levels){
        n=levels.size();
        level = new ArrayList<Perceptron>(n);
        for(int i=0; i<n; ++i){
            level.add(Perceptron(levels.x, levels.w, levels.threshold));
        }
    }
}
