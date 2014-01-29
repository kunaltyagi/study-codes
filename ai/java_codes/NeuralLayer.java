import java.util.ArrayList;

class NeuralLayer{
    ArrayList<Perceptron> level;
    ArrayList<Integer> output;

    public NeuralLayer(int n){
        level = new ArrayList<Perceptron>(n);
        Perceptron p = Perceptron(Vector2D(0), Vector2D(0), 0);
        for(int i=0; i<n; ++i){
            level.add(p);
        }
    }

    public NeuralLayer(ArrayList<Perceptron> levels){
        n=levels.size();
        level = new ArrayList<Perceptron>(n);
        for(int i=0; i<n; ++i){
            level.add(Perceptron(levels.x, levels.w, levels.threshold));
        }
    }

    //@TODO: does Perceptron(x,w,th) work or does p suffice?
    public add(Perceptron p){
        level.add(Perceptron(p.x, p.w, p.threshold));
    }

    public compute(Vector2D
}
