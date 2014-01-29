import java.util.ArrayList;

class NeuralNetwork{
    //Assumption: full connectivity between any 2 consecutive levels
    ArrayList<NeuralLayer> network;

    public NeuralNetwork(ArrayList<NeuralLayer> world){
        int n = world.size();
        level = new ArrayList<NeuralLayer>(n);
        for(int i=0; i<n; ++i){
            v.add(world.get(i));
        }
    }
}
