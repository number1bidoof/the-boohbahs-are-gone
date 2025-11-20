public class Slime extends Enemy{

    Slime(){
        super(10,75,"The Goo monster");
    }

    @Override
    public void update(){
        System.out.println(name + " wiggles and bounces more and more aggressively");
    }

    @Override
    public void attack(){
        System.out.println(name+ " flings goo at you dealing ");
    }
}
