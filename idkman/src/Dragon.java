public class Dragon extends Enemy{

    Dragon(){
        super(20,1000,"Godzilla");
    }

    @Override
    public void update(){
        System.out.println(name + " destroys a random city because he is in a bad mood!");
    }

    @Override
    public void attack(){
        System.out.println(name + " blows the city on fire");
    }
}
